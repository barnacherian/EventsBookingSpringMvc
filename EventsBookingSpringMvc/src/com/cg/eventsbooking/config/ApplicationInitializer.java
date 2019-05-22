package com.cg.eventsbooking.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//this replaces web.xml 
public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer   
{
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AppContext.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {WebMvc.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"} ;
	}
}