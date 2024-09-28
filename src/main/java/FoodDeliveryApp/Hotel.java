package FoodDeliveryApp;
import java.util.*;

public class Hotel {

	//List<String> hotelsName = new ArrayList<String>();
	TreeMap<Integer,String> hotelsName = new TreeMap<>();
	String hotelname;
	
	//To add hotelnames
	public void addHotelName()
	{
		hotelsName.put(1, "A2B");
		hotelsName.put(2, "SB");
		hotelsName.put(3, "Rasavid");
		hotelsName.put(4, "SS");
		hotelsName.put(5, "Khalids");
	}
	
	public Integer getHotelName()
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("HotelName");
		
		addHotelName();
		/*for(int i=0;i<hotelsName.size();i++)
		{
		System.out.println( hotelsName.get(i));
		}*/
		for(Map.Entry M:hotelsName.entrySet())
		{
			System.out.println(M);
		}

		//Get input from user
		System.out.println("Enter valid hotel Name:");
		int hotelvalue = sc.nextInt();
		hotelname = hotelsName.get(hotelvalue);
		
		//System.out.println(hotelname);
		return hotelvalue;
		
	}
	
}
