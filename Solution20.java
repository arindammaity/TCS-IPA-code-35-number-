package ilp;
import java.util.*;
public class Solution20
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Beach[] bb = new Beach[4];
		for(int i=0;i<4;i++)
		{
			int a =  sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			String d = sc.nextLine();
			int e = sc.nextInt();
			sc.nextLine();
			int f = sc.nextInt();
			sc.nextLine();
			bb[i]=new  Beach(a,b,c,d,e,f);
		}
		String h = sc.nextLine();
		int  g= sc.nextInt();
		
		 int   result=   vvvv(bb,h, g);
		 System.out.println(result);
	}

	public static   int     vvvv(Beach[] bb,String h,int g)
	{
		ArrayList<Beach>pq= new ArrayList<Beach>();
		for(int i=0;i<4;i++)
		{
			if(bb[i].getLocation().equalsIgnoreCase(h) && bb[i].getAvg()>g)
			{
				pq.add(bb[i]);
			}
		}
		if(pq.size()==0)
		{
			return 0;
		}
		else
		{
		  Comparator<Beach>mysort = Comparator.comparing(Beach::getRating);
		  Collections.sort(pq,mysort);
		  return pq.get(0).getRating();
			
		}
	}
	}


class Beach
{
	int beachid;
	String beachname;
	String location;
	String beachtype;
	int rating;
	int avg;
	Beach(int beachid,String beachname,String location,String beachtype,int rating,int avg)
	{
		this.beachid=beachid;
		this.beachname=beachname;
		this.location=location;
		this.beachtype=beachtype;
		this.rating=rating;
		this.avg=avg;
	}
	public int getBeachid()
	{
		return beachid;
	}
	public void setBeachid(int beachid)
	{
		this.beachid=beachid;
	}
	public String getBeachname()
	{
		return beachname;
	}
	public void setBeachname(String beachname)
	{
		this.beachname=beachname;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getBeachtype()
	{
		return beachtype;
	}
	public void setBeachtype(String beachtype)
	{
		this.beachtype=beachtype;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating=rating;
	}
	public int getAvg()
	{
		return avg;
	}
	public void setAvg(int avg)
	{
		this.avg=avg;
	}
	
}
