package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Value(value="Sush")
	String name;
	
	@Autowired
	Nokia nokia;
	
	@Autowired
	Samsung samsung;
	
	@Autowired
	@Qualifier(value="samsung")
	Phone phone; /// interface - obj is created of its implementing class
}
