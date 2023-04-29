package ilp;
import java.util.*;
public class Solution50
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Laptop[] ll=new Laptop[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();
			int e = sc.nextInt();
			sc.nextLine();
			ll[i]= new Laptop(a,b,c,d,e);
		}
		String  f = sc.nextLine();
		String  g = sc.nextLine();
		
		int count= countOfLaptopsByBrand ( ll, f);
		if(count==0)
		{
			System.out.println("The given brand is not available.");
		}
		else
		{
			System.out.println(count);
		}
		
		Laptop[] kk= searchLaptopByOsType( ll,g);
		if(kk==null)
		{
			System.out.println("The given os is not available");
		}
		else
		{
			for(int i=0;i<kk.length;i++)
			{
				System.out.println(kk[i].getId());
				System.out.println(kk[i].getRating());
			}
		}
		
	}
	public static int countOfLaptopsByBrand (Laptop[] ll,String f)
	{
		int count=0;
		for(int i=0;i<4;i++)
		{
			if(ll[i].getBrand().equalsIgnoreCase(f) && ll[i].getRating()>3)
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
	
	public static    Laptop[]  searchLaptopByOsType(Laptop[] ll,String g)
	{
		Laptop[] kk = new Laptop[0];
		for(int i=0;i<4;i++)
		{
			if(ll[i].getType().equalsIgnoreCase(g))
			{
				kk= Arrays.copyOf(kk,kk.length+1);
				kk[kk.length-1]=ll[i];
			}
		}
		if(kk.length>0)
		{
		Arrays.sort(kk,(x,y)->y.getId()-x.getId());
		return kk;
		}
		else
		{
			return null;
		}
	}

}
class Laptop
{
	int id;
	String brand;
	String type;
	double price;
	int rating;
	Laptop(int id,String brand,String type,double price,int rating)
	{
		this.id=id;
		this.brand=brand;
		this.type=type;
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
	public String  getBrand()
	{
		return brand;
	}
	public void setId(String brand)
	{
		this.brand=brand;
	}
	public String  getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
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
