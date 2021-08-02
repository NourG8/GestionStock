package org.gestion.bp.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeValueExp;
import javax.validation.Valid;

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
public class ControllerUtilisateur {
	@Autowired
	private UtilisateurRepository or;
	
	
	 @GetMapping("/utilisateurs")
	    public List<Utilisateur> getAllUtilisateurs() {
	        return or.findAll();
	    }

	    @GetMapping("/utilisateurs/{id}")
	    public ResponseEntity<Utilisateur> getUtilisateurById(@PathVariable(value = "id") int id)
	        throws ResourceNotFoundException {
	    	Utilisateur utilisateur= or.findById(id).orElseThrow(() -> new ResourceNotFoundException("Utilisateur not found for this id :: " + id));
	        return ResponseEntity.ok().body(utilisateur);
	    }
	    
	    @PostMapping("/utilisateurs")
	    public Utilisateur createUtilisateur(@Valid @RequestBody Utilisateur utilisateur) {
	        return or.save(utilisateur);
	    }

	    @PutMapping("/utilisateurs/{id}")
	    public ResponseEntity<Utilisateur> updateUtilisateur(@PathVariable(value = "id") int id,
	         @Valid @RequestBody Utilisateur utilisateurDetails) throws ResourceNotFoundException {
	    	Utilisateur u = or.findById(id)
	        .orElseThrow(() -> new ResourceNotFoundException("Utilisateur not found for this id :: " + id));

	    	u.setCin(utilisateurDetails.getCin());
	    	u.setNom(utilisateurDetails.getNom());
	    	u.setPrenom(utilisateurDetails.getPrenom());
	    	u.setAge(utilisateurDetails.getAge());
	    	u.setLogin(utilisateurDetails.getLogin());
	    	u.setPassword(utilisateurDetails.getPassword());
	    	u.setPhoto(utilisateurDetails.getPhoto());
	 
	        final Utilisateur updatedUtilisateur = or.save(u);
	        return ResponseEntity.ok(updatedUtilisateur);
	    }

	    @DeleteMapping("/utilisateurs/{id}")
	    public Map<String, Boolean> deleteUtilisateur(@PathVariable(value = "id") int id)
	         throws ResourceNotFoundException {
	        Utilisateur utilisateur= or.findById(id)
	       .orElseThrow(() -> new ResourceNotFoundException("Utilisateur not found for this id :: " + id));

	        or.delete(utilisateur);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
	
}

