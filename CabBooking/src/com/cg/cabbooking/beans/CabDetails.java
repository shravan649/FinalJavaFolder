package com.cg.cabbooking.beans;

public class CabDetails {
	private int bookingID,OTP;
	long driverNumber;
	private String vehicleNo,driverName ;
	public CabDetails(){}
	public CabDetails(int bookingID, int oTP, long driverNumber, String vehicleNo, String driverName) {
		super();
		this.bookingID = bookingID;
		OTP = oTP;
		this.driverNumber = driverNumber;
		this.vehicleNo = vehicleNo;
		this.driverName = driverName;
	}
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public int getOTP() {
		return OTP;
	}
	public void setOTP(int oTP) {
		OTP = oTP;
	}
	public long getDriverNumber() {
		return driverNumber;
	}
	public void setDriverNumber(long driverNumber) {
		this.driverNumber = driverNumber;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
}
