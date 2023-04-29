package ilp;
import java.util.*;
public class Solution51
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Hotellll[] hh = new Hotellll[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String  c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String  e = sc.nextLine();
			double  f = sc.nextDouble();
			sc.nextLine();
			hh[i]= new Hotellll(a,b,c,d,e,f);
		}
		String  g = sc.nextLine();
		String h = sc.nextLine();
		int  count =  noOfRoomsBookedInGivenMonth( hh, g);
		if(count==0)
		{
			System.out.println("No rooms booked in the given month");
		}
		else
		{
			System.out.println(count);
		}
		
		Hotellll   pq=  searchHotelByWifiOption( hh,h);
		if(pq==null)
		{
			System.out.println("No such option available");
		}
		else
		{
			System.out.println(pq.getId());
		}
		
	}
	public static    int   noOfRoomsBookedInGivenMonth(Hotellll[] hh,String g)
	{
		int count=0;
		for(Hotellll Data:hh)
		{
			if(Data.getBooking().substring(3,6).equalsIgnoreCase(g))
			{
				count=count+Data.getBooked();
			}
		}
		if(count!=0)
		{
			return count;
		}
		else
		{
			return 0;
		}
	}
	public static    Hotellll    searchHotelByWifiOption(Hotellll[] hh,String h)
	{
		ArrayList<Hotellll>pq=new ArrayList<Hotellll>();
		for(int i=0;i<4;i++)
		{
			if(hh[i].getWifi().equalsIgnoreCase(h))
			{
				pq.add(hh[i]);
			}
		}
		if(pq.size()>2)
		{
	    Comparator<Hotellll>mysort = Comparator.comparing(Hotellll:: getTotalbill);	
		Collections.sort(pq,mysort);
		return pq.get(2);
		}
		else
		{
			return null;
		}
	}
	

}
class Hotellll
{
	int id;
	String name;
	String booking;
	int booked;
	String wifi;
	double totalbill;
	Hotellll(int id,String name,String booking,int booked,String wifi,double totalbill)
	{
		this.id=id;
		this.name=name;
		this.booking=booking;
		this.booked=booked;
		this.wifi=wifi;
		this.totalbill=totalbill;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String  getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String  getBooking()
	{
		return booking;
	}
	public void setBooking(String booking)
	{
		this.booking=booking;
	}
	public int getBooked()
	{
		return booked;
	}
	public void setBooked(int booked)
	{
		this.booked=booked;
	}
	public String  getWifi()
	{
		return wifi;
	}
	public void setWifi(String wifi)
	{
		this.wifi=wifi;
	}
	public double getTotalbill()
	{
		return totalbill;
	}
	public void setTotalbill(double totalbill)
	{
		this.totalbill=totalbill;
	}
	
}
