package com.nec.jp.ce.m.hayakawa.rest.front.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nec.jp.ce.m.hayakawa.rest.ap.domain.Person;
import com.nec.jp.ce.m.hayakawa.rest.ap.service.IPersonService;

@RestController
public class HogeResource {
	@Autowired private IPersonService service = null;

	@RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person hello() {
		Person p = service.getPerson();
		service.regist(p);		
		return p;
	}
}
