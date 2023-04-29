package ilp;
import java	.util.*;
public class Solution38
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		College[] coll= new College[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			String d = sc.nextLine();
			int e =sc.nextInt();
			sc.nextLine();
			coll[i]= new College(a,b,c,d,e);
		}
		String  f = sc.nextLine();
		College temp= findcollegewithmaximumpincode(  coll);
		System.out.println("id-"+temp.getId());
		System.out.println("name-"+temp.getName());
		System.out.println("contactNo-"+temp.getNo());
		System.out.println("Addres-"+temp.getAddress());
		System.out.println("Pincode-"+temp.getPincode());
		
		College[]  pk= searchcollegebyaddress( coll, f);
		for(int i=0;i<pk.length;i++)
		{
			System.out.println("id-"+pk[i].getId());
			System.out.println("name-"+pk[i].getName());
			System.out.println("contact no-"+pk[i].getNo());
			System.out.println("Address-"+pk[i].getAddress());
			System.out.println("Pincode-"+pk[i].getPincode());
		}
	}
	public static College  findcollegewithmaximumpincode(College[]  coll)
	{
		College temp=null;
		int maxprice= Integer.MIN_VALUE;
		for(int i=0;i<4;i++)
		{
			if(coll[i].getPincode()>maxprice)
			{
				temp= coll[i];
				maxprice= coll[i].getPincode();
				
			}
		}
		if(temp!=null)
		{
			return  temp;
		}
		else
		{
			return null;
		}
	}
	
	public static   College[]  searchcollegebyaddress(College[] coll,String f)
	{
		College[] pk= new College[0];
		for(int i=0;i<4;i++)
		{
			if(coll[i].getAddress().equalsIgnoreCase(f))
			{
				pk= Arrays.copyOf(pk,pk.length+1);
				pk[pk.length-1]=coll[i];
			}
		}
		return pk;
	}

}
class College
{
	int id;
	String name;
	int no;
	String address;
	int pincode;
	College(int id,String name,int no,String address,int pincode)
	{
		this.id=id;
		this.name=name;
		this.no=no;
		this.address=address;
		this.pincode=pincode;
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
	public int getNo()
	{
		return no;
	}
	public void setNo(int no)
	{
		this.no=no;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public int getPincode()
	{
		return pincode;
	}
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
}
