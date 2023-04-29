package ilp;
import java.util.*;
public class Solution22
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Autonomouscar[] auto = new Autonomouscar[4];
		for(int i=0;i<4;i++)
		{
			int  a =sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String e=sc.nextLine();	
			auto[i]= new Autonomouscar(a,b,c,d,e);
		}
		String g = sc.nextLine();
		String h = sc.nextLine();
		
		
		int sum = hh( auto,g);
		if(sum==0)
		{
			System.out.println("NOTHING");
		}
		else
		{
			System.out.println(sum);
		}
		
		Autonomouscar hello =  gg(auto, h);
		if(hello==null)
		{
			System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		}
		else
		{
			System.out.println(hello.getBrand()+"::"+hello.getGrade());
		}
		
	}
	
	public static   int hh(Autonomouscar[] auto,String g)
	{
		int sum=0;
		for(int i=0;i<4;i++)
		{
			if(auto[i].getEnvironment().equalsIgnoreCase(g))
			{
				sum = sum +auto[i].getNooftestspassed();
			}
		}
		if(sum>0)
		{
			return sum;
		}
		else
		{
			return 0;
		}
	}
	
	public static   Autonomouscar  gg(Autonomouscar[] auto,String h)
	{
		for(int i=0;i<4;i++)
		{
			if(auto[i].getBrand().equalsIgnoreCase(h))
			{
				int rating = (auto[i].getNooftestspassed()*100)/auto[i].getNooftestsconducted();
				if(rating>=80)
					auto[i].setGrade("A1");
				else
					auto[i].setGrade("B2");
				return auto[i];
			}
		}
		return null;
	}

}
class Autonomouscar
{
	int carid;
	String brand;
	int nooftestsconducted;
	int nooftestspassed;
	String environment;
	String grade;
	Autonomouscar(int carid,String brand,int nooftestsconducted,int nooftestspassed,String environment)
	{
		this.carid=carid;
		this.brand=brand;
		this.nooftestsconducted=nooftestsconducted;
		this.nooftestspassed=nooftestspassed;
		this.environment=environment;
		
	}
	public int getCarid()
	{
		return carid;
	}
	public void setCarid(int carid)
	{
		this.carid=carid;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public int getNooftestsconducted()
	{
		return nooftestsconducted;
	}
	public void setNooftestsconducted(int  nooftestsconducted)
	{
		this.nooftestsconducted=nooftestsconducted;
	}
	public int getNooftestspassed()
	{
		return nooftestspassed;
	}
	public void setNooftestspassed(int nooftestspassed)
	{
		this.nooftestspassed=nooftestspassed;
	}
	public String getEnvironment()
	{
		return environment;
	}
	public void setEnvironment(String environment)
	{
		this.environment=environment;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	
	
}
