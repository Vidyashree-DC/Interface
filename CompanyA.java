package com.Xworkz.DataBase.DAO;

public class CompanyA implements DataBaseOperationDAO{

	@Override
	public void connectDataBase(String user, String pass) {
	System.out.println("CompanyA connect logic !! DataBase Connected");
		
	}

	@Override
	public void save(String name, String place) {
		System.out.println("CompanyA connect logic !! DataBase Saved");
		
	}

	@Override
	public void delete(String name) {
		System.out.println("CompanyA connect logic !! DataBase Deleted");
		
	}

	@Override
	public void update(String name, String place) {
		System.out.println("CompanyA connect logic !! DataBase Updated");
		
	}

}
