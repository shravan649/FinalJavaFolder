package com.cg.cabbooking.beans;

public class Transaction {
	private String modeOfTransaction,transactionStatus,transactionDate;
	private int transactionAmount;
	public Transaction(){}
	public Transaction(String modeOfTransaction, String transactionStatus, String transactionDate,
			int transactionAmount) {
		super();
		this.modeOfTransaction = modeOfTransaction;
		this.transactionStatus = transactionStatus;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
	}
	public String getModeOfTransaction() {
		return modeOfTransaction;
	}
	public void setModeOfTransaction(String modeOfTransaction) {
		this.modeOfTransaction = modeOfTransaction;
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
