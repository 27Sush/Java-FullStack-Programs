package com.jsp.WeatherReportWebService.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.WeatherReportWebService.DTO.Weather;
import com.jsp.WeatherReportWebService.SERVICE.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	WeatherService service;
	
	@PostMapping("/weather")
	public Weather storeWeatherReport(@RequestBody Weather weather) {
		return service.insertWeather(weather);
	}
	
	// Rest API to retreive all weather objects from DB
	
	@GetMapping("/weather")
	public List<Weather> getAllWeatherReports(){
		return service.getAllWeather();
	}
	
	@GetMapping("/byid")
	public Weather getWeatherReport(@RequestParam int id) {
		return service.getWeatherById(id);
	}
	
	// Rest API to update weather conditions, temperature based on ID
	@PutMapping("/weather")
	public String updateWeatherReport(@RequestParam int id, @RequestParam String cond, @RequestParam String temp) {
		return service.updateWeather(id, cond, temp);
	}

	// Rest API to delete weather report based on ID
	@DeleteMapping("/weather")
	public String deleteWeatherReport(@RequestParam int id) {
		return service.deleteWeather(id);
	}
	
	// Rest API to fetch by city
	@GetMapping("/bycity")
	public List<Weather> getByCity(@RequestParam String city){
		return service.getByCity(city);
	}
	
	// Rest API to update cond based on date
	@PutMapping("/bydate")
	public String updateWeatherByDate(@RequestParam String cond, @RequestParam String date) {
		return service.updateByDate(cond, date);
	}
}




