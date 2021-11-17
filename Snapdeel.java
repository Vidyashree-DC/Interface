package com.Xworkz.DataBase.Onlineshopping.DAO;

public class Snapdeel implements OnlineShoppingInterface {

	@Override
	public void login(String username, String password) {
		System.out.println("Login to Snapdeel with username and password");
		
	}

	@Override
	public void wishlist() {
		System.out.println("Items added to your wish list");
		
	}

	@Override
	public void cart() {
		System.out.println("Items added to cart");
		
	}

	@Override
	public void orders() {
		System.out.println("your orders");
		
	}

	@Override
	public void homeandKitchen() {
		System.out.println("products categorised on Kitchen");
		
	}

	@Override
	public void beauty() {
		System.out.println("beauty products categorised on brands");
		
	}

	@Override
	public void bagPacks() {
		System.out.println("bagpacks");
		
	}

	@Override
	public void jwelleryandAccessories() {
		System.out.println("jwelleryandAccessories");
		
	}

	@Override
	public void shippingaddress(String address) {
		System.out.println("shipping address is " + address);
		
	}

}
