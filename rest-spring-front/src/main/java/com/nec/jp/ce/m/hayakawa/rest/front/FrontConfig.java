package com.nec.jp.ce.m.hayakawa.rest.front;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = "com.nec.jp.ce.m.hayakawa.rest.front.resources")
@EnableWebMvc
public class FrontConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry reg) {
		System.out.println("interceptor");
		reg.addInterceptor(new RequestInterceptor());
	}
}
