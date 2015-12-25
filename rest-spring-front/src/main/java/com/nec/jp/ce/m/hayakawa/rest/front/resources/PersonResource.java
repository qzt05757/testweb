package com.nec.jp.ce.m.hayakawa.rest.front.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nec.jp.ce.m.hayakawa.rest.ap.domain.Person;
import com.nec.jp.ce.m.hayakawa.rest.ap.service.IPersonService;
import com.nec.jp.ce.m.hayakawa.rest.utils.BasicUtils;

@RestController
public class PersonResource {
	@Autowired private IPersonService service = null;

	@RequestMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person create(@RequestParam("name") String name, @RequestParam("age") String age) {
		
		int ageI = BasicUtils.toInt(age, 0);
		Person p = new Person(name, ageI);
		service.regist(p);		
		return p;
	}
	
	@RequestMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll() {
		List<Person> ps = service.findAll();
		return ps;
	}
	
	@RequestMapping(value = "/persons/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person find(@PathVariable("name") String name) {
		Person p = service.find(name);
		return p;
	}
}
