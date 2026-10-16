package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.WeatherStation;

public interface WeatherStationService {
	
	WeatherStation addws(WeatherStation w);
	List<WeatherStation> displayAll();
	String deleteWeatherStationById(Long id);

}
