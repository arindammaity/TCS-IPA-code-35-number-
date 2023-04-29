package ilp;                    // code is successfully compiled and run by onlinedb.com//
import java.util.*;
public class Solution15
{
	public static void  main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Playernn[] pp = new Playernn[4];
		for(int i=0;i<4;i++)
		{
			int a =sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int  d = sc.nextInt();
			sc.nextLine();
			int e= sc.nextInt();
			sc.nextLine();
			pp[i] = new Playernn(a,b,c,d,e);
		}
		int f = sc.nextInt();
		double[] hh= findAverageScoredofplayers(pp, f);
			for(int i=0;i<hh.length;i++)
			{
				if(hh[i]>=80)
					System.out.println("Grade A player");
				else if(hh[i]<79 &&hh[i]>50)
					System.out.println("Grade B player");
				else
					System.out.println("Grade C Player");
			}
	}
	public static double[]  findAverageScoredofplayers(Playernn[] pp,int f)
	{
		double[] hh= new double[0];
		for(int i=0;i<4;i++)
		{
			if(pp[i].getNoofMatchesplayed()>=f)
			{
				int x= pp[i].getTotalRunsScored();
				int y=pp[i].getNoofMatchesplayed();
				double   avg = (x+y)/2;
				hh= Arrays.copyOf(hh,hh.length+1);
				hh[hh.length-1]=avg;
			}
		}	
		return hh;
	}
}
class Playernn
{
	int playerId;
	String playerName;
	int iceRank;
	int noofMatchesplayed;
	int totalRunsScored;
	Playernn(int playerId,String playerName,int iceRank,int noofMatchesplayed,int totalRunsScored)
	{
		this.playerId=playerId;
		this.playerName=playerName;
		this.iceRank=iceRank;
		this.noofMatchesplayed=noofMatchesplayed;
		this.totalRunsScored=totalRunsScored;
	}
	public int getPlayerId()
	{
		return playerId;
	}
	public void setPlayerId(int playerId)
	{
		this.playerId=playerId;
	}
	public String getPlayerName()
	{
		return playerName;
	}
	public void setPlayerName(String playerName)
	{
		this.playerName=playerName;
	}
	public int getIceRank()
	{
		return iceRank;
	}
	public void setIceRank(int iceRank)
	{
		this.iceRank=iceRank;
	}
	public int getNoofMatchesplayed()
	{
		return noofMatchesplayed;
	}
	public void setNoofMatchesplayed(int noofMatchesplayed)
	{
		this.noofMatchesplayed=noofMatchesplayed;
	}
	public int getTotalRunsScored()
	{
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored)
	{
		this.totalRunsScored=totalRunsScored;
	}
}
