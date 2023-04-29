package ilp;
import java.util.*;
public class Solution34
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

			Product[] pp= new Product[5];
			for(int i=0;i<5;i++)
			{
				int a = sc.nextInt();
				sc.nextLine();
				String b = sc.nextLine();
				int c= sc.nextInt();
				sc.nextLine();
				int d = sc.nextInt();
				pp[i]= new Product(a,b,c,d);
			}
			int sum = totalcartprice(pp);
			System.out.println("Total cart price :"+sum);
			
			Product[] ppp=  arrangeproduct ( pp);
			for(int i=0;i<ppp.length;i++)
			{
				System.out.println(ppp[i].getName()+":"+ppp[i].getPrice());
			}
	}
	public static   int   totalcartprice(Product[] pp)
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum = sum+pp[i].getPrice();
		}
		return sum;
	}
	
	public static  Product[]   arrangeproduct (Product[] pp)
	{
		Product[] ppp = new Product[0];
		for(int i=0;i<5;i++)
		   {
		ppp= Arrays.copyOf(ppp,ppp.length+1);
		ppp[ppp.length-1]=pp[i];
		   }
		Arrays.sort(ppp,(x,y)->y.getPrice()-x.getPrice());
		return ppp;
	}
}
class Product
{
	int id;
	String name;
	int qty;
	int price;
	Product(int id,String name,int qty,int price)
	{
		this.id=id;
		this.name=name;
		this.qty=qty;
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
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
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
