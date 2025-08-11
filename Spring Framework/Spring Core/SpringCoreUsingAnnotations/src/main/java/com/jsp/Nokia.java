package com.jsp;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Phone 
{
	@Override
	public void calling() {
		System.out.println("Calling via Nokia...");
	}
}
