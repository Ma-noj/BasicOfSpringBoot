package edu.jsp.btm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		return "<h1> UserEmail = " + user.getEmail() + "   UserPassword = " + user.getPassword() + "</h1>";
	}
}
