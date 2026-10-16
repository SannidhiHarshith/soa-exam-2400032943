package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.WeatherStation;
import com.klef.soa.exam.repository.WeatherStationRepository;

@Service
public class WeatherStationServiceImpl implements WeatherStationService {

	@Autowired
	private WeatherStationRepository repo;

	@Override
	public WeatherStation addws(WeatherStation w) {
	    return repo.save(w);
	}

	@Override
	public List<WeatherStation> displayAll() {
		return repo.findAll();
	}

	@Override
	public String deleteWeatherStationById(Long id) {
		boolean flag = repo.existsById(id); //return true or false
		if(flag) {
			repo.deleteById(id);
			return "WeatherStation Deleted Successfully";
			
		}else {
			return "WeatherStation ID Not Found";
		}
	}
	
	
}
