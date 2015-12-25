package com.nec.jp.ce.m.hayakawa.rest.ap.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nec.jp.ce.m.hayakawa.rest.ap.domain.Person;

public interface IPersonRepository extends MongoRepository<Person, String> {
	public Person findByName(String name);
}
