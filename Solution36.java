package ilp;
import java.util.*;
public class Solution36
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ResortGuest[] rr = new ResortGuest[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b= sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String  e = sc.nextLine();
			double  f = sc.nextDouble();
			sc.nextLine();
			rr[i]= new ResortGuest(a,b,c,d,e,f);
		}
		String g = sc.nextLine();
		String h = sc.nextLine();
	    sc.close();	
		int  count=  findnumberofroomsbookedinmonth( rr, g);
		if(count==0)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println(count);
		}
		ResortGuest  temp = searchresortguestbymealopted( rr, h);
		if(temp!=null)
		{
			System.out.println(temp.getId());
		}
		else
		{
			System.out.println("you");
		}
	}
	public static   int   findnumberofroomsbookedinmonth(ResortGuest[] rr,String g)
	{
		int count=0;
		for(ResortGuest Data: rr)
		{
			if(Data.getBooking().substring(3,6).equalsIgnoreCase(g))
			{
				count++;
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
	public static  ResortGuest  searchresortguestbymealopted(ResortGuest[] rr,String h)
	{
		ArrayList<ResortGuest>pq= new ArrayList<ResortGuest>();
		for(int i=0;i<4;i++)
		{
			if(rr[i].getOption().equalsIgnoreCase(h))
			{
				pq.add(rr[i]);
			}
		}
		Comparator<ResortGuest>mysort=Comparator.comparing(ResortGuest::getId);
		Collections.sort(pq,mysort);
		return pq.get(0);
	}

}
class ResortGuest
{
	int id;
	String name;
	String booking;
	int booked;
	String option;
	double bill;
	ResortGuest(int id,String name,String booking,int booked,String option,double bill)
	{
		this.id=id;
		this.name=name;
		this.booking =booking;
		this.booked=booked;
		this.option=option;
		this.bill=bill;
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
	public String getBooking()
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
	public String  getOption()
	{
		return option;
	}
	public void setOption(String option)
	{
		this.option=option;
	}
	public double getBill()
	{
		return bill;
	}
	public void setId(double bill)
	{
		this.bill=bill;
	}
}
