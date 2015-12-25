package com.nec.jp.ce.m.hayakawa.rest.ap.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

@Configuration
@PropertySource("classpath:apcore/mongo.properties")
@ComponentScan(basePackages="com.nec.jp.ce.m.hayakawa.rest.ap")
public class ApCoreConfig {
	
	@Value("${mongo.host}")
	private String mongoHost;

	@Value("${mongo.db}")
	private String mongoDB;

	@Bean
	public MongoClientFactoryBean mongo() {
		MongoClientFactoryBean m = new MongoClientFactoryBean();
		m.setHost(mongoHost);
		return m;
	}
	
	@Bean
	public MongoTemplate mongoTemplate(Mongo mongo) {
		MongoTemplate template = new MongoTemplate(mongo, mongoDB);
		return template;		
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
