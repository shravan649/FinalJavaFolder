package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class HelloController {
	@RequestMapping(method=RequestMethod.GET,value="hello")
	public String[] sayHello() {
		return new String[] {"hello"};
	}
}
