package com.ks.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {LoveCalculatorConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("==============================");
		// TODO Auto-generated method stub
		return new String[]{"/"};
	}

}
