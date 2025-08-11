package Pract;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new AnnotationConfigApplicationContext(Configure.class);
		Driver driver = ac.getBean("driver", Driver.class);
		
		System.out.println(driver.name);
		driver.car.horn();
		driver.bike.horn();
		driver.vehicle.horn();
	}

}
