package ilp;
import java.util.*;
public class Solution28
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Film[] ff = new Film[4];
		for(int i=0;i<4;i++)
		{
			String a = sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			ff[i]= new Film(a,b,c,d);
		}
		String  e = sc.nextLine();
		
		
		Film[] uu=  getmoviebygenre( ff, e);
		for(int i=0;i<uu.length;i++)
		{
			if(uu[i].getBudget()>80000000)
				System.out.println("High budget Movie");
			else
				System.out.println("Low budget movie");
		}
	}
	public static   Film[]   getmoviebygenre(Film[] ff,String e)
	{
		Film[] uu = new Film[0];
		for(int i=0;i<4;i++)
		{
			if(ff[i].getGenre().equalsIgnoreCase(e))
			{
				uu = Arrays.copyOf(uu,uu.length+1);
				uu[uu.length-1]=ff[i];
			}
		}
		return uu;
	}

}
class Film
{
	String  name;
	String company;
	String genre;
	int budget;
	Film(String name,String company,String genre,int budget)
	{
		this.name=name;
		this.company=company;
		this.genre=genre;
		this.budget=budget;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public String getGenre()
	{
		return genre;
	}
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	public int getBudget()
	{
		return budget;
	}
	public void setBudget(int budget)
	{
		this.budget=budget;
	}
	
}
