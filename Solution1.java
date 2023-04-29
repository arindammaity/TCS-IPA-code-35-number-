package ilp;
import java.util.*;
public class Solution1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Player[] pp = new Player[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();
			sc.nextLine();
			pp[i]= new Player(a,b,c,d);
		}
		String  e = sc.nextLine();
		Player[]  ppp =  searchPlayerForMatch( pp, e);
		if(ppp.length>0)
		{
			for(int i=0;i<ppp.length;i++)
			{
				System.out.println(ppp[i].getId());
			}
		}
		else
		{
			System.out.println("Nothing");
		}
		
	}
	public static  Player[]    searchPlayerForMatch(Player[] pp,String e)
	{
		Player[] ppp = new Player[0];
		for(int i=0;i<4;i++)
		{
			if(pp[i].getSide().equals(e))
			{
				ppp = Arrays.copyOf(ppp,ppp.length+1);
				ppp[ppp.length-1]=pp[i];
			}
		}
		Arrays.sort(ppp,(x,y)->x.getId()-y.getId());
		return ppp;
	}

}
class Player
{
	int id;
	String country;
	String side ;
	double price;
	Player(int id,String country,String side,double price)
	{
		this.id = id;
		this.country = country;
		this.side = side;
		this.price = price;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getSide()
	{
		return side;
	}
	public void setSide(String side)
	{
		this.side = side;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
}
