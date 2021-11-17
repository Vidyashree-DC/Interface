package com.Xworkz.DataBase.DAO;

public interface DataBaseOperationDAO {

	public void connectDataBase(String user, String pass);
	public void save(String name, String place);
	public void delete(String name);
	public void update(String name, String place);
}
