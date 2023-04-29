package ilp;
import java.util.*;
public class Solution18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Bill[] bb=new Bill[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();
			boolean e = sc.nextBoolean();
			bb[i]= new Bill(a,b,c,d,e);
		}
		boolean f = sc.nextBoolean();
		sc.nextLine();
		String g = sc.nextLine();
		Bill[]   yy = kkk (bb, f);
		if(yy!=null)
		{
			System.out.println(yy[yy.length-1].getBillno());
		}
		else
		{
			System.out.println("Nothing");
		}
		
		int  count =   iii(bb, g);
		if(count>0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("oii tor bap ka dak");
		}
		
	}
	public static Bill[] kkk(Bill[] bb,boolean f)
	{
		Bill[] yy = new Bill[0];
		for(int i=0;i<4;i++)
		{
			if(bb[i].getStatus()==false)
			{
				yy= Arrays.copyOf(yy,yy.length+1);
				yy[yy.length-1]=bb[i];
			}
		}
		Arrays.sort(yy,(p,q)->p.getBillno()-q.getBillno());
		return yy;
	}
	public static    int   iii(Bill[]bb,String g)
	{
		int count=0;
		for(int i=0;i<4;i++)
		{
		if(bb[i].getTypeofconnection().equalsIgnoreCase(g))
		   {
			count++;
		   }
	    }
		return count;
	}

}
class Bill
{
	int billno;
	String name;
	String typeofconnection;
	double billamount;
	boolean status;
	Bill(int billno,String name,String typeofconnection,double billamount,boolean status)
	{
		this.billno=billno;
		this.name=name;
		this.typeofconnection=typeofconnection;
		this.billamount=billamount;
		this.status=status;
	}
	public int getBillno()
	{
		return billno;
	}
	public void setBillno(int billno)
	{
		this.billno=billno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getTypeofconnection()
	{
		return typeofconnection;
	}
	public void setTypeofconnection(String typeofconnection)
	{
		this.typeofconnection=typeofconnection;
	}
	public double getBillamount()
	{
		return billamount;
	}
	public void setBillamount(double billamount)
	{
		this.billamount=billamount;
	}
	public boolean getStatus()
	{
		return status;
	}
	public void setStatus(boolean status)
	{
		this.status=status;
	}
	
}
