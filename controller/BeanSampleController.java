package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BeanSampleService;


@RestController
public class BeanSampleController {
	
	@Autowired
	private  BeanSampleService bss;
	
	@GetMapping("/index")
	public String beanSamplehandler() {
		
		bss.test();
		
		
		return "/index";
		
	}

}
