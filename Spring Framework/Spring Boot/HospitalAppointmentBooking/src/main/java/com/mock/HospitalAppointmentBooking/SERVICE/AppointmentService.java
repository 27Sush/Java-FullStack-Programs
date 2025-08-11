package com.mock.HospitalAppointmentBooking.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.HospitalAppointmentBooking.DTO.Appointment;
import com.mock.HospitalAppointmentBooking.REPOSITORY.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository repository;
	
	// create new appointment 
	public Appointment createAppointment(Appointment appointment) {
		return repository.save(appointment);
	}
	
	// get appointment by id
	public Appointment getAptById(long id){
		Optional<Appointment> opt = repository.findById(id);
		
		if(opt.isPresent()) {
			return opt.get();
		} else {
			return null;
		}
	}
	

	// update existing appointment with new drname and status
	public String updateDoctorNameAndStatus(long id, String newDoctorName, String newStatus) {
		
		Appointment apt = getAptById(id);
		
		if(apt!=null) {
			apt.setDoctorName(newDoctorName);
			apt.setStatus(newStatus);
			
			repository.save(apt);
			return "Existing Appointment has been updated with new DoctorName and Status.";
		} else {
			return "There is no Appointment with id +"+id;
		}
	}
	
	// delete apt by id
	public String deleteById(long id) {
		Appointment apt = getAptById(id);
		
		if(apt!=null) {
			repository.delete(apt);
			return "The appointment with id "+id+" has been deleted"; 
		} else {
			return "There is no Appointment with id "+id;
		}
	}
	
	// update patient name and appointment date based on ID.
	public String updatePatientNameAndDateById(long id, String newPatientName, String newDate) {
		Appointment apt = getAptById(id);
		
		if(apt!=null) {
			apt.setPatientName(newPatientName);
			apt.setAppointmentDate(newDate);
			
			repository.save(apt);
			return "The patient name and date of appointment has been updated successfully.";
		} else {
			return "There is no Appointment with id "+id;
		}
	}
	
	// delete apt whose stat is cancelled
	public String deleteAptByStatus() {
		int res = repository.deleteByStatus();
		
		if(res!=0) {
			return "The appointment with status CANCELLED has been deleted.";
		} else {
			return "There is no Appointment with status CANCELLED.";
		}
	}
	
	// Get appointments by doctor name
	public List<Appointment> getByDName(String dName) {
		return repository.findByDoctorName(dName);
		
	}
	
	// Get appointments whose status is confirmed
	public List<Appointment> getAptWithConfirmStatus() {
		return repository.getAppointmentWithStatusConfirm();	
	}
	
	// Get appointments on a specific date
	public List<Appointment> getAptByDate(String date){
		return repository.getAppointmentByDate(date);
	}
	

}













