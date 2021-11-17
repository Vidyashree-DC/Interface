package com.Xworkz.DataBase.Onlineshopping.DAO;

public class OnlineShoppingTester {
	
	public static void main(String[] args) {
		Myntra shopping = new Myntra();
		shopping.login("Vidya", "123");
		shopping.wishlist();
		shopping.cart();
		shopping.orders();
		shopping.homeandKitchen();
		shopping.beauty();
		shopping.bagPacks();
		shopping.jwelleryandAccessories();
		shopping.shippingaddress("TUMKUR");
	}

}
