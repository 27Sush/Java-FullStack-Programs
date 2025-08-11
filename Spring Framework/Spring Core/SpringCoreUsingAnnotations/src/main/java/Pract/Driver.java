package Pract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Driver {

	@Value(value="Sushant")
	String name;
	
	@Autowired
	Car car;
	
	@Autowired
	Bike bike;
	
	@Autowired
	Vehicle vehicle;
}
