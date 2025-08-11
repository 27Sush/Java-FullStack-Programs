package com.jsp;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Phone
{

	public void calling() {
		System.out.println("Calling via Samsung...");
	}
}
