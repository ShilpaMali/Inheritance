package com.inheritance.hierarchical;

public class Hierarchical {
	public static void main(String[] args) {

		CarLoan carLoan = new CarLoan();
		carLoan.getCarLoanDetails();
		carLoan.getLoanDetails();
		HomeLoan homeLoan = new HomeLoan();
		homeLoan.getHomeLoanDetails();
		PersonalLoan personalLoan = new PersonalLoan();
		personalLoan.getPersonalLoanDetails();
	}

}
