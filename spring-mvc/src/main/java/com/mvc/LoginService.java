package com.mvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String user, String password) {
		return "user".equalsIgnoreCase(user) && "password".equals(password);
	}
}