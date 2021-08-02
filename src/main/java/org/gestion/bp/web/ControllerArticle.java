//package org.gestion.bp.web;
//
//import org.gestion.bp.dao.ArticleRepository;
//import org.gestion.bp.entities.Admin;
//import org.gestion.bp.entities.Article;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class ControllerArticle {
//	@Autowired
//	private ArticleRepository ar;
//
//	
////	@RequestMapping("/ListArticle")
////	public String ListArticle(Model model) {	
////		model.addAttribute("listArticles",iA.getAllArticles());
////		System.out.println(iA.getAllArticles());
////		System.out.println("$$");
//////		model.addAttribute("article", new Article());
////		return "ListArticle";
////	}
//	
//	
//	@RequestMapping("/ListArticle")
//	public String ListArticle(Model model) {	
//		model.addAttribute("listArticles",iA.getAllArticles());
////		System.out.println(iA.getAllArticles());
////    	System.out.println("$$");
//		return "ListArticle";
//	}
//	
//	
//	@GetMapping("/showArticleForm")
//	public String showArticleForm(Model model) {
//		Article ar=new Article();
//		model.addAttribute("article",ar);
//		return "newArticle";
//	}
//
//	@PostMapping("/saveArticle")
//    public String saveArticle(@ModelAttribute("article") Article article) {
//		iA.saveArticle(article);
//		return "redirect:/ListArticle";
// 	}
//	
////	@GetMapping("/updateArticle/{code}")
////	public String updateArticle(@PathVariable(value="code") Integer code,Model model) {
////		Article article=ia.getArticle(code);
////		model.addAttribute("article",article);
////		return "updateArticle";
////	}
////	
////	@GetMapping("/deleteArticle/{code}")
////	public String deleteArticle(@PathVariable(value="code") Integer code) {
////		this.ia.deleteArticle(code);
////		return "redirect:/ListArticle";
////	}
////	
//	
//}
