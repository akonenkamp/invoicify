package com.libertymutual.goforcode.invoicify.models;

public class RateBasedBillingRecord extends BillingRecord {
	
	private double rate;
	private double quantity;
	
	
	

	@Override
	public double getTotal() {
		return rate * quantity;
	}

}
