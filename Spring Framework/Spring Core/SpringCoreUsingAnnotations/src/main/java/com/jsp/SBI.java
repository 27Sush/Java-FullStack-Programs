package com.jsp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SBI implements Bank
{

	public void info() {
		System.out.println("Info from SBI...");
	}
}
