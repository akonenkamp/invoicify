package com.libertymutual.goforcode.invoicify.models;

public class FlatFeeBillingRecord extends BillingRecord {
	private double amount;
	

	@Override
	public double getTotal() {
		return amount;
		
	}
	
	

}
