package ilp;           //  Code is  run and compile successfully through onlinedb.com//  
import java.util.*;
public class Solution33
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   Playing[] pp= new Playing[4];
	   for(int i=0;i<4;i++)
	   {
		   int a = sc.nextInt();
		   sc.nextLine();
		   String b = sc.nextLine();
		   int c = sc.nextInt();
		   sc.nextLine();
		   String  d = sc.nextLine();
		   String  e = sc.nextLine();
		   pp[i]=new Playing(a,b,c,d,e);
	   }
	   String    f = sc.nextLine();
	   String    g = sc.nextLine();
	   
	   int  run = findPlayerWithLowestRuns(pp, f);
	   if(run==0)
	   {
		   System.out.println("No such player");
	   }
	   else
	   {
		   System.out.println(run);
	   }
	   
	   Playing[]  ppp=  findPlayerByMatchType( pp, g);
	  
	   
	   if(ppp==null)
	   {
		   System.out.println("No player with given match type");
	   }
	   else
	   {
		   for(int i=0;i<ppp.length;i++)
		   {
		   System.out.println(ppp[i].getId());
		   }
	   
	   }
   }
   
   public  static   int   findPlayerWithLowestRuns(Playing[] pp,String f)
   {
	   ArrayList<Playing>pq= new ArrayList<Playing>();
	   for(int i=0;i<4;i++)
	   {
		   if(pp[i].getType().equalsIgnoreCase(f))
		   {
			   pq.add(pp[i]);
		   }
	   }
	   if(pq.size()>0)
	   {
	   Comparator<Playing>mysort = Comparator.comparing(Playing::getRuns);
	   Collections.sort(pq,mysort);
	   return  pq.get(0).getRuns();
	   }
	   else
	   {
		   return 0;
	   }
   }
   
   public static   Playing[]  findPlayerByMatchType(Playing[] pp,String g)
   {
	   Playing[] ppp= new Playing[0]; 
	   for(int i=0;i<4;i++)
	   {
		   if(pp[i].getMatch().equalsIgnoreCase(g))
		   {
			   ppp= Arrays.copyOf(ppp, ppp.length+1);
			   ppp[ppp.length-1]=pp[i];
		   }
	   }
	   if(ppp.length>0)
	   {
	   Arrays.sort(ppp,(x,y)->y.getId()-x.getId());
	   return ppp;
	   }
	   else
	   {
		   return null;
	   }
   }
}
class Playing
{
	int id;
	String name;
	int runs;
	String type;
	String match;
	Playing(int id,String name,int runs,String type,String match)
	{
		this.id=id;
		this.name=name;
		this.runs=runs;
		this.type=type;
		this.match=match;
	}
	public int getId()
	{
		return id;
	}
	public  void setId(int id)
	{
		this.id=id;
	}
	public String  getName()
	{
		return name;
	}
	public  void setName(String name)
	{
		this.name=name;
	}
	public int getRuns()
	{
		return runs;
	}
	public  void setRuns(int runs)
	{
		this.runs=runs;
	}
	public String  getType()
	{
		return type;
	}
	public  void setType(String type)
	{
		this.type=type;
	}
	public String  getMatch()
	{
		return match;
	}
	public  void setMatch(String match)
	{
		this.match=match;
	}
	
}
