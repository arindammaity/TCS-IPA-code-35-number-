package ilp;
import java.util.*;
public class Solution6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Song[] music = new Song[5];
		for(int i=0;i<5;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();
			sc.nextLine();
			music[i]= new Song(a,b,c,d);
		}
		String e = sc.nextLine();
		String f = sc.nextLine();
		double sum =findSongDurationForArtist(music,e);
		if(sum>0)
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println("There are no songs with given artist");
		}
		
		 Song[] ss= getSongsInAscendingOrder(music, f);
		 if(ss.length>0)
		 {
			 for(int i=0;i<ss.length;i++)
			 {
			   System.out.println(ss[i].getSongId());
			   System.out.println(ss[i].getTitle());
			 }
			 
		 }
		 else
		 {
			 System.out.println("There are  no songs withgiven artist");
		 }
	}
	public static double findSongDurationForArtist(Song[] music,String e)
	{
		double sum =0;
		for(int i=0;i<5;i++)
		{
			if(music[i].getArtist().equals(e))
			{
				sum = sum + music[i].getDuration();
			}
			
		}
		return sum;
	}
	public static   Song[]  getSongsInAscendingOrder(Song[] music,String f)
	{
		Song[] ss= new Song[0];
		for(int i=0;i<5;i++)
		{
			if(music[i].getArtist().equals(f))
			{
				ss = Arrays.copyOf(ss, ss.length+1);
				ss[ss.length-1]=music[i];
			}
		}
		
		for(int i=0;i<ss.length-1;i++)
		{
			for(int j=0;j<ss.length-i-1;j++)
			{
				if(ss[j].getDuration()>ss[j+1].getDuration())
					
				{
					 Song temp= ss[j];
					 ss[j]=ss[j+1];
					 ss[j+1]=temp;
				}
			}
		}
		return ss;
	}

}
class Song
{
	int songId;
	String title;
	String artist;
	double duration;
	Song(int songId,String title,String artist,double duration)
	{
		this.songId=songId;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	public int getSongId()
	{
		return songId;
	}
	public void setSongId(int songId)
	{
		this.songId=songId;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getArtist()
	{
		return artist;
	}
	public void setArtist(String artist)
	{
		this.artist=artist;
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
