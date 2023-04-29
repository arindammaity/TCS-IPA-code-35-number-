package ilp;
import java.util.*;
public class Solution29
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		NavalVessal[] nn = new NavalVessal[4];
		for(int i=0;i<4;i++)
		{
			int a =sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String  e = sc.nextLine();
			
			nn[i]= new NavalVessal(a,b,c,d,e);
		}
		int  g = sc.nextInt();
		sc.nextLine();
		String h = sc.nextLine();
		
		
		int  avg =    findavgvoyagesbypct( nn, g);
		if(avg==0)
		{
			System.out.println("fgfgfgfdggdggdgddg");
		}
		else
		{
			System.out.println(avg);
		}
		
		NavalVessal temp=  findvesselbygrade(nn,  h);
		if(temp==null)
		{
			System.out.println("No naval Vessal");
		}
		else
		{
			System.out.println(temp.getName()+"%"+temp.getClassification());
		}
	}
	
	public  static  int      findavgvoyagesbypct(NavalVessal[] nn,int g)
	{
		int count=0;
		int sum =0;
		for(int i=0;i<4;i++)
		{
			int percentage = (nn[i].getCompleted()*100)/nn[i].getPlanned();
			if(percentage>=g)
			{
				count++;
				sum = sum+nn[i].getCompleted() ;
			}
		}
		if(count!=0)
		{
			return (sum/count);
		}
		else
		{
			return 0;
		}
	}
	
	
	public   static   NavalVessal   findvesselbygrade(NavalVessal[] nn, String h)
	{
		for(int i=0;i<4;i++)
		{
			if(nn[i].getPurpose().equalsIgnoreCase(h))
			{
				int percentage = (nn[i].getCompleted()*100)/nn[i].getPlanned();
				if(percentage==100)
					nn[i].setClassification("Star");
				else if(percentage>80 && percentage<99)
					nn[i].setClassification("leader");
				else if(percentage>55 && percentage<79)
					nn[i].setClassification("Inspirer");
				else
					nn[i].setClassification("Striver");
				return nn[i];
			}
		}
		return null;
	}

}
class NavalVessal
{
	int id;
	String name;
	int planned;
	int completed;
	String purpose;
	String classification;
	NavalVessal(int id,String name,int planned,int completed,String purpose)
	{
		this.id=id;
		this.name=name;
		this.planned=planned;
		this.completed=completed;
		this.purpose=purpose;
	
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getPlanned()
	{
		return planned;
	}
	public void setPlanned(int planned)
	{
		this.planned=planned;
	}
	public int getCompleted()
	{
		return completed;
	}
	public void setCompleted(int completed)
	{
		this.completed=completed;
	}
	public String getPurpose()
	{
		return purpose;
	}
	public void setPurpose(String purpose)
	{
		this.purpose=purpose;
	}
	public String getClassification()
	{
		return classification;
	}
	public void setClassification(String classification)
	{
		this.classification=classification;
	}
	
	
}
