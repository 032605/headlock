package com.headlock.headlock.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

public class RideDTO {
	private int rideId;
	private String rideUser;
	private BigDecimal rideLat;
	private BigDecimal rideLon;
	private Date rideDatetime;
	
	
	public RideDTO(int rideId, String rideUser, BigDecimal rideLat, BigDecimal rideLon, Date rideDatetime) {
		super();
		this.rideId = rideId;
		this.rideUser = rideUser;
		this.rideLat = rideLat;
		this.rideLon = rideLon;
		this.rideDatetime = rideDatetime;
	}


	public int getRideId() {
		return rideId;
	}


	public void setRideId(int rideId) {
		this.rideId = rideId;
	}


	public String getRideUser() {
		return rideUser;
	}


	public void setRideUser(String rideUser) {
		this.rideUser = rideUser;
	}


	public BigDecimal getRideLat() {
		return rideLat;
	}


	public void setRideLat(BigDecimal rideLat) {
		this.rideLat = rideLat;
	}


	public BigDecimal getRideLon() {
		return rideLon;
	}


	public void setRideLon(BigDecimal rideLon) {
		this.rideLon = rideLon;
	}


	public Date getRideDatetime() {
		return rideDatetime;
	}


	public void setRideDatetime(Date rideDatetime) {
		this.rideDatetime = rideDatetime;
	}

	
	
}