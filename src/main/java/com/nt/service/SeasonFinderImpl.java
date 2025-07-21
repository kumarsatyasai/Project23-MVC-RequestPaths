package com.nt.service;

import java.time.LocalDate; 

import org.springframework.stereotype.Service;

@Service("sf")
public class SeasonFinderImpl implements ISeasonFinder {

	@Override
	public String findSeason() {
		LocalDate ld = LocalDate.now();
		int month = ld.getMonth().getValue();
		if(month >= 3 && month <=6)
			return "Summer";
		else if(month >=7 && month <=10)
			return "Rainy";
		else 
			return "Winter";
	}

}
