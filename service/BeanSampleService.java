package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Util.Count;

//
@Component
public class BeanSampleService {
	
	@Autowired
	Count count;

	public void test() {
		
		System.out.println(count.getCount());
	}
 }
