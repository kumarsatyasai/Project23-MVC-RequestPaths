package com.nt.controller;

import java.util.Map;   

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ISeasonFinder;

@Controller
public class SeasonFinderController {
	
	@Autowired
	private ISeasonFinder sf;
	
	//@RequestMapping("/")
	// Default Request Path For Every Handler Method Is / [Slash]
	// Default Is Get Mode.
	//@RequestMapping()
	@GetMapping()
	public String showHomePage()
	{
		return "welcome";
	}
	@PostMapping()
	public String showHomePage1()
	{
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String showSeason(Map<String,Object> map)
	{
		String seasonName = sf.findSeason();
		map.put("seasonNameFinal", seasonName);
		return "display";
	}
	
	@RequestMapping("/report1")
	public String showReport1()
	{
		System.out.println("SeasonFinderController.showReport1()");
		return "report1";
	}
	
	// Note : Request Paths Are Case Sensitive.

	@RequestMapping("/REPORT1")
	public String showReport2()
	{
		System.out.println("SeasonFinderController.showReport2()");
		return "report2";
	}
	
	// Note: One Handler Method Can Handle Multiple Request Paths.
	
	@RequestMapping({"/report1","/report3","report5"})
	public String showReport3()
	{
		System.out.println("SeasonFinderController.showReport3()");
		return "report1";
	}
}
