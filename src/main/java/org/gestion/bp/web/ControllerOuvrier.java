package org.gestion.bp.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeValueExp;
import javax.validation.Valid;

import org.gestion.bp.dao.AdminRepository;
import org.gestion.bp.dao.OuvrierRepository;
import org.gestion.bp.dao.UtilisateurRepository;
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
public class ControllerOuvrier {
	@Autowired
	private OuvrierRepository or;

	
	
	 @GetMapping("/ouvriers")
	    public List<Ouvrier> getAllOuvriers() {
	        return or.findAll();
	    }

	    @GetMapping("/ouvriers/{id}")
	    public ResponseEntity<Ouvrier> getAdminById(@PathVariable(value = "id") int id)
	        throws ResourceNotFoundException {
	    	Ouvrier utilisateur= or.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ouvrier not found for this id :: " + id));
	        return ResponseEntity.ok().body(utilisateur);
	    }
	    
	    @PostMapping("/ouvriers")
	    public Ouvrier createOuvrier(@Valid @RequestBody Ouvrier utilisateur) {
	        return or.save(utilisateur);
	    }

	    @PutMapping("/ouvriers/{id}")
	    public ResponseEntity<Ouvrier> updateOuvrier(@PathVariable(value = "id") int id,
	         @Valid @RequestBody Ouvrier utilisateurDetails) throws ResourceNotFoundException {
	    	Ouvrier u = or.findById(id)
	        .orElseThrow(() -> new ResourceNotFoundException("Ouvrier not found for this id :: " + id));

	    	u.setCin(utilisateurDetails.getCin());
	    	u.setNom(utilisateurDetails.getNom());
	    	u.setPrenom(utilisateurDetails.getPrenom());
	    	u.setAge(utilisateurDetails.getAge());
	    	u.setLogin(utilisateurDetails.getLogin());
	    	u.setPassword(utilisateurDetails.getPassword());
	    	u.setPhoto(utilisateurDetails.getPhoto());
	 
	        final Ouvrier updatedOuvrier = or.save(u);
	        return ResponseEntity.ok(updatedOuvrier);
	    }

	    @DeleteMapping("/ouvriers/{id}")
	    public Map<String, Boolean> deleteAdmin(@PathVariable(value = "id") int id)
	         throws ResourceNotFoundException {
	        Ouvrier utilisateur= or.findById(id)
	       .orElseThrow(() -> new ResourceNotFoundException("Ouvrier not found for this id :: " + id));

	        or.delete(utilisateur);
	        Map<String, Boolean> response = new HashMap<>();
	        response.put("deleted", Boolean.TRUE);
	        return response;
	    }
	
}

