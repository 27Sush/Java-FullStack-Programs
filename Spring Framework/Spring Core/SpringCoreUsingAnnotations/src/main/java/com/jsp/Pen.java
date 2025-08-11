package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {

	String brand;
	int price;
	
	Pen(@Value(value="Reynolds") String brand, @Value(value="50") int price){
		this.brand=brand;
		this.price=price;
	}
}
