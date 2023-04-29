package ilp;
import java.util.*;
public class Solution31
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Playing[] ing= new Playing[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			ing[i]= new Playing(a,b,c,d);
		}
		String  e = sc.nextLine();
		String  f = sc.nextLine();
		
		 int  sum=  findpointsforgivenskill(ing, e);
		 if(sum>0)
		 {
			 System.out.println(sum);
		 }
		 else
		 {
			 System.out.println("The given skill  is not available  ");
		 }
		 
		 Playing  temp=   getplayerbasedonlevel( ing, e,f);
		 if(temp==null)
		 {
			 System.out.println("No player is available with specified level,skill,eligibility points");
		 }
		 else
		 {
			 System.out.println(temp.getId());
		 }
	}
	public static    int    findpointsforgivenskill(Playing[] ing,String e)
	{
		int sum=0;
		for(int i=0;i<4;i++)
		{
			if(ing[i].getSkill().equalsIgnoreCase(e))
			{
				sum = sum+ ing[i].getPoints();
			}
		}
		return sum;
	}
	
	public static   Playing     getplayerbasedonlevel(Playing[] ing,String e,String f)
	{
		for(int i=0;i<4;i++)
		{
			if(ing[i].getSkill().equalsIgnoreCase(e) && ing[i].getLevel().equalsIgnoreCase(f))
			{
				return ing[i];
			}
		}
		return null;
	}

}
class Playing
{
	int id;
	String skill;
	String level;
	int points;
	Playing(int id,String skill,String level,int points)
	{
		this.id=id;
		this.skill=skill;
		this.level=level;
		this.points=points;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getSkill()
	{
		return skill;
	}
	public void setSkill(String skill)
	{
		this.skill=skill;
	}
	public String getLevel()
	{
		return level;
	}
	public void setLevel(String level)
	{
		this.level=level;
	}
	public int getPoints()
	{
		return points;
	}
	public void setPoints(int points)
	{
		this.points=points;
	}
}
