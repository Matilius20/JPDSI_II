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

	public boolean calc() {
		try {
			double loan = Double.parseDouble(this.loan);
			double years = Double.parseDouble(this.years);
			double interest = Double.parseDouble(this.interest);
			
			rate = loan / (years * 12) * (1.0 + interest / 100);
			
			ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Rata obliczona pomyœlnie", null));
			return true;
		} catch (Exception e) {
			ctx.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "B³¹d", null));
			return false;
		}
		}
	
	public String rate() {
		if (calc()) {
			return "showresult";
		}
		return null;
	}
		

		
	}
	






