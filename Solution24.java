package ilp;
import java.util.*;
public class Solution24
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Institute[] ii= new Institute[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b= sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String e = sc.nextLine();
			ii[i]= new Institute(a,b,c,d,e);
		}
		String  f= sc.nextLine();
		String  g = sc.nextLine();
		
		int  sum =  findnumclearencebyloc( ii, f);
		if(sum>0)
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println("Nothing");
		}
		Institute  temp=   updateinstitutiongrade(ii,g);
		if(temp==null)
		{
			System.out.println("444444");
		}
		else
		{
			System.out.println(temp.getName()+"::"+temp.getGrade());
		}
	}
   public static    int    findnumclearencebyloc(Institute[] ii,String f)
   {
	   int sum=0;
	   for(int i=0;i<4;i++)
	   {
		   if(ii[i].getLocation().equalsIgnoreCase(f))
		   {
			   sum = sum+ii[i].getClear();
		   }
	   }
	   return sum;
   }
   
   public static   Institute     updateinstitutiongrade(Institute[] ii,String g)
   {
	   for(int i=0;i<4;i++)
	   {
		   if(ii[i].getName().equalsIgnoreCase(g))
		   {
			   int rating = (Integer.parseInt(ii[i].getNo())*100)/ii[i].getClear();
			   if(rating>=80)
				   ii[i].setGrade("A");
			   else
				   ii[i].setGrade("B");
			   return ii[i];				   	
		   }
	   }
	   return null;
   }
}
class Institute
{
	int id;
	String name;
	String no;
	int clear;
	String location;
	String grade;
	Institute(int id,String name,String no,int clear,String location)
	{
		this.id=id;
		this.name=name;
		this.no=no;
		this.clear=clear;
		this.location=location;
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
	public String getNo()
	{
		return no;
	}
	public void setNo(String no)
	{
		this.no=no;
	}
	public int getClear()
	{
		return clear;
	}
	public void setClear(int clear)
	{
		this.clear=clear;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	
}
