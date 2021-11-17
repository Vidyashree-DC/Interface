package com.Xworkz.DataBase.Onlineshopping.DAO;

public interface OnlineShoppingInterface {
	
	public void login(String username,String password);
	public void wishlist();
	public void cart();
	public void orders();
	public void homeandKitchen();
	public void beauty();
	public void bagPacks();
	public void jwelleryandAccessories();
	public void shippingaddress(String address);
	
}
