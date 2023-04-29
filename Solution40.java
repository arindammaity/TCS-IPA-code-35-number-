package ilp;
import java.util.*;
public class Solution40
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Contest[]  tt = new Contest[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b =sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String  e = sc.nextLine();
			tt[i]= new Contest(a,b,c,d,e);
		}
		String   f = sc.nextLine();
		String   g= sc.nextLine();
		
		int  sum =    findtotalpointsbasedonwinner( tt, f);
		System.out.println(sum);
		Contest pq= getcontestwithsecondhighestpoints( tt, g);
		System.out.println(pq.getPoints());
		
	}
	
	public static   int     findtotalpointsbasedonwinner(Contest[] tt,String f)
	{
		int sum =0;
		for(int i=0;i<4;i++)
		{
			if(tt[i].getWinner().equalsIgnoreCase(f))
			{
				sum = sum+tt[i].getPoints();
			}
		}
		return sum;
	}
	
	public static    Contest  getcontestwithsecondhighestpoints(Contest[] tt,String g)
	{
		ArrayList<Contest>pq= new ArrayList<Contest>();
		for(int i=0;i<4;i++)
		{
			if(tt[i].getCategory().equalsIgnoreCase(g))
			{
				pq.add(tt[i]);
			}
		}
		Comparator<Contest>mysort = Comparator.comparing(Contest::getPoints);
		Collections.sort(pq,mysort);
		return pq.get(0);
	}

}
class Contest
{
	int  id;
	String name;
	String winner;
	int points;
	String category;
	Contest(int id,String name,String winner,int points,String category)
	{
		this.id=id;
		this.name=name;
		this.winner=winner;
		this.points=points;
		this.category=category;
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
	public String  getWinner()
	{
		return winner;
	}
	public void setId(String winner)
	{
		this.winner=winner;
	}
	public int getPoints()
	{
		return points;
	}
	public void setPoints(int points)
	{
		this.points=points;
	}
	public String  getCategory()
	{
		return category;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	
	
}
