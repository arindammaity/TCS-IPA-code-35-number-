package ilp;
import java.util.*;
public class Solution42
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Spud[] ss= new Spud[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d =  sc.nextInt();
			sc.nextLine();
			ss[i]= new Spud(a,b,c,d);
		}
		String  e = sc.nextLine();
		int   f = sc.nextInt();
		sc.nextLine();
		
		Spud    temp =  findtypebystate( ss, e);
		if(temp==null)
		{
			System.out.println("State not found");
		}
		else
		{
			System.out.println(temp.getType());
		}
		
		Spud[]  jj =sortbyprice( ss, f);
		for(int i=0;i<jj.length;i++)
		{
			System.out.println(jj[i].getType());
			System.out.println(jj[i].getPrice());
		}
	}
	public static  Spud     findtypebystate(Spud[] ss,String e)
	{
		for(int i=0;i<4;i++)
		{
			if(ss[i].getState().equalsIgnoreCase(e))
			{
				return ss[i];
			}
		}
		return null;
	}
	public static    Spud[] sortbyprice(Spud[] ss,int f)
	{
		 Spud[] jj = new Spud[0];
		for(int i=0;i<4;i++)
		{
			if(ss[i].getPrice()<f)
			{
				jj= Arrays.copyOf(jj,jj.length+1);
				jj[jj.length-1]=ss[i];
			}
		}
		Arrays.sort(jj,(x,y)->x.getPrice()-y.getPrice());
		return jj;
	}

}
class Spud
{
	int id;
	String type;
	String state;
	int price;
	Spud(int id,String type,String state,int price)
	{
		this.id=id;
		this.type=type;
		this.state=state;
		this.price=price;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public String  getState()
	{
		return state;
	}
	public void setId(String state)
	{
		this.state=state;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
}
