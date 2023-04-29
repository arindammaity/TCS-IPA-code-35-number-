package ilp;
import java.util.*;
public class Solution39
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Cars[] aa= new Cars[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			int b = sc.nextInt();
			double c = sc.nextDouble();
			sc.nextLine();
			String  d = sc.nextLine();
			aa[i]= new Cars(a,b,c,d);
		}
		String  e = sc.nextLine();
		double f = sc.nextDouble();
		
		Cars pq=    getsecondlowestmilestravelledcar( aa, f);
		System.out.println(pq.getId());
		System.out.println(pq.getSpeed());
		System.out.println(pq.getMiles());
		System.out.println(pq.getBrand());
		
		 int count = countcarsbybrand(aa,e);
		 System.out.println(count);
		
		
	}
	
	public static     int countcarsbybrand(Cars[] aa,String e)
	{
		int count=0;
		for(int i=0;i<4;i++)
		{
			if(aa[i].getBrand().equalsIgnoreCase(e))
			{
				count++;
			}
		}
		return count;
	}
	
	public static  Cars    getsecondlowestmilestravelledcar(Cars[] aa,double f)
	{
		ArrayList<Cars>pq= new ArrayList<Cars>();
		for(int i=0;i<4;i++)
		{
			if(aa[i].getMiles()>f)
			{
				pq.add(aa[i]);
			}
		}
		Comparator<Cars>mysort=Comparator.comparing(Cars::getMiles);
		Collections.sort(pq,mysort);
		return pq.get(0);
	}

}
class Cars
{
	int id;
	int speed;
	double miles;
	String brand;
	Cars(int id,int speed, double miles,String brand)
	{
		this.id=id;
		this.speed=speed;
		this.miles=miles;
		this.brand=brand;
	}
	public int  getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int  getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public double  getMiles()
	{
		return miles;
	}
	public void setMiles(double miles)
	{
		this.miles=miles;
	}
	public String  getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
}
