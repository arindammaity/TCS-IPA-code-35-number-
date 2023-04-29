package ilp;
import java.util.*;
public class Solution41
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Phony[] pp= new Phony[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int  d = sc.nextInt();
			sc.nextLine();
			pp[i]= new Phony(a,b,c,d);
		}
		String  e= sc.nextLine();
		String  f = sc.nextLine();
		int  price = findpriceforgivenbrand(pp, e);
		if(price==0)
		{
			System.out.println("The given brand is not available");
		}
		else
		{
			System.out.println(price);
		}
		
		Phony  temp= getphonebasedonos( pp, f);
		System.out.println(temp.getId());
		
	}
	
	public  static  int  findpriceforgivenbrand(Phony[] pp,String e)
	{
		for(int i=0;i<4;i++)
		{
			if(pp[i].getBrand().equalsIgnoreCase(e))
			{
				return pp[i].getPrice();
			}
		}
		return 0;
	}
	public static  Phony   getphonebasedonos(Phony[] pp,String f)
	{
		for(int i=0;i<4;i++)
		{
			if(pp[i].getOs().equalsIgnoreCase(f))
			{
				return pp[i];
			}
		}
		return null;
	}

}
class Phony
{
	int id;
	String os;
	String brand;
	int price;
	Phony(int id,String os,String brand,int price)
	{
		this.id=id;
		this.os=os;
		this.brand=brand;
		this.price=price;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getOs()
	{
		return os;
	}
	public void setOs(String os)
	{
		this.os=os;
	}
	public String  getBrand()
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
}
