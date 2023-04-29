package ilp;
import java.util.*; 
public class Solution30
{
	public static void main(String[] args)
	{
		Scanner sc = new  Scanner(System.in);
		Players[] pp= new Players[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String  b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d= sc.nextInt();
			sc.nextLine();
			int e = sc.nextInt();
			sc.nextLine();
			pp[i]= new Players(a,b,c,d,e);
		}
		int  f = sc.nextInt();
		double[]   kk=    findaverageofruns(pp, f);
		for(int i=0;i<kk.length;i++)
		{
			if(kk[i]>80 && kk[i]<100)
			{
				System.out.println("Grade A");
			}
			else if (kk[i]>50 &&kk[i]<79)
			{
				System.out.println("Grade B");
			}
			else
			{
				System.out.println("Grade C");
			}	
		}
	}
	public static double[]       findaverageofruns(Players[] pp,int f)
	{
		double[] kk = new double[0];
		for(int i=0;i<4;i++)
		{
			if(pp[i].getMatches()>=f)
			{
				kk = Arrays.copyOf(kk,kk.length+1);
				kk[kk.length-1]=(double)(pp[i].getRun()/pp[i].getMatches());
			}
		}
		return kk;
	}

}
class Players
{
	int id;;
	String name;
	int rank;
	int matches;
	int run;
	Players(int id,String name,int rank,int matches,int run)
	{
		this.id=id;
		this.name=name;
		this.rank=rank;
		this.matches=matches;
		this.run=run;
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
	public int getRank()
	{
		return rank;
	}
	public void setRank(int rank)
	{
		this.rank=rank;
	}
	public int getMatches()
	{
		return matches;
	}
	public void setMatches(int matches)
	{
		this.matches=matches;
	}
	public int getRun()
	{
		return run;
	}
	public void setRun(int run)
	{
		this.run=run;
	}
	
}
