package com.review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RailWay {
	@Id
	private int trainNo;
	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}

	public int getPlatformNo() {
		return platformNo;
	}

	public void setPlatformNo(int platformNo) {
		this.platformNo = platformNo;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	private String arrival;
	private String trainname;
	private int fare;
	private String departure;
	private String quota;
	private int platformNo;
	private int seatNo;
	
	RailWay(){}

}
