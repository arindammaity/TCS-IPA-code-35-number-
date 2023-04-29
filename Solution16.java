package ilp;
import java.util.*;
public class Solution16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Inventory[] nn = new Inventory[4];
		for(int i=0;i<4;i++)
		{
		   String  a = sc.nextLine();
		   
		   int b = sc.nextInt();
		   sc.nextLine();
		   int c = sc.nextInt();
		   sc.nextLine();
		   int d = sc.nextInt();
		   sc.nextLine();
		   nn[i]= new Inventory(a,b,c,d);
		}
		int e = sc.nextInt();
		
		Inventory[]   bb=   replenish(nn, e);
		for(int i=0;i<bb.length;i++)
		{
			if(bb[i].getThreshold()>=75)
				System.out.println(bb[i].getInventoryId()+" "+"Critical Filling");
			else if(bb[i].getThreshold()>74 &&bb[i].getThreshold()<75)
				System.out.println(bb[i].getInventoryId()+" "+"Moderate Filling");
			else
				System.out.println(bb[i].getInventoryId()+" "+"Non critical Filling");
		}
	}
	public static Inventory[]      replenish(Inventory[] nn,int e)
	{
		Inventory[] bb= new Inventory[0];
		for(int i=0;i<4;i++)
		{
			if(nn[i].getThreshold()<=e)
			{
				bb=Arrays.copyOf(bb,bb.length+1);
				bb[bb.length-1]=nn[i];
			}
		}
		return bb;
	}

}
class Inventory
{
	String inventoryId;
	int maximumquality;
	int currentQuality;
	int threshold;
	Inventory(String inventoryId,int maximumquality,int currentQuality,int threshold)
	{
		this.inventoryId=inventoryId;
		this.maximumquality=maximumquality;
		this.currentQuality=currentQuality;
		this.threshold=threshold;
	}
	public String getInventoryId()
	{
		return inventoryId;
	}
	public void setInventoryId(String inventoryId)
	{
		this.inventoryId=inventoryId;
	}
	public int getMaximumquality()
	{
		return maximumquality;
	}
	public void setMaximumquality(int maximumquality)
	{
		this.maximumquality=maximumquality;
	}
	public int  getCurrentQuality()
	{
		return currentQuality;
	}
	public void setCurrentQuality(int currentQuality)
	{
		this.currentQuality=currentQuality;
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
