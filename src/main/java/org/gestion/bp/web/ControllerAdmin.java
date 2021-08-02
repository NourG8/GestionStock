package org.gestion.bp.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeValueExp;
import javax.validation.Valid;

import org.gestion.bp.dao.AdminRepository;
import org.gestion.bp.dao.UtilisateurRepository;
import org.gestion.bp.entities.Admin;
import org.gestion.bp.entities.Ouvrier;
import org.gestion.bp.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class ControllerAdmin {
	@Autowired
	private AdminRepository or;

	
	
	 @GetMapping("/admins")
	    public List<Admin> getAllUtilisateurs() {
	        return or.findAll();
	    }

	    @GetMapping("/admins/{id}")
	    public ResponseEntity<Admin> getAdminById(@PathVariable(value = "id") int id)
	        throws ResourceNotFoundException {
	    	Admin utilisateur= or.findById(id).orElseThrow(() -> new ResourceNotFoundException("Admin not found for this id :: " + id));
	        return ResponseEntity.ok().body(utilisateur);
	    }
	    
	    @PostMapping("/admins")
	    public Admin createAdmin(@Valid @RequestBody Admin utilisateur) {
	        return or.save(utilisateur);
	    }

	    @PutMapping("/admins/{id}")
	    public ResponseEntity<Admin> updateAdmin(@PathVariable(value = "id") int id,
	         @Valid @RequestBody Admin utilisateurDetails) throws ResourceNotFoundException {
	    	Admin u = or.findById(id)
	        .orElseThrow(() -> new ResourceNotFoundException("Admin not found for this id :: " + id));

	    	u.setCin(utilisateurDetails.getCin());
	    	u.setNom(utilisateurDetails.getNom());
	    	u.setPrenom(utilisateurDetails.getPrenom());
	    	u.setAge(utilisateurDetails.getAge());
	    	u.setLogin(utilisateurDetails.getLogin());
	    	u.setPassword(utilisateurDetails.getPassword());
	    	u.setPhoto(utilisateurDetails.getPhoto());
	 
	        final Admin updatedAdmin = or.save(u);
	        return ResponseEntity.ok(updatedAdmin);
	    }

	    @DeleteMapping("/admins/{id}")
	    public Map<String, Boolean> deleteAdmin(@PathVariable(value = "id") int id)
	         throws ResourceNotFoundException {
	        Admin utilisateur= or.findById(id)
	       .orElseThrow(() -> new ResourceNotFoundException("Admin not found for this id :: " + id));

	        or.delete(utilisateur);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
	
}

