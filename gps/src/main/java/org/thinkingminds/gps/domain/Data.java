package org.thinkingminds.gps.domain;

//import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Data {
//	private static final long serialVersionUID = 1231L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username, password;
	private double latitude, longitude;
	private float speed;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return getId() + ", " + getUsername() + ", " + getLatitude() + ", " + getLongitude() + ", " + getSpeed();
	}
	
}
