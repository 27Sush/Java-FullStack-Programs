package com.mock.HospitalAppointmentBooking.REPOSITORY;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mock.HospitalAppointmentBooking.DTO.Appointment;

import jakarta.transaction.Transactional;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>
{

	// delete apt whose status is cancelled
	
	@Modifying
	@Transactional
	@Query("delete from Appointment a where a.status='CANCELLED'")
	public int deleteByStatus();
	
	
	// get apt by doc name
	@Query("select a from Appointment a where a.doctorName=?1")
	public List<Appointment> findByDoctorName(String doctorName);
	
	// get apt whose status is CONFIRMED
	@Query("select a from Appointment a where a.status='CONFIRMED'")
	public List<Appointment> getAppointmentWithStatusConfirm();
	
	// Get appointments on a specific date
	@Query("select a from Appointment a where a.appointmentDate=?1")
	public List<Appointment> getAppointmentByDate(String date);
	
}
