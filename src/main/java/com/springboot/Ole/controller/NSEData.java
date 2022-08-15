package com.springboot.Ole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Ole.repository.NSEDataRepository;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")

public class NSEData {
	
	@Autowired
	private NSEDataRepository nsedatarepository;

	@GetMapping("/nseData")
	public List<com.springboot.Ole.Model.NSEData> getNSEData(){
		return nsedatarepository.findAll();
	}
}
