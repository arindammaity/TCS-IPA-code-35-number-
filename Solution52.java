package ilp;
import java.util.*;
public class Solution52
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vegetable[] vv = new Vegetable[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			vv[i]= new Vegetable(a,b,c,d);
		}
		int  e = sc.nextInt();
		Vegetable   temp =   findminimumprice( vv, e);
		if(temp==null)
		{
			System.out.println("nothing");
		}
		else
		{
			System.out.println(temp.getId());
		}
		
		
	}
	public static Vegetable      findminimumprice(Vegetable[] vv,int e)
	{
		int pp= Integer.MAX_VALUE;
		Vegetable temp = null;
		for(int i=0;i<4;i++)
		{
			if(vv[i].getRating()>e && vv[i].getPrice()<pp )
			{
				pp=vv[i].getPrice();
				temp= vv[i];
			}
		}
		if(temp!=null)
		{
			return temp;
		}
		else
		{
			return null;
		}
	}

}
class Vegetable
{
	int id;
	String name;
	int price;
	int rating;
	Vegetable(int id,String name,int price,int rating)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating=rating;
	}
}
