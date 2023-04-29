package ilp;
import java.util.*;
public class Solution27
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Movie[] m = new Movie[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			m[i]= new Movie(a,b,c,d);
		}
		String  e = sc.nextLine();
		int  f = sc.nextInt();
		sc.nextLine();
		int  g = sc.nextInt();
		
		int  avg =   findavgbudgetbydirector(m,e);
		if(avg ==0)
		{
			System.out.println("Nothing");
		}
		else
		{
			System.out.println(avg);
		}
		
		
		 Movie temp =   getmoviebyratingbudget(m, f, g);
		 if(temp==null)
		 {
			 System.out.println("iiiiiiii");
		 }
		 else
		 {
			 System.out.println(temp.getId());
		 }
		
	}
	public static    int    findavgbudgetbydirector(Movie[] m,String e)
	{
		int count=0;
		int sum =0;
		for(int i=0;i<4;i++)
		{
			if(m[i].getDirector().equalsIgnoreCase(e))
			{
				count++;
				sum = sum+m[i].getBudget();
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
	
	public static   Movie    getmoviebyratingbudget(Movie[] m,int f,int g)
	{
		for(int i=0;i<4;i++)
		{
			if(m[i].getRating()==f && m[i].getBudget()==g)
			{
				return m[i];
			}
		}
		return null;
	}

}
class Movie
{
	int id;
	String  director;
	int rating;
	int budget;
	Movie(int id,String director,int rating,int budget)
	{
		this.id=id;
		this.director=director;
		this.rating=rating;
		this.budget=budget;
	}
	public int getId() 
	{
	   return id;	
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String  getDirector() 
	{
	   return director;	
	}
	public void setDirector(String director)
	{
		this.director = director;
	}
	public int getRating() 
	{
	   return rating;	
	}
	public void setRating(int rating)
	{
		this.rating = rating;
	}
	public int getBudget() 
	{
	   return budget;	
	}
	public void setBudget(int budget)
	{
		this.budget = budget;
	}
}