package ilp;
import java.util.*;
public class Solution23
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Phone[] nn = new Phone[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			nn[i]= new Phone(a,b,c,d);
		}
		String e = sc.nextLine();
		String  f = sc.nextLine();
		int   sum =  findpriceforgivenbrand( nn, e);
		if(sum>0)
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println("The given brand is not available");
		}
		
		 Phone temp= getphoneidbasedonos(nn, f);
		 if(temp==null)
		 {
			 System.out.println("No phones are avialble with specified os and price range");
		 }
		 else
		 {
		    System.out.println(temp.getPhoneid());	 
		 }
		
	}
	public static  int   findpriceforgivenbrand(Phone[] nn,String e)
	{
		int sum=0;
		for(int i=0;i<4;i++)
		{
			if(nn[i].getBrand().equalsIgnoreCase(e))
			{
				sum = sum + nn[i].getPrice();
			}
		}
		return sum;
	}
	
	public static   Phone  getphoneidbasedonos(Phone[] nn,String f)
	{
	
		for(int i=0;i<4;i++)
		{
			if(nn[i].getOs().equalsIgnoreCase(f) && nn[i].getPrice()>=50000)
			{
				return nn[i];
				
			}
		}
		return null;
	}

}
class Phone
{
	int phoneid;
	String os;
	String brand;
	int price;
	Phone(int phoneid,String  os,String brand,int price)
	{
		this.phoneid=phoneid;
		this.os=os;
		this.brand=brand;
		this.price=price;
	}
	public int getPhoneid()
	{
		return phoneid;
	}
	public void setPhoneid(int phoneid)
	{
		this.phoneid=phoneid;
	}
	public String getOs()
	{
		return os;
	}
	public void setOs(String os)
	{
		this.os=os;
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
}
