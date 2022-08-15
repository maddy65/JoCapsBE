package com.springboot.Ole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Ole.repository.TransictionRepository;
import com.springboot.Ole.Model.Transictions;
import java.util.List;
import com.springboot.Ole.repository.TransictionProjection;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class TransictionController {
	
	@Autowired
	private TransictionRepository transictionrepository;
	
	
	
	
	
	@GetMapping("/getTransictionData")
	public List<Transictions> getAllTransiction(){
		return transictionrepository.findAll();
	}
	
	
	
	@GetMapping("/getTransictionsAndInstruments/{id}")
	public List<TransictionProjection> getTransitionInstrument(@PathVariable Long id){
		return transictionrepository.getTransictionsAndInstruments(id);
	}
	
	@PostMapping("/saveData")
	public Transictions saveData(@RequestBody Transictions transiction) {
		return transictionrepository.save(transiction);
	}
}
