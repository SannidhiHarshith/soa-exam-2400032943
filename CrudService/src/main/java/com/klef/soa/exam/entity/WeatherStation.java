package com.klef.soa.exam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "WeatherStation_table")
public class WeatherStation {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "wid")
	private long id;
	
	@Column(name = "stationCode", nullable = false)
	private String stationCode;
	@Column(name = "location", nullable = false)
	private String location;
	@Column(name = "sensorCount", nullable = false)
	private int sensorCount;
	@Column(name = "active", nullable = false)
	private boolean active;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSensorCount() {
		return sensorCount;
	}
	public void setSensorCount(int sensorCount) {
		this.sensorCount = sensorCount;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}
