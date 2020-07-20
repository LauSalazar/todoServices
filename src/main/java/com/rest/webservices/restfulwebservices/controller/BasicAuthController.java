package com.rest.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservices.restfulwebservices.model.AutenticationBean;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BasicAuthController {
	
	@GetMapping(path = "/basicauth")
	public AutenticationBean basicAuth() {
		return new AutenticationBean("Authenticated");
	}

}
