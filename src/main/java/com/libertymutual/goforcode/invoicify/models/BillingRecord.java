package com.libertymutual.goforcode.invoicify.models;

import java.sql.Date;

import javax.persistence.ManyToOne;

public abstract class BillingRecord {
	
	@ManyToOne
	private User createdBy;
	private Date createdOn;
	private String description;
	
	public abstract double getTotal();
	

}
