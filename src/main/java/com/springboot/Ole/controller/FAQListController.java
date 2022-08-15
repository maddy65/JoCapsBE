package com.springboot.Ole.controller;


import com.springboot.Ole.Model.FAQList;
import com.springboot.Ole.repository.FAQ;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

@RequestMapping("api/v1")

public class FAQListController {
	@Autowired
	private FAQ faqRepo;
	
	@GetMapping("/Faq")
	public List<FAQList> getAllFAQ(){
		return faqRepo.findAll();
	}
	
}
