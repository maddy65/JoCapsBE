package com.springboot.Ole.controller;

import com.springboot.Ole.Model.Instrument;
import com.springboot.Ole.repository.InstrumentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

@RequestMapping("api/v1")
public class InstrumentController {
	@Autowired
	private InstrumentRepository instrumentRepo;
	
	@GetMapping("/instrument")
	public List<Instrument> getAllFAQ(){
		return instrumentRepo.findAll();
	}
}
