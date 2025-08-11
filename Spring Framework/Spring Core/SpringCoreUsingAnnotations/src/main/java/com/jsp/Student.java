package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	// assigning default/literal values through variables
	
	@Value(value="Sushant")
	String name;
	
	@Value(value="24")
	int age;
}
