package com.Xworkz.DataBase.GmailPrediction.DAO;

public interface MailPredictionInterface {
	
	void login(String User, String Pwd);
	void inbox();
	void chat();
	void newmeeting(String meetingLink);

}
