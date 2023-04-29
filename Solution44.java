package ilp;
import java.util.*;
public class Solution44
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Fruitts[] ff = new 	Fruitts[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			ff[i]= new Fruitts(a,b,c,d);
		}
		int e = sc.nextInt();
		
		Fruitts  temp =  findmaximumpricebyrating ( ff , e);
		if(temp!=null)
		{
			System.out.println(temp.getId());
		}
		else
		{
			System.out.println("Nothing");
		}
	}
	public static    Fruitts  findmaximumpricebyrating (Fruitts[] ff ,int e)
	{
		Fruitts temp=null;
		int price= Integer.MIN_VALUE;
		for(int i=0;i<4;i++)
		{
			if(ff[i].getRating()>e && ff[i].getPrice()>e)
			{
				temp=ff[i];
				price=ff[i].getPrice();
			}
		}
		if(temp==null)
		{
			return null;
		}
		else
		{
			return temp;
		}
	}

}
class Fruitts
{
	int id;
	String name;
	int price;
	int rating;
	Fruitts(int id,String name,int price,int rating)
	{
		this.id= id;
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
	public void setName(String  name)
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
