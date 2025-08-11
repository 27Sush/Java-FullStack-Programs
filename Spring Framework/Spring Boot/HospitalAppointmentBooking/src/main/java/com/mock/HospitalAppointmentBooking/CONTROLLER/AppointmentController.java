package com.mock.HospitalAppointmentBooking.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mock.HospitalAppointmentBooking.DTO.Appointment;
import com.mock.HospitalAppointmentBooking.SERVICE.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService service;
	
	// REST API to create new appointment
	@PostMapping("/appointments")
	public Appointment createNewApt(@RequestBody Appointment apt) {
		return service.createAppointment(apt);
	}
	
	// REST API to update existing apt with new Drname and status
	@PutMapping("/appointments")
	public String updateById(@RequestParam long id, @RequestParam String newDName, @RequestParam String newStatus) {
		return service.updateDoctorNameAndStatus(id, newDName, newStatus);
	}
	
	// REST API Delete an appointment by ID
	@DeleteMapping("/appointments")
	public String deleteAptById(@RequestParam long id) {
		return service.deleteById(id);
	}
	
	// REST API to delete apt whose stat is cancelled
	@DeleteMapping("/bystatus")
	public String deleteAptByStatus() {
		return service.deleteAptByStatus();
	}
	
	// REST API Get an appointment by ID
	@GetMapping("/byid")
	public Appointment getAptById(@RequestParam long id) {
		return service.getAptById(id); 
	}
	
	// REST API to Get appointments by doctor name
	@GetMapping("/docbyname")
	public List<Appointment> getAptByDName(@RequestParam String dName) {
		return service.getByDName(dName);
	}
	
	// REST API to Get appointments whose status is confirmed
	@GetMapping("/getbystatus")
	public List<Appointment> getAptWithConfirm() {
		return service.getAptWithConfirmStatus();
	}
	
	// REST API to Get appointments on a specific date
	@GetMapping("/getbydate")
	public List<Appointment> getByDate(@RequestParam String date){
		return service.getAptByDate(date);
	}
	
	// REST API update patient name and appointment date based on ID.
	@PutMapping("/updatebyid")
	public String updatePNameAndDate(@RequestParam long id,@RequestParam String newPName, @RequestParam String newDate ) {
		return service.updatePatientNameAndDateById(id, newPName, newDate);
	}
}
