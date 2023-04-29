package ilp;
import java.util.*;
public class Solution7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Music[] song= new Music[4];
		for(int i=0;i<4;i++)
		{
			int a =  sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			double d = sc.nextDouble();
			song[i]= new Music(a,b,c,d);
		}
		int e = sc.nextInt();
		int f = sc.nextInt();
		int avg = findAvgOfCount( song, e);
		if(avg==0)
		{
			System.out.println("No playlist found");
			
		}
		else
		{
			System.out.println(avg);
		}
		
		Music[]  dd= sortTypeByDuration( song, f);
		if(dd.length>0)
		{
			for(int i=0;i<dd.length;i++)
			{
			System.out.println(dd[i].getType());	
			}
			
		}
		else
		{
			System.out.println("No playlist found with mentioned attribute");
		}
	}
  public static      int  findAvgOfCount(Music[] song,int e)
  {
	  int c=0;
	  int sum =0;
	  for(int i=0;i<4;i++)
	  {
		  if(song[i].getCount()>e)
		  {
			  c++;
			  sum = sum + song[i].getCount();
		  }
	  }
	  if(c>0)
	  {
		  return (sum/c);
	  }
	  else
	  {
		  return 0;
	  }
  }
  
  public static Music[]   sortTypeByDuration(Music[] song,int f)
  {
	  Music[] dd = new Music[0];
	  for(int i=0;i<4;i++)
	  {
		  if(song[i].getDuration()>f)
		  {
			  dd=Arrays.copyOf(dd,dd.length+1);
			  dd[dd.length-1]=song[i];
		  }
	  }
	  for(int i=0;i<dd.length-1;i++)
	  {
		  for(int j=0;j<dd.length-i-1;j++)
		  {
			  if(dd[j].getDuration()>dd[j+1].getDuration())
			  {
				  Music temp = dd[j];
				  dd[j]=dd[j+1];
				  dd[j+1]=temp;
			  }
		  }
	  }
	  return dd;
  }
}
class Music
{
	int playListNo;
	String type;
	int count;
	double  duration;
	Music(int playListNo,String type,int count,double duration)
	{
		this.playListNo=playListNo;
		this.type = type;
		this.count=count;
		this.duration = duration;
	}
	public int getPlayListNo()
	{
		return playListNo;
	}
	public void setPlayListNo(int playListNo)
	{
		this.playListNo=playListNo;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public int getCount()
	{
		return count;
	}
	public void setCount(int count)
	{
		this.count=count;
	}
	public double getDuration()
	{
		return duration;
	}
	public void setDuration(double duration)
	{
		this.duration=duration;
	}

}
