package com.example.demo.Util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateBeanSample {
	
	@Bean
	public Count getCount() {
		
		return new Count();
	}
}
