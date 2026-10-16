package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.WeatherStation;
import com.klef.soa.exam.service.WeatherStationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/weatherstation")
public class WeatherStationController {
	
	@Autowired 
	private WeatherStationService service;
	
	@GetMapping("/")
	public ResponseEntity<String> demo() {
	    return ResponseEntity.ok("Weather Station Service Running");
	}
	
	@PostMapping("/add")
	public ResponseEntity<WeatherStation> addwss(
	        @RequestBody WeatherStation w) {

	    WeatherStation weather = service.addws(w);

	    return ResponseEntity.status(201).body(weather);
	}
	
	
	
	@GetMapping("/displayall")
	public ResponseEntity<List<WeatherStation>> displayAll()
	{
		List<WeatherStation> ww = service.displayAll();
		return ResponseEntity.status(200).body(ww);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletewsById(@PathVariable Long id)
	{
		String message = service.deleteWeatherStationById(id);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
	

}
