package ilp;
import java.util.*;
public class Solution35
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Hotels[] hotel = new Hotels[4];
		for(int i=0;i<4;i++)
		{
			int  a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			boolean e = sc.nextBoolean();
			sc.nextLine();
			hotel[i]= new Hotels(a,b,c,d,e);
		}
		String   f = sc.nextLine();
		
		double  avg = findavgpriceforgiventype( hotel , f);
		if(avg==0)
		{
			System.out.println("No such hotel");
		}
		else
		{
			System.out.println(avg);
		}
		
		Hotels[]  ff= findhotelwithwifiavailable( hotel);
		if(ff.length>0)
		{
			for(int i=0;i<ff.length;i++)
			{
				System.out.println(ff[i].getName()+":"+ff[i].getPrice());
			}
		}
		else
		{
			System.out.println("No wifi available");
		}
	}
	public static  double findavgpriceforgiventype(Hotels[] hotel ,String f)
	{
		int sum =0;
		int count=0;
		for(int i=0;i<4;i++)
		{
			if(hotel[i].getWififacility()==true && hotel[i].getRoomtype().equalsIgnoreCase(f))
			{
				count++;
				sum = sum +hotel[i].getPrice();
			}
		}
		if(count!=0)
		{
			return  (double)(sum/count);
		}
		else
		{
			return 0;
		}
	}
	
	public static   Hotels[] findhotelwithwifiavailable(Hotels[] hotel)
	{
		Hotels[]  ff = new Hotels[0];
		for(int i=0;i<4;i++)
		{
			if(hotel[i].getWififacility()==true)
			{
				ff= Arrays.copyOf(ff,ff.length+1);
				ff[ff.length-1]=hotel[i];
			}
		}
		return ff;
	}

}
class Hotels
{
	int regno;
	String name;
	String roomtype;
	int price;
	boolean wififacility;
	Hotels(int regno,String name,String roomtype,int price,boolean wififacility)
	{
		this.regno=regno;
		this.name=name;
		this.roomtype=roomtype;
		this.price=price;
		this.wififacility=wififacility;
	}
	public int getRegno()
	{
		return regno;
	}
	public void setRegno(int regno)
	{
		this.regno=regno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getRoomtype()
	{
		return roomtype;
	}
	public void setRoomtype(String roomtype)
	{
		this.roomtype=roomtype;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public boolean getWififacility()
	{
		return wififacility;
	}
	public void setWififacility(boolean wififacility)
	{
		this.wififacility=wififacility;
	}
}
