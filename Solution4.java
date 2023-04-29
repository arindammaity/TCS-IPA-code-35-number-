package ilp;
import java.util.*;
public class Solution4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Newspaper[] news=new Newspaper[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c= sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			news[i]= new Newspaper(a,b,c,d);
		}
		int  e = sc.nextInt();
		sc.nextLine();
		String f = sc.nextLine();
		int sum = findTotalPriceByPublicationYear(news, e);
		if(sum>0)
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println("No Newspaper found with the mentioned attribute");
		}
		
		Newspaper  temp =searchNewspaperByName(news, f);
		if(temp==null)
		{
			System.out.println("No Newspaper found with the given name");
		}
		else
		{
			System.out.println(temp.getRegNo());
			System.out.println(temp.getName());
			System.out.println(temp.getPublicationYear());
			System.out.println(temp.getPrice());
		}
	}
	public static int findTotalPriceByPublicationYear(Newspaper[] news,int e)
	{
		int sum=0;
		for(int i=0;i<4;i++)
		{
			if(news[i].getPublicationYear()==e)
			{
				sum = sum+news[i].getPrice();
			}
		}
		return sum;
	}
	
	public static Newspaper searchNewspaperByName(Newspaper[] news,String f)
	{
		for(int i=0;i<4;i++)
		{
			if(news[i].getName().equals(f))
			{
				return news[i];
			}
		}
		return null;
	}

}
class Newspaper
{
	int regNo;
	String name;
	int publicationYear;
	int price;
	Newspaper(int regNo,String name,int publicationYear,int  price)
	{
		this.regNo=regNo;
		this.name=name;
		this.publicationYear=publicationYear;
		this.price=price;
	}
	public int getRegNo()
	{
		return regNo;
	}
	public void setRegNo(int regNo)
	{
		this.regNo = regNo;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getPublicationYear()
	{
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear)
	{
		this.publicationYear = publicationYear;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
}
