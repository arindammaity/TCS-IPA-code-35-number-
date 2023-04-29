package ilp;
import java.util.*;
public class Solution46
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Toy[] tt= new Toy[5];
		for(int i=0;i<5;i++)
		{
			int a=sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();
			sc.nextLine();
			double  e = sc.nextDouble();
			sc.nextLine();
			tt[i]= new Toy(a,b,c,d,e);
		}
		String  f = sc.nextLine();
		String  g = sc.nextLine();
		
		Toy  pq=     findtoywithhighestprice( tt, g);
		if(pq==null)
		{
			System.out.println("No match found for the Category");
		}
		else
		{
			System.out.println(pq.getId());
			System.out.println(pq.getName());
			System.out.println(pq.getCategory());
		}
		
		double  price= findaveragepricepercategory( tt, f);
		if(price==0)
		{
			System.out.println("Category does not exist");
		}
		else
		{
			System.out.println(price);
		}
		
	}
	public  static  double findaveragepricepercategory(Toy[] tt,String f)
	{
		double sum =0.0;
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(tt[i].getCategory().equalsIgnoreCase(f))
			{
				sum =  sum+tt[i].getPrice();
				count++;
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
	
	public static   Toy      findtoywithhighestprice(Toy[] tt,String g)
	{
		ArrayList<Toy>pq= new ArrayList<Toy>();
		for(int i=0;i<5;i++)
		{
			if(tt[i].getCategory().equalsIgnoreCase(g))
			{
				pq.add(tt[i]);
			}
		}
		if(pq.size()>1)
		{
		Comparator<Toy>mysort=Comparator.comparing(Toy::getPrice);
		Collections.sort(pq,mysort);
		return pq.get(1);
		}
		else
		{
			return null;
		}
	}

}
class Toy
{
	int id;
	String name;
	String category;
	double price;
	double discount;
	Toy(int id,String name,String category,double price,double discount)
	{
		this.id=id;
		this.name=name;
		this.category=category;
		this.price=price;
		this.discount=discount;
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
	public String  getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getDiscount()
	{
		return discount;
	}
	public void setDiscount(double discount)
	{
		this.discount=discount;
	}
}
