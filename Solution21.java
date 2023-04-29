package ilp;
import java.util.*;
public class Solution21
{
     public static void main(String[] args)
     {
    	 Scanner sc = new Scanner(System.in);
    	 Associate[] as= new Associate[5];
    	 for(int i=0;i<5;i++)
    	 {
    		 int a = sc.nextInt();
    		 sc.nextLine();
    		 String b = sc.nextLine();
    		 String c = sc.nextLine();
    		 int d = sc.nextInt();
    		 sc.nextLine();
    		 as[i]= new Associate(a,b,c,d);
    	 }
    	 String e = sc.nextLine();
    	 Associate[] pp= jj ( as, e);
    	 for(int i=0;i<pp.length;i++)
    	 {
    		 System.out.println(pp[i].getId());
    	 }
    	 
    	 
     }
     public static  Associate[] jj (Associate[] as,String e)
     {   
    	 Associate[] pp= new Associate[0];
    	 for(int i=0;i<5;i++)
    	 {
    	 if(as[i].getTechnology().equalsIgnoreCase(e) && as[i].getYear()%5==0)
    	      {
    		pp= Arrays.copyOf(pp,pp.length+1);
    		pp[pp.length-1]=as[i];
    	      }
    	 }
    	 return pp;
     }
}
class Associate
{
	int id;
	String name;
	String technology;
	int year;
	Associate(int id,String name,String technology,int year)
	{
		this.id=id;
		this.name=name;
		this.technology=technology;
		this.year=year;
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
	public String getTechnology()
	{
		return technology;
	}
	public void setTechnology(String technology)
	{
		this.technology=technology;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
}
