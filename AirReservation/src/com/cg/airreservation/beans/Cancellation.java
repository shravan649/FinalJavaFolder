package com.cg.airreservation.beans;

public class Cancellation {
	private String cancellationPolicy,lastDateForCancellation;
	private int percentageOfCancellationCharge;
	public Cancellation(){}
	public Cancellation(String cancellationPolicy, String lastDateForCancellation, int percentageOfCancellationCharge) {
		super();
		this.cancellationPolicy = cancellationPolicy;
		this.lastDateForCancellation = lastDateForCancellation;
		this.percentageOfCancellationCharge = percentageOfCancellationCharge;
	}
	public String getCancellationPolicy() {
		return cancellationPolicy;
	}
	public void setCancellationPolicy(String cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}
	public String getLastDateForCancellation() {
		return lastDateForCancellation;
	}
	public void setLastDateForCancellation(String lastDateForCancellation) {
		this.lastDateForCancellation = lastDateForCancellation;
	}
	public int getPercentageOfCancellationCharge() {
		return percentageOfCancellationCharge;
	}
	public void setPercentageOfCancellationCharge(int percentageOfCancellationCharge) {
		this.percentageOfCancellationCharge = percentageOfCancellationCharge;
	}
	
}
