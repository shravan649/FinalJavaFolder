package com.cg.airreservation.beans;

public class JourneyDetails {
	private String airlines,From,To,journeyDuration,typeOfClass,seatNo;
	private int startingTime,reachingTime;
	public JourneyDetails(){}
	public JourneyDetails(String airlines, String from, String to, String journeyDuration, String typeOfClass,
			String seatNo, int startingTime, int reachingTime) {
		super();
		this.airlines = airlines;
		From = from;
		To = to;
		this.journeyDuration = journeyDuration;
		this.typeOfClass = typeOfClass;
		this.seatNo = seatNo;
		this.startingTime = startingTime;
		this.reachingTime = reachingTime;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getJourneyDuration() {
		return journeyDuration;
	}
	public void setJourneyDuration(String journeyDuration) {
		this.journeyDuration = journeyDuration;
	}
	public String getTypeOfClass() {
		return typeOfClass;
	}
	public void setTypeOfClass(String typeOfClass) {
		this.typeOfClass = typeOfClass;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public int getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(int startingTime) {
		this.startingTime = startingTime;
	}
	public int getReachingTime() {
		return reachingTime;
	}
	public void setReachingTime(int reachingTime) {
		this.reachingTime = reachingTime;
	}
	
}
