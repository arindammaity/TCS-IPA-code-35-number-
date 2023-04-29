package ilp;
import java.util.*;
public class Solution54
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HeadSets[] hh = new HeadSets[4];
		for(int i=0;i<4;i++)
		{
			String  a = sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			boolean d = sc.nextBoolean();
			sc.nextLine();
			hh[i]=new HeadSets(a,b,c,d);
		}
		String  e = sc.nextLine();
		int sum = findTotalPriceForGivenBrand ( hh, e);
	    if(sum==0)
	    {
	    	System.out.println("No Headsets available with the given brand");
	    }
	    else
	    {
	    	System.out.println(sum);
	    }
	    
	    HeadSets   pq= findAvailableHeadsetWithSecondMinPrice ( hh);
	    if(pq==null)
	    {
	    	System.out.println("No Headsets available");
	    }
	    else
	    {
	    	System.out.println(pq.getName());
	    	System.out.println(pq.getPrice());
	    }
	}
	public static  int findTotalPriceForGivenBrand (HeadSets[] hh,String e)
	{
		int sum=0;
		for(int i=0;i<4;i++)
		{
			if(hh[i].getBrand().equalsIgnoreCase(e))
			{
				sum = sum +hh[i].getPrice();
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
	
	public static   HeadSets   findAvailableHeadsetWithSecondMinPrice (HeadSets[] hh)
	{
		ArrayList<HeadSets>pq= new ArrayList<HeadSets>();
		for(int i=0;i<4;i++)
		{
			if(hh[i].getAvailable()==true )
			{
				pq.add(hh[i]);
			}
		}
		if(pq.size()>1)
		{
		Comparator<HeadSets>mysort = Comparator.comparing(HeadSets::getPrice);
		Collections.sort(pq,mysort);
		return pq.get(1);
		}
		else
		{
			return null;
		}
	}

}
class HeadSets
{
	String name;
	String brand;
	int price;
	boolean available;
	HeadSets(String name,String brand,int price,boolean available)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.available=available;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public Boolean getAvailable()
	{
		return available;
	}
	public void setName(boolean available)
	{
		this.available=available;
	}	
}
