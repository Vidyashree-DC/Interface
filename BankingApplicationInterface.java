package com.Xworkz.DataBase.BankingApplication.DAO;

public interface BankingApplicationInterface {
	
	void login(String userName, String password);
	void accountService();
	void atmcumDebitCard();
	void loans();
	void helpdesk(long no);

}
