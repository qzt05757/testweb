package com.nec.jp.ce.m.hayakawa.rest.front;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nec.jp.ce.m.hayakawa.rest.ap.ApConfig;
import com.nec.jp.ce.m.hayakawa.rest.ap.core.ApCoreConfig;

public class FrontInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletCxt) throws ServletException {
		AnnotationConfigWebApplicationContext cxt = new AnnotationConfigWebApplicationContext();
		cxt.register(ApCoreConfig.class, ApConfig.class, FrontConfig.class);
		ServletRegistration.Dynamic servlet = servletCxt.addServlet("dispatcher", new DispatcherServlet(cxt));
		servlet.addMapping("/rest/*");
		servlet.setLoadOnStartup(1);			
	}
}
