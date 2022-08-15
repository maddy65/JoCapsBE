package com.springboot.Ole.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Ole.repository.CountryRepository;
import com.springboot.Ole.Model.CountryList;
import com.springboot.Ole.Model.Employee;


@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class CountryListController {
	
	@Autowired
	private CountryRepository countrylist;
	
	@GetMapping("/countrylist")
	public List<CountryList> getAllcountry(){
		return countrylist.findAll();
	}
	
}
