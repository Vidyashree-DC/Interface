package com.Xworkz.DataBase.GmailPrediction.DAO;

public class MailPredictionTester {
	
	public static void main(String[] args) {
		Gmail mail=new Gmail();
		mail.login("Vinu","23");
		mail.inbox();
		mail.chat();
		mail.newmeeting("https://googlemeet/abc-cvb-cvb");
	}

}
