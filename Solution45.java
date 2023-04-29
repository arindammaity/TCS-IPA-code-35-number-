package ilp;
import java.util.*;
public class Solution45
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Theatre[] tt= new Theatre[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String e = sc.nextLine();
			tt[i]=new Theatre(a,b,c,d,e);
		}
		int  f = sc.nextInt();
		sc.nextLine();
		String g= sc.nextLine();
		
		int  temp=  gettheatrecapacity( tt, f);
		if(temp==0)
		{
			System.out.println("Theatre number is incorrect");
		}
		else
		{
			System.out.println(temp);
		}
		
		Theatre  pq= getsecondlowesttheatrerating( tt, g);
		if(pq==null)
		{
			System.out.println("No such Theatre");
		}
		else
		{
			System.out.println(pq.getName());
			System.out.println(pq.getRating());
		}
	}
	
	public static   int   gettheatrecapacity(Theatre[] tt,int f)
	{
		for(int i=0;i<4;i++)
		{
			if(tt[i].getNumber()==f)
			{
				return tt[i].getCapacity();
			}
		}
		return 0;
	}
	
	public static    Theatre   getsecondlowesttheatrerating(Theatre[] tt,String g)
	{
		ArrayList<Theatre>pq=new ArrayList<Theatre>();
		for(int i=0;i<4;i++)
		{
			if(tt[i].getType().equalsIgnoreCase(g))
			{
				pq.add(tt[i]);
			}
		}
		if(pq.size()>1)
		{
		Comparator<Theatre>mysort= Comparator.comparing(Theatre::getRating);
		Collections.sort(pq,mysort);
		return pq.get(1);
		}
		else
		{
			return null;
		}
	}

}
class Theatre
{
	int number;
	String name;
	int capacity;
	int rating;
	String type;
	Theatre(int number,String name,int capacity,int rating,String type)
	{
		this.number=number;
		this.name=name;
		this.capacity=capacity;
		this.rating=rating;
		this.type=type;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number=number;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating=rating;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	
}