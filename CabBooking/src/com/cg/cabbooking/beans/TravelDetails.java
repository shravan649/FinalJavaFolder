package com.cg.cabbooking.beans;

public class TravelDetails {
	private int noOfPassengers,travelCost;
	private String  From,To,dateOfBooking,dateOfTravel,typeOfCab;
	public TravelDetails(){}
	public TravelDetails(int noOfPassengers, int travelCost, String from, String to, String dateOfBooking,
			String dateOfTravel, String typeOfCab) {
		super();
		this.noOfPassengers = noOfPassengers;
		this.travelCost = travelCost;
		From = from;
		To = to;
		this.dateOfBooking = dateOfBooking;
		this.dateOfTravel = dateOfTravel;
		this.typeOfCab = typeOfCab;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public int getTravelCost() {
		return travelCost;
	}
	public void setTravelCost(int travelCost) {
		this.travelCost = travelCost;
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
	public String getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public String getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(String dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public String getTypeOfCab() {
		return typeOfCab;
	}
	public void setTypeOfCab(String typeOfCab) {
		this.typeOfCab = typeOfCab;
	}
	
}
