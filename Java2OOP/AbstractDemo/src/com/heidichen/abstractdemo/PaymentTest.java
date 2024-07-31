package com.heidichen.abstractdemo;

public class PaymentTest {

	public static void main(String[] args) {
		// Payment laptop = new Payment(); // does not work
		
		CashPayment tacos = new CashPayment(1.5);
		tacos.pay();
		
		CardPayment monitor = new CardPayment(200, "4242424242424242", "Pepper", "08/26");
		monitor.pay();
		

	}

}
