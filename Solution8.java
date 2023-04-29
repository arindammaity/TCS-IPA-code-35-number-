package ilp;
import java.util.*;
public class Solution8 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TravelAgencies[] tt = new TravelAgencies[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			boolean e = sc.nextBoolean();
			tt[i]= new TravelAgencies(a,b,c,d,e);
		}
		int f = sc.nextInt();
		sc.nextLine();
		String g = sc.nextLine();
		
		int  max=   findAgencyWithHighestPackagePrice( tt);
		System.out.println(max);
		
		 TravelAgencies  temp =     agencyDetailsForGivenIdAndType( tt, f, g);
		 if(temp!=null)
		 {
			 System.out.println(temp.getAgencyName()+":"+temp.getPrice());
		 }
		 else
		 {
			 System.out.println("A string value should be printed here");
		 }
	}
     public static    int     findAgencyWithHighestPackagePrice(TravelAgencies[] tt)
     {
    	 int max = tt[0].getPrice();
    	 for(int i=1;i<4;i++)
    	 {
    		 if(tt[i].getPrice()>max)
    		 {
    			 max = tt[i].getPrice();
    		 }
    	 }
    	 return max;
     }
     
     public static    TravelAgencies     agencyDetailsForGivenIdAndType(TravelAgencies[] tt, int f, String g)
     {
    	 for(int i=0;i<4;i++)
    	 {
    		 if(tt[i].getFlightFacility()==true && tt[i].getRegNo()==f && tt[i].getPakageType().equalsIgnoreCase(g))
    		 {
    			 return tt[i];
    		 }
    	 }
    	 return null;
     }
}
class TravelAgencies
{
	int regNo;
	String agencyName;
	String pakageType;
	int price;
	boolean flightFacility;
	TravelAgencies(int regNo,String agencyName,String pakageType,int price,boolean flightFacility)
	{
		this.regNo=regNo;
		this.agencyName=agencyName;
		this.pakageType=pakageType;
		this.price=price;
		this.flightFacility=flightFacility;
	}
	public int getRegNo()
	{
		return regNo;
	}
	public void setRegNo(int regNo)
	{
		this.regNo=regNo;
	}
	public String getAgencyName()
	{
		return agencyName;
	}
	public void setAgencyName(String agencyName)
	{
		this.agencyName=agencyName;
	}
	public String getPakageType()
	{
		return pakageType;
	}
	public void setPakageType(String pakageType)
	{
		this.pakageType=pakageType;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public boolean getFlightFacility()
	{
		return flightFacility;
	}
	public void setFlightFacility(boolean flightFacility)
	{
		this.flightFacility=flightFacility;
	}
}
