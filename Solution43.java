package ilp;
import java.util.*;
public class Solution43
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Mobilees [] mm= new Mobilees[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			String d = sc.nextLine();
			mm[i]= new Mobilees(a,b,c,d);
		}
		String  l = sc.nextLine();
		int count = countmobilebybrand( mm , l);
		System.out.println(count);
		
		Mobilees   pq =  getsecondhighestprice( mm);
		System.out.println(pq.getId());
		System.out.println(pq.getName());
		System.out.println(pq.getPrice());
		System.out.println(pq.getBrand());
		
	}
	public static int countmobilebybrand(Mobilees[] mm ,String l)
	{
		int count=0;
		for(int i=0;i<4;i++)
		{
			if(mm[i].getBrand().equalsIgnoreCase(l))
			{
			    count++;	
			}
		}
		return count;
	}
	public static  Mobilees    getsecondhighestprice(Mobilees[] mm)
	{
		ArrayList<Mobilees>pq= new ArrayList<Mobilees>();
		for(int i=0;i<4;i++)
		{
			pq.add(mm[i]);
		}
		Comparator<Mobilees>mysort = Comparator.comparing(Mobilees::getPrice);
		Collections.sort(pq,mysort);
		return pq.get(2);
	}

}
class Mobilees
{
	int  id;
	String name;
	int price;
	String brand;
	Mobilees(int id,String name,int price,String brand)
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
	public String getBrand()
	{
		return brand;
	}
	public void setId(String brand)
	{
		this.brand=brand;
	}
}
