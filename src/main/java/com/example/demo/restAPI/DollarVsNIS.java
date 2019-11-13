package com.example.demo.restAPI;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class DollarVsNIS {

	@RequestMapping("/dollarvsnis")
	public String dollarVsNIS(){
		 
		Double num = Math.random() + 0.1+ 3;
		
		return num.toString();
	}
	
	@RequestMapping("/nisvsdollar")
	public String NISvsdollar(){
		return "0.29";
	}
	
}
