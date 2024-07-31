package com.heidichen.abstractdemo;

public class CardPayment extends Payment {

    // attributes (expDate as string to be simple)
	private String cardNum, ownerName, expDate; 
	
    // All card payment should include their card details
	public CardPayment(double amount, String cardNum, String ownerName, String expDate) {
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName;
		this.expDate = expDate;
	}

    // Can specify the pay method as well
    @Override
	public void pay() {
		System.out.println("Processing payment....");
		System.out.println("Credit Card number: " + this.cardNum + " | ownername : "+ this.ownerName + " | exp Date: "+ this.expDate);
		System.out.println("It was charged $" + this.getAmount() );		
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
    
    
}
