package com.cg.cabbooking.main;

import com.cg.cabbooking.beans.CabDetails;
import com.cg.cabbooking.beans.Passenger;
import com.cg.cabbooking.beans.Transaction;
import com.cg.cabbooking.beans.TravelDetails;

public class MainClass {
	public static void main(String[] args) {
		CabDetails cabDetails = new CabDetails(1456, 2511, 9448756956l, "KA22mn1234", "Shri");
		Transaction transaction = new Transaction("Cash", "Complete", "22/04/2018", 500);
		TravelDetails travelDetails = new TravelDetails(4, 800, "pune", "Mumbai", "22/02/2018", "25/04/2018", "Micro");
		System.out.println("Travel Date "+ travelDetails.getDateOfTravel()+" Amount To Be Paid "+transaction.getTransactionAmount());
	}
	
}
