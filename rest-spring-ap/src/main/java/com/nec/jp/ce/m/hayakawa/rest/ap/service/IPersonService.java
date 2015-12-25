package com.nec.jp.ce.m.hayakawa.rest.ap.service;

import java.util.List;

import com.nec.jp.ce.m.hayakawa.rest.ap.domain.Person;

public interface IPersonService {
	public Person getPerson();
	public void regist(Person p);
	public Person find(String name);
	public List<Person> findAll();
}
