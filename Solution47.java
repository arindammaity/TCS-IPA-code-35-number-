package ilp;
import java.util.*;
public class Solution47
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Watch[] mm = new Watch[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			double c = sc.nextDouble();
			sc.nextLine();
			String d = sc.nextLine();
			mm[i]= new Watch(a,b,c,d);
		}
		String e = sc.nextLine();
		
		int  count =  countwatchesbybrand( mm, e);
		if(count==0)
		{
			System.out.println("No such Watch");
		}
		else
		{
			System.out.println(count);
		}
	}
	public static  int   countwatchesbybrand(Watch[] mm,String e)
	{
		int count=0;
		for(int i=0;i<4;i++)
		{
			if(mm[i].getBrand().equalsIgnoreCase(e) && mm[i].getBrand().charAt(0)=='A'||mm[i].getBrand().charAt(0)=='E'||mm[i].getBrand().charAt(0)=='I'||mm[i].getBrand().charAt(0)=='O'||mm[i].getBrand().charAt(0)=='U' )
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

}
class Watch
{
	int id;
	String name;
	double price;
	String brand;
	Watch(int id,String name,double price,String brand)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.brand=brand;
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
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public String  getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
}
