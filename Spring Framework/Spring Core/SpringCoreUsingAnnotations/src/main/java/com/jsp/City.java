package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {

	@Value(value="Bangalore")
	String name ;
	
	@Autowired
	SBI sbi;
	
	@Autowired
	HDFC hdfc;
	
	@Autowired
	Bank bank;
}
