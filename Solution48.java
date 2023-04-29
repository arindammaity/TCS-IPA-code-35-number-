package ilp;
import java.util.*;
public class Solution48
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Market[] mm= new Market[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int  d= sc.nextInt();
			boolean  e = sc.nextBoolean();
			sc.nextLine();
			mm[i]=new Market(a,b,c,d,e);
		}
		String  f = sc.nextLine();
		
		int  sum = findtotalpriceforgivencategory( mm, f);
		if(sum==0)
		{
			System.out.println("No item available with the given category");
		}
		else
		{
			System.out.println(sum);
		}
		
		Market   pq= findavailableitemwiththirdminimumprice( mm);
		if(pq==null)
		{
			System.out.println("No such item available");
		}
		else
		{
			System.out.println(pq.getId());
			System.out.println(pq.getPrice());
		}
	}
	
	public  static int  findtotalpriceforgivencategory(Market[] mm,String f)
	{
		int sum =0;
		for(int i=0;i<4;i++)
		{
			if(mm[i].getCategory().equalsIgnoreCase(f))
			{
				sum = sum+mm[i].getPrice();
			}
		}
		if(sum!=0)
		{
			return sum;
		}
		else
		{
			return 0;
		}
	}
	
	public static  Market    findavailableitemwiththirdminimumprice(Market[] mm)
	{
		ArrayList<Market>pq= new ArrayList<Market>();
		for(int i=0;i<4;i++)
		{
			pq.add(mm[i]);
		}
		if(pq.size()>2)
		{
		Comparator<Market>mysort= Comparator.comparing(Market::getPrice);
		Collections.sort(pq,mysort);
		return pq.get(2);
		}
		else
		{
			return null;
		}
	}
}
class Market
{
	int id;
	String name;
	String category;
	int price;
	boolean available;
	Market(int id,String name,String category,int price,boolean available)
	{
		this.id=id;
		this.name=name;
		this.category=category;
		this.price=price;
		this.available=available;
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
	public String  getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public boolean getAvailable()
	{
		return available;
	}
	public void setAvailable(boolean available)
	{
		this.available=available;
	}
}
