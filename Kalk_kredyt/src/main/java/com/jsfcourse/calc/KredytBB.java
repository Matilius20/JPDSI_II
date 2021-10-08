package com.jsfcourse.calc;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named
@RequestScoped
//@SessionScoped
public class KredytBB {
	private String loan;
	private String years;
	private String interest;
	private Double rate;

	@Inject
	FacesContext ctx;

	public String getLoan() {
		return loan;
	}

	public void setLoan(String loan) {
		this.loan = loan;
	}

	public String getYears() {
		return years;
	}

	public void setYears(String years) {
		this.years = years;
	}
	
	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String calc() {
		
			double loan = Double.parseDouble(this.loan);
			double years = Double.parseDouble(this.years);
			double interest = Double.parseDouble(this.interest);

			rate = loan / (years * 12) * (1.0 + interest / 100);
			return null;
	}
	
}





