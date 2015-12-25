package com.nec.jp.ce.m.hayakawa.rest.ap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nec.jp.ce.m.hayakawa.rest.ap.dao.IPersonRepository;
import com.nec.jp.ce.m.hayakawa.rest.ap.domain.Person;

@Component @Scope("singleton")
public class PersonService implements IPersonService {
	private static final Person P = new Person("taro", 36);

	@Autowired private IPersonRepository personRepo;
	
	@Override
	public Person getPerson() {
		return P;
	}
	
	@Override
	public void regist(Person p) {
		personRepo.insert(p);
	}

	@Override
	public Person find(String name) {
		return personRepo.findByName(name);
	}
	
	@Override
	public List<Person> findAll() {
		return personRepo.findAll();
	}
	
}
