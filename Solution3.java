package ilp;
import java.util.*;
public class Solution3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Bank[] bb = new Bank[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			String d = sc.nextLine();
			bb[i]= new Bank(a,b,c,d);
		}
		String e=sc.nextLine();
		Bank temp = getSecondLowestNumberOfCustomersBank( bb);
		if(temp==null)
		{
			System.out.println("Hello");
			
		}
		else
		{
			System.out.println(temp.getBankId());
			System.out.println(temp.getBankName());
			System.out.println(temp.getNumberOfCustomers());
			System.out.println(temp.getCity());
			
		}
		
		int avg = findAvgNumberOfCustomersByCity( bb, e);
		if(avg ==0)
		{
			System.out.println("World");
		}
		else
		{
			System.out.println(avg);
		}
	}
	public static Bank getSecondLowestNumberOfCustomersBank(Bank[] bb)
	{
		
		int[] banks = new int[0];
		for(int i=0;i<4;i++)
		{
			banks = Arrays.copyOf(banks,banks.length+1);
			banks[banks.length-1]=bb[i].getNumberOfCustomers();
		}
		if(banks.length>1)
		{
			Arrays.sort(banks);
			int x = banks[1];
			if(x%2==0)
			{
			for(int i=0;i<bb.length;i++)
			{
				if(bb[i].getNumberOfCustomers()==x)
				{
					return bb[i];
				}
			}
			
		    }
		
	   }
		return null;
	}
	
	public static int findAvgNumberOfCustomersByCity(Bank[] bb,String e)
	{
		int count=0;
		int sum=0;
		for(int i=0;i<4;i++)
		{
		if(bb[i].getCity().equals(e))
		{
			count++;
			sum = sum + bb[i].getNumberOfCustomers();
		}
		}
		if(count>0)
		{
			return (sum/count);
		}
		else
		{
			return 0;
		}
	}

}
class Bank
{
	int bankId;
	String bankName;
	int numberOfCustomers;
	String city;
	Bank(int bankId,String bankName,int numberOfCustomers,String city)
	{
		this.bankId=bankId;
		this.bankName=bankName;
		this.numberOfCustomers=numberOfCustomers;
		this.city=city;
	}
	public int getBankId()
	{
		return bankId;
	}
	public void setBankId(int bankId)
	{
		this.bankId=bankId;
	}
	public String getBankName()
	{
		return bankName;
	}
	public void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	public int getNumberOfCustomers()
	{
		return numberOfCustomers;
	}
	public void setNumberOfCustomers(int numberOfCustomers)
	{
		this.numberOfCustomers=numberOfCustomers;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	
}
