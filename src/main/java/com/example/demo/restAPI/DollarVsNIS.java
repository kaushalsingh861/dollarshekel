package com.example.demo.restAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class DollarVsNIS {

	@RequestMapping("/dollarvsnis")
	public String dollarVsNIS(){
		
	return "3.49";
	}
	
	@RequestMapping("/nisvsdollar")
	public String NISvsdollar(){
		return "0.29";
	}
	
}
