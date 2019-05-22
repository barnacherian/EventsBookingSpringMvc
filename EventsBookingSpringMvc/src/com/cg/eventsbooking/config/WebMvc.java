package com.cg.eventsbooking.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//WebMvc is dispatcher
@Configuration
@EnableWebMvc
@ComponentScan("com.cg.eventsbooking")
public class WebMvc implements WebMvcConfigurer			
{
	
	@Bean
	public InternalResourceViewResolver getAllViwe() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	
	
}
