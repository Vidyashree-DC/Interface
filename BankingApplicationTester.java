package com.Xworkz.DataBase.BankingApplication.DAO;

public class BankingApplicationTester {

	public static void main(String[] args) {
		YounoSBI sbi = new YounoSBI();
		sbi.login("vidya", "123");
		sbi.accountService();
		sbi.atmcumDebitCard();
		sbi.loans();
		sbi.helpdesk(1234567894);
	}
	
}
