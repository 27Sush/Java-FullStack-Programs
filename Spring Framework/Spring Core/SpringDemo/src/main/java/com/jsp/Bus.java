package com.jsp;

public class Bus {
	
	String busno;
	String droploc;
	int price;
	
	Passenger passenger;
	
	Bus(String busno, String droploc, int price, Passenger passenger){
		this.busno=busno;
		this.droploc=droploc;
		this.price=price;
		this.passenger=passenger;
	}

}
