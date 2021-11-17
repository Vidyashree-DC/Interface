package com.Xworkz.DataBase.DAO;

public class DBTester {

	public static void main(String[] args) {
		CompanyA companyA=new CompanyA();
		companyA.connectDataBase("ABC", "XYZ");
		companyA.save("ABC", "XYZ");
		companyA.delete("ABC");
		companyA.update("Viiiii", "biiii");
	}
}
