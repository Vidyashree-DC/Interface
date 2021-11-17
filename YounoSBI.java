package com.Xworkz.DataBase.BankingApplication.DAO;

public class YounoSBI implements BankingApplicationInterface{
	
	@Override
	public void login(String userName, String password) {
		System.out.println("login wit username n password");
		
	}

	@Override
	public void accountService() {
		System.out.println("Balance Enquiry");
		System.out.println("Mini Statement");
		System.out.println("Check Book request");
	}

	@Override
	public void atmcumDebitCard() {
		System.out.println("ATM card Blocking");
		
	}

	@Override
	public void loans() {
		System.out.println("Home Loans");
		System.out.println("Gold Loans");
		
	}

	@Override
	public void helpdesk(long no) {
		System.out.println(" Helpline no " + no);
		
	}


}
