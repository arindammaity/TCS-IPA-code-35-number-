package ilp;
import java.util.*;
public class Solution9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		FootWear[] foot = new FootWear[5];
		for(int i=0;i<5;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			foot[i]= new FootWear(a,b,c,d);
		}
		String e = sc.nextLine();
		String f = sc.nextLine();
		int count = getCountByType(foot, e);
		if(count>0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("Footwear not available");
		}
		FootWear pq=   getSecondHighestPriceByBrand(foot,  f);
		if(pq==null)
		{
			System.out.println("Brand n ot available");
			
		}
		else
		{
			System.out.println(pq.getFootwearId());
			System.out.println(pq.getFootwearName());
			System.out.println(pq.getPrice());
		}
		
	}
   public static     int  getCountByType(FootWear[] foot,String e)
   {
	   int count=0;
	   for(int i=0;i<5;i++)
	   {
		   if(foot[i].getFootwearType().equalsIgnoreCase(e))
		   {
			   count++;
		   }
	   }
	   
		   return count;
	   
   }
   
   public static   FootWear    getSecondHighestPriceByBrand(FootWear[] foot, String f)
   {
	   ArrayList<FootWear>pq= new ArrayList<FootWear>();
	   for(int i=0;i<5;i++)
	   {
		   if(foot[i].getFootwearName().equalsIgnoreCase(f))
		   {
			   pq.add(foot[i]);
		   }
	   }
	   if(pq.size()>1)
	   {
	   Comparator<FootWear>mysort = Comparator.comparing(FootWear::getPrice);
	   Collections.sort(pq,mysort);
	   return pq.get(1);
	   }
	   else
	   {
		   return null;
	   }
   }
}
class FootWear
{
	int footwearId;
	String footwearName;
	String footwearType;
	int price;
	FootWear(int footwearId,String footwearName,String footwearType,int price)
	{
		this.footwearId=footwearId;
		this.footwearName=footwearName;
		this.footwearType=footwearType;
		this.price = price;
	}
	public int getFootwearId()
	{
		return footwearId;
	}
	public void setFootwearId(int footwearId)
	{
		this.footwearId=footwearId;
	}
	public String getFootwearName()
	{
		return footwearName;
	}
	public void setFootwearName(String footwearName)
	{
		this.footwearName=footwearName;
	}
	public String getFootwearType()
	{
		return footwearType;
	}
	public void setFootwearType(String footwearType)
	{
		this.footwearType=footwearType;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
}

