package com.Xworkz.DataBase.GmailPrediction.DAO;

public class Gmail implements MailPredictionInterface {

	@Override
	public void login(String User, String Pwd) {
		System.out.println("login with gmail using username n password");
		
	}

	@Override
	public void inbox() {
		System.out.println("to check inbox messages");
		
	}

	@Override
	public void chat() {
		System.out.println("to check hangout messages");
		
	}

	@Override
	public void newmeeting(String meetingLink) {
		System.out.println("conduct meeting through this link " + meetingLink);
		
	}

}
