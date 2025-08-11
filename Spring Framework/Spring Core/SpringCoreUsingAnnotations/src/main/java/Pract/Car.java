package Pract;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{
	public void horn() {
		System.out.println("Horn from Car...");
	}
}
