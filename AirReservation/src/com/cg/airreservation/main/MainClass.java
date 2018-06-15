package com.cg.airreservation.main;

import com.cg.airreservation.beans.Cancellation;
import com.cg.airreservation.beans.Food;
import com.cg.airreservation.beans.JourneyDetails;
import com.cg.airreservation.beans.Passenger;
import com.cg.airreservation.beans.Transaction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger passenger =new Passenger("Sachin", 9876543123l);
		JourneyDetails journeyDetails=new JourneyDetails("Jet Airways", "Pune", "Jaipur", "3 hrs", "Economy", "36G", 2150, 0050);
		Food food=new Food("Yes", "Veg");
		Transaction transaction=new Transaction("Debit", "Success", "09/09/2017", 4550);
		Cancellation cancellation=new Cancellation("Zero Cancellation", "One day before Check-in", 30);
		System.out.print("Name : "+passenger.getName()+"\nAirlines : "+journeyDetails.getAirlines()+"\nFood : "+food.getFoodAppliedStatus()+"\nTransaction Status : "+transaction.getTransactionStatus()+"\nCancellation Policy : "+cancellation.getCancellationPolicy());
	
	}

}
