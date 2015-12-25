package com.nec.jp.ce.m.hayakawa.rest.ap.core.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public abstract class Domain implements Serializable {
	private static final long serialVersionUID = -7019550636476217388L;

	@Id private String id;	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
