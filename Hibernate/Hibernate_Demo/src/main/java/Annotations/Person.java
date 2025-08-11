package Annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_table")
public class Person {

	@Id
	@Column( name = "person_id" )
	private int id;
	
	@Column( name = "person_name" , unique = true , length = 15)
	private String name;
	
	@Column(name="person_age")
	private int age;
	
	@Column(name="person_address" , nullable = false , length = 25)
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}