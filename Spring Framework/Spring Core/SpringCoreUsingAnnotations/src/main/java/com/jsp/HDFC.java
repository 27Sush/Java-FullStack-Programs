package com.jsp;

import org.springframework.stereotype.Component;

@Component
public class HDFC implements Bank
{

	public void info() {
		System.out.println("Info from HDFC...");
	}
	
}
