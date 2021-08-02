package org.gestion.bp;

import org.gestion.bp.dao.ArticleRepository;
import org.gestion.bp.dao.CategorieRepository;
import org.gestion.bp.dao.MagazinRepository;
import org.gestion.bp.dao.UtilisateurRepository;
import org.gestion.bp.entities.Admin;
import org.gestion.bp.entities.Article;
import org.gestion.bp.entities.Categorie;
import org.gestion.bp.entities.Magazin;
import org.gestion.bp.entities.Ouvrier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionStockApplication implements CommandLineRunner{
	@Autowired
    private UtilisateurRepository ur;
	@Autowired
//    private AdminRepository ar;
//	@Autowired
//    private OuvrierRepository or;
//	@Autowired
//	private IUtilisateur igs;
//	@Autowired
	private MagazinRepository mr;
	@Autowired
	private CategorieRepository cr;
	@Autowired
	private ArticleRepository artr;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(GestionStockApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Admin u1=new Admin(1,123456, "nour", "guerfali", 21, "nourguerfali08@gmail.com", "123456789");
		Admin u2=new Admin(2,785213, "aya ","guerfali", 25, "aya@gmail.com", "1234567541");
		Admin u3=new Admin(3,978713, "hasna", "nkaies", 50, "HASNA@gmail.com", "123456789");
		Admin u4=new Admin(4,978713, "efsfrfna", "nksdqss", 50, "dsqsfA@gmail.com", "123545465789");
		Admin u5=new Admin(5,978713, "hfdsfna", "sdqfdqss", 50, "wfwdfw@gmail.com", "15654789");
		Admin u6=new Admin(15,234545, "lotfi", "sqdfqdqss", 50, "wfwdfw@gmail.com", "15654789");
		Admin u7=new Admin(16,955333, "aya", "ssqqss", 50, "wfwdfw@gmail.com", "15654789");
		Admin u8=new Admin(17,978713, "hfdsfna", "sdqfdqss", 50, "wfwdfw@gmail.com", "15654789");
		Ouvrier o1=new Ouvrier(8,32455, "maryem", "mokded", 22, "maryem@gmail.com", "5553456789");
		Ouvrier o2=new Ouvrier(9,12345, "hanin", "ben jemaa", 20, "hanin@gmail.com", "987654321");
		Ouvrier o3=new Ouvrier(12,12345, "hann", "bwvsdvsf", 20, "hanin@gmail.com", "987685551");
		Ouvrier o4=new Ouvrier(10,12345, "aaa", "sdqsfsa", 22, "hdvfsd@gmail.com", "95555554321");
		
		ur.save(u1);
		ur.save(u2);
		ur.save(u3);
		ur.save(u4);
		ur.save(u5);
		ur.save(u6);
		ur.save(u7);
		ur.save(u8);
		ur.save(o1);
		ur.save(o2);
		ur.save(o3);
		ur.save(o4);
		
		Magazin mg=new Magazin("magazin 1");
		mr.save(mg);
		Categorie c1=new Categorie("Article Consommé", "article a consomme");
		cr.save(c1);
		Categorie c2=new Categorie("Materiels", "Materiels");
		cr.save(c2);
//		Article a1=new Article(100, "pc", 10, 1, o1, mg, c2);
//		artr.save(a1);
//		Article a2=new Article(101, "imprimante", 15, 1, o1, mg, c2);
//		artr.save(a2);
//		Article a3=new Article(102, "stylo", 150, 2,o2 , mg, c1);
//		artr.save(a3);
		
		Article a4=new Article(102, "stylo", 150, 2, mg, c1);
		artr.save(a4);
		Article a3=new Article(103, "feutre", 150, 2, mg, c1);
	    artr.save(a3);
		
		
	}
}
