package com.fitinsure.fitinsureservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuranceQuoteService {
	
	/*
	 * Weighting system: Lower scores get better rates.
	 * 
	 * Example tiers 0 - 5 6 - 10 11 - 15 16 - 20 21+ - uninsurable
	 * 
	 * 
	 * Non-customer{ Wants insurance{ No{ } Yes{ Are you in good health? { Yes : 0
	 * 
	 * No { : 1
	 * 
	 * Do you have cancer? { Yes: 1 No: 0 } Do you have high blood pressure? { Yes:
	 * 1 No: 0 } Do you have high cholesterol? { Yes: 1 No: 0 } Do you regularly
	 * take medication? { Yes: { What condition does it treat? { Blood pressure: 1
	 * Cholesterol: 1 Seizures: 1 Pain: 1 } } No : 0 } } } Are you a smoker { No : 0
	 * Yes: 3 } Do you exercise regularly { Yes : 0 No : 2 }
	 * 
	 * } }
	 * 
	 * }
	 */
	
	/**
	 * @Variables
	
	isCustomerwantAQuoteOnHealthInsurance
	isASmokeronRegularExercise
	isAllOverHealthGood
	if isAllOverHealthGood == FALSE  
	  isCancer  
	  isHighBP  
	  isHighCholesterol  
	  onRegularMedication    
	    if onRegularMedication=TRUE        
	     isMedForHighBP        
	     isMedForHighCholesterol        
	     isMedForSeizures        
	     isMedForPain  
	     
	      
	  */ 
	
	public static String isCustomerwantAQuoteOnHealthInsurance = "new";
	public static String isASmokeronRegularExercise = "yes";
	public static String isAllOverHealthGood = "no";

	@GetMapping("/generateQuote")
	public String getMyQuote() {
		return "Returning Quote Here";
	}

}
