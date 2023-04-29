package ilp;
import java.util.*;
public class Solution32
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Sims[] ss= new Sims[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String  b = sc.nextLine();
			int c = sc.nextInt();
			double d = sc.nextDouble();
			sc.nextLine();
			String  e = sc.nextLine();
			ss[i]= new Sims(a,b,c,d,e);
		}
		String  f = sc.nextLine();
		double  g= sc.nextDouble();
		sc.nextLine();
		sc.close();
		
		
		Sims[] dd= matchAndsort(ss, f, g);
			for(int l=0;l<dd.length;l++)
			{
				System.out.println(dd[l].getId());
			}
	}
	public static  Sims[]  matchAndsort(Sims[] ss,String f,double g)
	{
		Sims[] dd= new Sims[0];
		for(int k=0;k<4;k++)
		{
			if(ss[k].getCircle().equalsIgnoreCase(f) && ss[k].getRatepersecond()<g)
			{
				dd= Arrays.copyOf(dd,dd.length+1);
				dd[dd.length-1]=ss[k];
			}
		}
		Arrays.sort(dd,(x,y)->y.getBalance()-x.getBalance());
		return dd;
	}

}
class Sims
{
	int id;
	String company;
	int balance;
	double ratepersecond;
	String circle;
	Sims(int id,String company,int balance,double  ratepersecond,String circle)
	{
		this.id=id;
		this.company = company;
		this.balance=balance;
		this.ratepersecond=ratepersecond;
		this.circle=circle;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public double getRatepersecond()
	{
		return ratepersecond;
	}
	public void setRatepersecond(double ratepersecond)
	{
		this.ratepersecond=ratepersecond;
	}
	public String getCircle()
	{
		return circle;
	}
	public void setCircle(String circle)
	{
		this.circle=circle;
	}
}
