package FoodDeliveryApp;

import java.util.*;

public class Items extends Hotel implements TaxAndDiscounts{
	
	String itemSelected;
	Integer quantityfromuser,itemfromuser;
	Double priceperqty,totalprice,tax,amountaftertax,amountafterdiscount;
	Scanner sc = new Scanner(System .in);
	int hotelName = getHotelName();
	
	
	
	LinkedHashMap<Integer,String> vegfoodItems = new LinkedHashMap<>();
	LinkedHashMap<Integer,String> nonvegfoodItems = new LinkedHashMap<>();
	LinkedHashMap<String,Double> A2BPrice = new LinkedHashMap<>();
	LinkedHashMap<String,Double> saravaBhavanPrice = new LinkedHashMap<>();
	LinkedHashMap<String,Double> rasavidPrice = new LinkedHashMap<>();
	LinkedHashMap<String,Double> ssPrice = new LinkedHashMap<>();
	LinkedHashMap<String,Double> khalidsPrice = new LinkedHashMap<>();
	
	public void AddVegFoodItems()
	{
		vegfoodItems.put(1, "Idly");
		vegfoodItems.put(2, "Dosa");
		vegfoodItems.put(3, "FriedRice");
		vegfoodItems.put(4, "Gobi");
		vegfoodItems.put(5, "Halwa");
	}
	
	public void AddNonVegFoodItems()
	{
		nonvegfoodItems.put(1, "Chicken Biriyani");
		nonvegfoodItems.put(2, "Mutton Biriyani");
		nonvegfoodItems.put(3, "Chicken 65");
		nonvegfoodItems.put(4, "Grill");
		nonvegfoodItems.put(5, "Kabab");
	}
	
	public void A2BPrice()
	{
		
		A2BPrice.put("Idly",60.00);
		A2BPrice.put("Dosa", 120.00);
		A2BPrice.put("FriedRice",260.00);
		A2BPrice.put("Gobi",165.00);
		A2BPrice.put("Halwa",220.00);
	}
	
	public void SaravanaBhavanPrice()
	{
		saravaBhavanPrice.put("Idly",80.00);
		saravaBhavanPrice.put("Dosa", 140.00);
		saravaBhavanPrice.put("FriedRice",280.00);
		saravaBhavanPrice.put("Gobi",195.00);
		saravaBhavanPrice.put("Halwa",230.00);
	}
	
	public void RasavidPrice()
	{
		rasavidPrice.put("Chicken Biriyani",270.00);
		rasavidPrice.put("Mutton Biriyani", 320.00);
		rasavidPrice.put("Chicken 65",180.00);
		rasavidPrice.put("Grill",420.00);
		rasavidPrice.put("Kabab",230.00);
	}
	
	public void SSPrice()
	{
		ssPrice.put("Chicken Biriyani",240.00);
		ssPrice.put("Mutton Biriyani", 350.00);
		ssPrice.put("Chicken 65",220.00);
		ssPrice.put("Grill",480.00);
		ssPrice.put("Kabab",240.00);
	}
	
	public void KhalidsPrice()
	{
		khalidsPrice.put("Chicken Biriyani",230.00);
		khalidsPrice.put("Mutton Biriyani", 340.00);
		khalidsPrice.put("Chicken 65",180.00);
		khalidsPrice.put("Grill",440.00);
		khalidsPrice.put("Kabab",260.00);
	}
	
	public void DisplayVegFoods()
	{
		AddVegFoodItems();
		for(Map.Entry M:vegfoodItems.entrySet())
		{
			System.out.println(M);
		}
	}
	
	public void DisplayNonVegFoods()
	{
		AddNonVegFoodItems();
		for(Map.Entry M:nonvegfoodItems.entrySet())
		{
			System.out.println(M);
		}
	}
	public int GetUserInput()
	{	
		System.out.println("Select Item:");
		itemfromuser = sc.nextInt();
		return itemfromuser;
	}
	
	public int GetUserQuantity()
	{
		System.out.println("Enter quantity");
		quantityfromuser = sc.nextInt();
		return quantityfromuser;
	}
	
	
	public double priceperQuantity()
		{
		//System.out.println(GetUserInput());
		switch(hotelName)
		{
		case 1:
			DisplayVegFoods();
			GetUserInput();
			A2BPrice();
			itemSelected= vegfoodItems.get(itemfromuser);
			priceperqty= A2BPrice.get(itemSelected);
			break;
			
		case 2:
			DisplayVegFoods();
			GetUserInput();
			SaravanaBhavanPrice();
			itemSelected= vegfoodItems.get(itemfromuser);
			priceperqty= saravaBhavanPrice.get(itemSelected);
			break;
			
		case 3:
			DisplayNonVegFoods();
			GetUserInput();
			RasavidPrice();
			itemSelected= nonvegfoodItems.get(itemfromuser);
			priceperqty= rasavidPrice.get(itemSelected);
			break;
			
		case 4:
			DisplayNonVegFoods();
			GetUserInput();
			SSPrice();
			itemSelected= nonvegfoodItems.get(itemfromuser);
			priceperqty= ssPrice.get(itemSelected);
			break;
			
		case 5:
			DisplayNonVegFoods();
			GetUserInput();
			KhalidsPrice();
			itemSelected= nonvegfoodItems.get(itemfromuser);
			System.out.println(itemSelected);
			priceperqty= khalidsPrice.get(itemSelected);
			break;
		}
		//System.out.println(priceperqty);
		return priceperqty;
	}
	
	public double PriceCalculation()
	{
		totalprice = priceperQuantity()*GetUserQuantity();
		System.out.println(totalprice);
		return totalprice;
	}
	
	public double TaxCalculation()
	{
	totalprice = PriceCalculation();
	tax = totalprice*0.18;
	amountaftertax =  totalprice + tax ;
	//System.out.print(finalamount);
	return amountaftertax;
	}
	
	public double DiscountCalculation()
	{
		
		double price = TaxCalculation();
		//System.out.println(price);
		if(price>500)
		{
			amountafterdiscount = price -(price *0.10);
			return amountafterdiscount;
		}
		else 
			return amountaftertax;
	}
	
	public void printbill()
	{
		double finalamount = DiscountCalculation();
		System.out.println("*****" + hotelsName.get(hotelName) + "*****");
		if(hotelName==3 ||hotelName==4||hotelName==5)
		{
		System.out.println("1. Item Name :\t" + nonvegfoodItems.get(itemfromuser));
		}
		else 
		System.out.println("Item Name :\t" + vegfoodItems.get(itemfromuser));
			
		System.out.println("Quantity Ordered \t" + quantityfromuser);
		System.out.println("Total price\t :"+ totalprice);
		System.out.println("Tax\t :  " + tax);
		System.out.println("Final Amount :\t" + finalamount);
		
		
	}
}
