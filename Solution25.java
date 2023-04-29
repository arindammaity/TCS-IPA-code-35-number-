package ilp;                  // program is compile and run successfully through onlinedb//
import java.util.*;
public class Solution25
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Inventory[] nn=new Inventory[4];
		for(int i=0;i<4;i++)
		{
			String a = sc.nextLine();
			
			int b = sc.nextInt();
			sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			nn[i]= new Inventory(a,b,c,d);			
		}
		int  e = sc.nextInt();
		
		Inventory  pp[] =  ABB(nn, e);
		for(int i=0;i<pp.length;i++)
		{
			if(pp[i].getThreshold()>=75)
				System.out.println(pp[i].getId()+"Critical Filling");
			else if(pp[i].getThreshold()>=50 && pp[i].getThreshold()<=74)
				System.out.println(pp[i].getId()+"Mode rate filling");
			else
				System.out.println(pp[i].getId()+"Non critical Filling");
		}
		
		
	}
	public static   Inventory[]   ABB(Inventory[] nn,int e)
	{
		Inventory[] pp=new Inventory[0];
		for(int i=0;i<4;i++)
		{
			if(nn[i].getThreshold()<=e)
			{
				pp=Arrays.copyOf(pp,pp.length+1);
				pp[pp.length-1]=nn[i];
			}
		}
		return pp;
	}

}
class Inventory
{
	String id;
	int maximum;
	int quality;
	int threshold;
	Inventory(String id,int maximum,int quality,int threshold)
	{
		this.id=id;
		this.maximum=maximum;
		this.quality=quality;
		this.threshold=threshold;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public int  getMaximum()
	{
		return maximum;
	}
	public void setMaximum(int maximum)
	{
		this.maximum=maximum;
	}
	public int  getQuality()
	{
		return quality;
	}
	public void setQuality(int quality)
	{
		this.quality=quality;
	}
	public int getThreshold()
	{
		return threshold;
	}
	public void setThreshold(int threshold)
	{
		this.threshold=threshold;
	}	
}
