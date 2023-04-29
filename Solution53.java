package ilp;
import java.util.*;
public class Solution53
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 Motel [] mm= new Motel[4];
	 for(int i=0;i<4;i++)
	 {
		 int a = sc.nextInt();
		 sc.nextLine();
		 String b= sc.nextLine();
		 String c = sc.nextLine();
		 int d = sc.nextInt();
		 sc.nextLine();
		 String   e= sc.nextLine();
		 double  f = sc.nextDouble();
		 sc.nextLine();
		 mm[i]=new Motel(a,b,c,d,e,f);
	 }
	 String g= sc.nextLine();
	 int  sum = totalNoOfRoomsBooked( mm, g);
	 if(sum==0)
	 {
		 System.out.println("No such rooms booked");
	 }
	 else
	 {
		 System.out.println(sum);
	 }
	 
 }
 public static   int  totalNoOfRoomsBooked(Motel[] mm,String g)
 {
	 int sum =0;
	 for(int i=0;i<4;i++)
	 {
		 if(mm[i].getCabfacility().equalsIgnoreCase(g) && mm[i].getNoofroomsbooked()>5)
		 {
			 sum = sum +mm[i].getNoofroomsbooked();
		 }
	 }
	 if(sum!=0)
	 {
		 return sum;
	 }
	 else
	 {
		 return 0;
	 }
 }
}
class Motel
{
	int id;
	String name;
	String dateofbooking;
	int noofroomsbooked;
	String cabfacility;
	double totalbill;
	Motel(int id,String name,String dateofbooking,int noofroomsbooked,String cabfacility,double totalbill)
	{
		this.id=id;
		this.name=name;
		this.dateofbooking=dateofbooking;
		this.noofroomsbooked=noofroomsbooked;
		this.cabfacility=cabfacility;
		this.totalbill=totalbill;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String  getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String  getDateofbooking()
	{
		return dateofbooking;
	}
	public void setId(String dateofbooking)
	{
		this.dateofbooking=dateofbooking;
	}
	public int getNoofroomsbooked()
	{
		return noofroomsbooked;
	}
	public void setNoofroomsbooked(int noofroomsbooked)
	{
		this.noofroomsbooked=noofroomsbooked;
	}
	public String  getCabfacility()
	{
		return cabfacility;
	}
	public void setFacility(String cabfacility)
	{
		this.cabfacility=cabfacility;
	}
	public double getTotalbill()
	{
		return totalbill;
	}
	public void setTotalbill(double totalbill)
	{
		this.totalbill=totalbill;
	}
	
	
}