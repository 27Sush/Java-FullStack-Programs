package Pract;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle
{
	public void horn() {
		System.out.println("Horn from Bike...");
	}
}
