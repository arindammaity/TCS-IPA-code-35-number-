package ilp;
import java.util.*;
public class Solution13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Flowers [] full = new Flowers[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c =sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String e = sc.nextLine();
			full[i]=new Flowers(a,b,c,d,e);
		}
		String  f = sc.nextLine();
		
		
		   int  temp=   findMinPriceByType (full ,f);
		   if(temp==0)
		   {
			   System.out.println("There is no flower with given type");
			   
		   }
		   else
		   {
			   System.out.println(temp);
		   }
		
	}
	
	public static   int    findMinPriceByType (Flowers[] full ,String f)
	{
		ArrayList<Flowers>pq= new ArrayList<Flowers>();
		for(int i=0;i<4;i++)
		{
			if(full[i].getType().equalsIgnoreCase(f) && full[i].getRating()>3  )
			{
				pq.add(full[i]);
			}
		}
		if(pq.size()>0)
		{
		Comparator<Flowers>mysort= Comparator.comparing(Flowers::getPrice);
		Collections.sort(pq,mysort);
		return pq.get(0).getFlowerId();
		}
		else
		{
		    return 0;
		}
		
	}

}
class Flowers
{
	int flowerId;
	String flowerName;
	int price;
	int rating;
	String type;
	Flowers(int flowerId,String flowerName,int price,int rating,String type)
	{
		this.flowerId=flowerId;
		this.flowerName=flowerName;
		this.price=price;
		this.rating=rating;
		this.type=type;
	}
	public int getFlowerId()
	{
		return flowerId;
	}
	public void setFlowerId(int flowerId)
	{
		this.flowerId=flowerId;
	}
	public String getFlowerName()
	{
		return flowerName;
	}
	public void setFlowerName(String flowerName)
	{
		this.flowerName=flowerName;
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
	public String  getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	
}
