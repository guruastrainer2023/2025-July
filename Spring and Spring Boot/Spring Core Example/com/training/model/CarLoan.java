package com.training.model;

public class CarLoan implements Loan{
	double loanAmt;

    @Override
    public void setLoanAmount(double amount) {
        this.loanAmt=amount;
    }

    @Override
    public double getInterestAmount() {
       return this.loanAmt*12*15.0/100.0;
    }

    @Override
    public String toString() {
        return "CarLoan{" + "loanAmt=" + loanAmt + '}';
    }
    
}
