package oneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AadharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadhar_id;
	private long aadharno;
	
	public int getAadhar_id() {
		return aadhar_id;
	}
	public void setAadhar_id(int aadhar_id) {
		this.aadhar_id = aadhar_id;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	
}
