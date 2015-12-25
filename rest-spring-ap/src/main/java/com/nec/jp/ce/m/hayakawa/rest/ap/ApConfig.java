package com.nec.jp.ce.m.hayakawa.rest.ap;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@ComponentScan(basePackages="com.nec.jp.ce.m.hayakawa.rest.ap")
@EnableMongoRepositories(basePackages="com.nec.jp.ce.m.hayakawa.rest.ap")
public class ApConfig { }
