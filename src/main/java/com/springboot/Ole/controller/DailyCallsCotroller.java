package com.springboot.Ole.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.Ole.Model.DailyCalls;

import com.springboot.Ole.repository.DailCallRepository;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class DailyCallsCotroller {
	
	@Autowired
	private DailCallRepository dailyRepository;
	
	@GetMapping("/dailyCalls/{exchange}")
	public List<DailyCalls> getAllCalls(@PathVariable String exchange){
		//return dailyRepository.getExchangeData(exchange);
		return dailyRepository.findAll();
	}
}
