package com.sachin.spring_boot.learning_springboot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveService(){
		return configuration;
				
				
	}
	
}
