package com.cg.airreservation.beans;

public class Transaction {
	private String typeOfTransaction,transactionStatus,transactionDate;
	private int transactionAmount;
	public Transaction(){}
	public Transaction(String typeOfTransaction, String transactionStatus, String transactionDate,
			int transactionAmount) {
		super();
		this.typeOfTransaction = typeOfTransaction;
		this.transactionStatus = transactionStatus;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
	}
	public String getTypeOfTransaction() {
		return typeOfTransaction;
	}
	public void setTypeOfTransaction(String typeOfTransaction) {
		this.typeOfTransaction = typeOfTransaction;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
}
