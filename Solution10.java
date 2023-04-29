package ilp;
import java.util.*;
public class Solution10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Antenna[] aa = new Antenna[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String  b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();
			sc.nextLine();
			aa[i]= new Antenna(a,b,c,d);
		}
		String e = sc.nextLine();
		double f = sc.nextDouble();
		 int   temp =  searchAntennaByName(aa, e);
		 if(temp==0)
		 {
			 System.out.println("There is no antenna with the given parameter");
		 }
		 else
		 {
			 System.out.println(temp);
		 }
		 
		 Antenna[]  pp = sortAntennaByVSWR( aa, f);
		 if(pp.length>0)
		 {
			 for(int i=0;i<pp.length;i++)
			 {
			     System.out.println(pp[i].getProjectLead());	 
			 }
			 
		 }
		 else
		 {
			 System.out.println("No Antenna found");
		 }
		
	}
    public static   int     searchAntennaByName(Antenna[] aa,String e)
    {
    	for(int i=0;i<4;i++)
    	{
    		if(aa[i].getAntennaName().equalsIgnoreCase(e))
    		{
    			return aa[i].getAntennaid();
    		}
    	}
    	return 0;
    }
    
    public static  Antenna[] sortAntennaByVSWR(Antenna[] aa,double f)
    {
    	Antenna[] pp = new Antenna[0];
    	for(int i=0;i<4;i++)
    	{
    		if(aa[i].getAntennaVSWR()<f)
    		{
    			pp=Arrays.copyOf(pp, pp.length+1);
    			pp[pp.length-1]=aa[i];
    		}
    	}
    	for(int i=0;i<pp.length-1;i++)
    	{
    		for(int j=0;j<pp.length-i-1;j++)
    		{
    			if(pp[j].getAntennaVSWR()>pp[j+1].getAntennaVSWR())
    			{
    				Antenna hh = pp[j];
    				pp[j]=pp[j+1];
    				pp[j+1]=hh;
    			}
    		}
    	}
    	return pp;
    }
}
class Antenna
{
	int antennaid;
	String antennaName;
	String projectLead;
	double antennaVSWR;
	Antenna(int antennaid,String antennaName,String projectLead,double antennaVSWR)
	{
		this.antennaid=antennaid;
		this.antennaName=antennaName;
		this.projectLead=projectLead;
		this.antennaVSWR=antennaVSWR;
	}
	public int getAntennaid()
	{
		return antennaid;
	}
	public void setAntennaid(int antennaid)
	{
		this.antennaid =antennaid;
	}
	public String getAntennaName()
	{
		return antennaName;
	}
	public void setAntennaName(String antennaName)
	{
		this.antennaName =antennaName;
	}
	public String getProjectLead()
	{
		return projectLead;
	}
	public void setProjectLead(String projectLead)
	{
		this.projectLead =projectLead;
	}
	public double getAntennaVSWR()
	{
		return antennaVSWR;
	}
	public void setAntennaVSWR(double antennaVSWR)
	{
		this.antennaVSWR =antennaVSWR;
	}
	
}
