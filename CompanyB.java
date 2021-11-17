package com.Xworkz.DataBase.DAO;

public class CompanyB implements DataBaseOperationDAO{

	@Override
	public void connectDataBase(String user, String pass) {
		System.out.println("CompanyB connect logic !! DataBase Connected");
		
	}

	@Override
	public void save(String name, String place) {
		System.out.println("CompanyB connect logic !! DataBase Saved");
		
	}

	@Override
	public void delete(String name) {
		System.out.println("CompanyB connect logic !! DataBase Deleted");
		
	}

	@Override
	public void update(String name, String place) {
		System.out.println("CompanyB connect logic !! DataBase Updated");
		
	}

}
