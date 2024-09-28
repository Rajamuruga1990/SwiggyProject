package FoodDeliveryApp;

import java.util.*;

public class Item extends Hotel{

	String itemname,item;
	Integer quantity;
	Double priceperqty,totalprice;
	Scanner sc = new Scanner(System .in);
	String hotelName = getHotelName();
	
	List<String> a2bItems = new ArrayList<String>();
	List<String> sbItems = new ArrayList<String>();
	List<String> ssItems = new ArrayList<String>();
	List<String> KhalidsItems = new ArrayList<String>();
	List<String> RasavidItems = new ArrayList<String>();
	
	public void Adda2bItems1()
	{
		a2bItems.add("Idly-60");
		a2bItems.add("Dosa-120");
		a2bItems.add("FriedRice-260");
		a2bItems.add("Gobi-165");
		a2bItems.add("Halwa-220");
	}
	
	public void AddsbItems()
	{
		sbItems.add("Idly-80");
		sbItems.add("Dosa-110");
		sbItems.add("FriedRice-240");
		sbItems.add("Gobi-180");
		sbItems.add("Halwa-120");		
	}
	public void AddssItems()
	{
		ssItems.add("Chicken Biriyani-240");
		ssItems.add("Mutton Biriyani-350");
		ssItems.add("Chicken65-240");
		ssItems.add("Grill-440");
		ssItems.add("Kabab-280");		
	}
	
	public void AddKhalidsItems()
	{
		KhalidsItems.add("Chicken Biriyani-220");
		KhalidsItems.add("Mutton Biriyani-330");
		KhalidsItems.add("Chicken65-180");
		KhalidsItems.add("Grill-420");
		KhalidsItems.add("Kabab-240");		
	}
	
	public void AddRasavidItems()
	{
		RasavidItems.add("Chicken Biriyani-220");
		RasavidItems.add("Mutton Biriyani-330");
		RasavidItems.add("Chicken65-160");
		RasavidItems.add("Grill-380");
		RasavidItems.add("Kabab-220");		
	}
	
	 
	
	
	public int GetQuantity()
	{
		System.out.println("Enter the quantity");
		quantity = sc.nextInt();
		return quantity;
	}
	
	public String GetItemName()
	{
		System.out.println("Select the item");
		itemname = sc.next();
		return itemname;
	}
	
	public Double GetItem()
	{
		
			switch(hotelName)
			{
			case "A2B":
				Adda2bItems1();
				for(int i=0;i<a2bItems.size();i++)
					{	
					System.out.println(a2bItems.get(i));
					}
					
				GetItemName();
				for(int j = 0;j<a2bItems.size();j++)
				{	
					String[] itemsplit = a2bItems.get(j).split("-");
					if(itemsplit[0].equalsIgnoreCase(itemname))
					{
						item =  itemsplit[0];
						priceperqty = Double.valueOf(itemsplit[1]);
					}
					
				}
				break;
				
			case "SB":
				AddsbItems();
				for(int i=0;i<sbItems.size();i++)
					{	
					System.out.println(sbItems.get(i));
					}
					
				GetItemName();
				for(int j = 0;j<sbItems.size();j++)
				{	
					String[] itemsplit = sbItems.get(j).split("-");
					if(itemsplit[0].equalsIgnoreCase(itemname))
					{
						item =  itemsplit[0];
						priceperqty = Double.valueOf(itemsplit[1]);
					}
					
				}	
				break;
				
			case "Rasavid":
				AddRasavidItems();
				for(int i=0;i<RasavidItems.size();i++)
					{	
					System.out.println(RasavidItems.get(i));
					}
					
				GetItemName();
				for(int j = 0;j<RasavidItems.size();j++)
				{	
					String[] itemsplit = RasavidItems.get(j).split("-");
					if(itemsplit[0].equalsIgnoreCase(itemname))
					{
						item =  itemsplit[0];
						priceperqty = Double.valueOf(itemsplit[1]);
					}
					
				}	
				break;
				
			case "SS":
				AddssItems();
				for(int i=0;i<ssItems.size();i++)
					{	
					System.out.println(ssItems.get(i));
					}
					
				GetItemName();
				for(int j = 0;j<ssItems.size();j++)
				{	
					String[] itemsplit = ssItems.get(j).split("-");
					if(itemsplit[0].equalsIgnoreCase(itemname))
					{
						item =  itemsplit[0];
						priceperqty = Double.valueOf(itemsplit[1]);
					}
					
				}
				break;
				
			case "Khalids":
				AddKhalidsItems();
				for(int i=0;i<KhalidsItems.size();i++)
					{	
					System.out.println(KhalidsItems.get(i));
					}
					
				GetItemName();
				for(int j = 0;j<KhalidsItems.size();j++)
				{	
					String[] itemsplit = KhalidsItems.get(j).split("-");
					if(itemsplit[0].equalsIgnoreCase(itemname))
					{
						item =  itemsplit[0];
						priceperqty = Double.valueOf(itemsplit[1]);
					}
					
				}
				break;
				default:
					System.out.println("Invlid Hotel Name... Please select a valid hotel");
					break;
			}
			
			return priceperqty;
	}
	
	public Double PriceCalculation()
	{
		GetItem();
		totalprice = priceperqty*GetQuantity();		
		return totalprice;	
	}
}
