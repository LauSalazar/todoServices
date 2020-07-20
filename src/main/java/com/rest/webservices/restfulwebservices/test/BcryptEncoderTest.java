package com.rest.webservices.restfulwebservices.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		for (int i = 0; i < 10; i++) {
			System.out.println(encoder.encode("pass"));
		}
		
	}

}
