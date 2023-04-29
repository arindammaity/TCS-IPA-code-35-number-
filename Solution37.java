package ilp;
import java.util.*;
public class Solution37
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vehicle[] vv= new Vehicle[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			double c = sc.nextDouble();
			sc.nextLine();
			vv[i]= new Vehicle(a,b,c);
		}
		String d = sc.nextLine();
		
		Vehicle  pq=  findvehiclebyminimumprice(vv);
		System.out.println("number-"+pq.getNumber());
		System.out.println("name-"+pq.getName());
		System.out.println("price-"+pq.getPrice());
		
		Vehicle   temp = searchVehicleByName( vv, d);
        System.out.println("numbe-"+temp.getNumber());
        System.out.println("name-"+temp.getName());
        System.out.println("price-"+temp.getPrice());
	}
	public  static   Vehicle    findvehiclebyminimumprice(Vehicle[] vv)
	{
		ArrayList<Vehicle>pq= new ArrayList<Vehicle>();
		for(int i=0;i<4;i++)
		{
			pq.add(vv[i]);
		}
		Comparator<Vehicle>mysort = Comparator.comparing(Vehicle::getPrice);
		Collections.sort(pq,mysort);
		return pq.get(0);
	}
	public static   Vehicle   searchVehicleByName(Vehicle[] vv,String d)
	{
		for(int i=0;i<4;i++)
		{
			if(vv[i].getName().equalsIgnoreCase(d))
			{
				return vv[i];
			}
		}
		return null;
	}

}
class Vehicle
{
	int number;
	String name;
	double price;
	Vehicle(int number,String name,double price)
	{
		this.number=number;
		this.name=name;
		this.price=price;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number=number;
	}
	public String  getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
}
