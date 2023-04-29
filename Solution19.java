package ilp;
import java.util.*;
public class Solution19
{
	public static  void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Fruits[] ff = new Fruits[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d =  sc.nextInt();
			sc.nextLine();
			ff[i]= new Fruits(a,b,c,d);
		}
		int  e = sc.nextInt();
		
		Fruits   pq=  find( ff, e);
		if(pq==null)
		{
			System.out.println("pppppppppppppppppppppp");
		}
		else
		{
			System.out.println(pq.getFruitid());
		}
	}
   public static  Fruits   find(Fruits[] ff,int e)
   {
	   ArrayList<Fruits>pq= new ArrayList<Fruits>();
	   for(int i=0;i<4;i++)
	   {
		   if(ff[i].getRating()>e)
		   {
			   pq.add(ff[i]);
		   }
	   }
	   if(pq.size()>1)
	   {
	   Comparator<Fruits>mysort = Comparator.comparing(Fruits::getPrice);
	   Collections.sort(pq,mysort);
	   return pq.get(1);
	   }
	   else
	   {
		   return null;
	   }
   }
}
class Fruits
{
	int fruitid;
	String fruitname;
	int price;
	int rating;
	Fruits(int fruitid,String fruitname,int price,int rating)
	{
		this.fruitid=fruitid;
		this.fruitname=fruitname;
		this.price=price;
		this.rating=rating;
	}
	public int getFruitid()
	{
		return fruitid;	
	}
	public void setFruitid(int fruitid)
	{
		this.fruitid=fruitid;
	}
	public String getFruitname()
	{
		return fruitname;	
	}
	public void setFruitname(String fruitname)
	{
		this.fruitname=fruitname;
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
