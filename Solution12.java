package ilp;
import java.util.*;
public class Solution12
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Sim[] ss= new Sim[5];
		for(int i=0;i<5;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			double c= sc.nextDouble();
			sc.nextLine();
			double d = sc.nextDouble();
			sc.nextLine();
			String  e= sc.nextLine();
			
			ss[i]= new Sim(a,b,c,d,e);
		}
			String  f = sc.nextLine();
			String  g = sc.nextLine();
			
			Sim[]  sss=  transferCustomerCircle(ss,f,g);
				for(int i=0;i<sss.length;i++)
				{
					System.out.println(sss[i].getSimId()+" "+sss[i].getCustomerName()+" "+"KOL"+" "+sss[i].getRatePerSecond());
				}
			
	}
   public static   Sim[]    transferCustomerCircle(Sim[] ss,String f,String g)
   {
	   double[] ll = new double[0];
	   
	   for(int i=0;i<5;i++)
	   {
		   if(ss[i].getCircle().equalsIgnoreCase(f))
		   {
			   ss[i].circle=g;
			   ll=Arrays.copyOf(ll,ll.length+1 );
			   ll[ll.length-1]=ss[i].getRatePerSecond();   
		   }
	   }
	   Arrays.sort(ll);
	   Sim[] sss= new Sim[0];
	   for(int i=ll.length-1;i>=0;i--)
	   {
		   for(int j=0;j<ss.length;j++)
		   {
			   if(ss[j].getRatePerSecond()==ll[i])
			   {
				   sss= Arrays.copyOf(sss,sss.length+1);
				   sss[sss.length-1]=ss[j];
			   }
		   }
	   }
	   return sss;
	   
   }
	
	
	
}
class Sim
{
	int simId;
	String customerName;
	double  balance;
	double ratePerSecond;
	String circle;
	Sim(int simId,String customerName,double balance,double ratePerSecond,String  circle)
	{
		this.simId=simId;
		this.customerName=customerName;
		this.balance=balance;
		this.ratePerSecond=ratePerSecond;
		this.circle=circle;
	}
	public int getSimId()
	{
		return simId;
	}
	public void setSimId(int simId)
	{
		this.simId=simId;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public  double getRatePerSecond()
	{
		return ratePerSecond;
	}
	public void setRatePerSecond(double ratePerSecond)
	{
		this.ratePerSecond=ratePerSecond;
	}
	public String getCircle()
	{
		return circle;
	}
	public void setCircle(String  circle)
	{
		this.circle=circle;
	}
	
}
