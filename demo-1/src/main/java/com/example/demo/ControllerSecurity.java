package com.example.demo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ControllerSecurity {
	@GetMapping("/")
	public String login() {
		return "Authenticcation sucessfully";
	}
	@GetMapping("/getuser")
	public List<User> getUsers(){
		return Stream.of(new User(1,"venkat",23),new User(2,"ravi",24))
				.collect(Collectors.toList());
	}

}
