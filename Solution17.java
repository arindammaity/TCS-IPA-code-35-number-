package ilp;                     // code is successfully compiled and run by onlinedb.com//
import java.util.*;
public class Solution17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student[] dd = new Student[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();
			boolean e = sc.nextBoolean();
			
			dd[i]= new Student(a,b,c,d,e);
		}
		
		int  count=   findcountofdaysscholarstudent( dd);
		if(count>0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("nothing");
		}
		Student  pq=  findstudentwithsecondhighestscore( dd);
		if(pq==null)
		{
			System.out.println("hhhhhh");
		}
		else
		{
			System.out.println(pq.getRollNo()+"#"+pq.getName()+"#"+pq.getScore());
		}
	}
	public static int     findcountofdaysscholarstudent(Student[] dd)
	{
		int count=0;
		for(int i=0;i<4;i++)
		{
			if(dd[i].getScore()>80 && dd[i].getDayScholar()==true)
			{
				count++;
			}
		}
		return count;
	}
	
	public static Student   findstudentwithsecondhighestscore(Student [] dd)
	{
		ArrayList<Student>pq= new ArrayList<Student>();
		for(int i=0;i<4;i++)
		{
			if(dd[i].getDayScholar()==false)
			{
				pq.add(dd[i]);
			}
		}
		if(pq.size()>0)
		{
		Comparator<Student>mysort=Comparator.comparing(Student::getScore);
		Collections.sort(pq,mysort);
		return pq.get(0);
		}
		else
		{
			return null;
		}
	}

}
class Student
{
	int rollNo;
	String name;
	String branch;
	double score;
	boolean dayScholar;
	Student(int rollNo,String name,String branch,double score,boolean dayScholar)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.branch=branch;
		this.score=score;
		this.dayScholar=dayScholar;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo )
	{
		this.rollNo=rollNo;
	}
	public  String getName()
	{
		return name;
	}
	public void setName(String name )
	{
		this.name=name;
	}
	public String getBranch()
	{
		return branch;
	}
	public void setBranch(String branch )
	{
		this.branch=branch;
	}
	public double getScore()
	{
		return score;
	}
	public void setScore(double score )
	{
		this.score=score;
	}
	public boolean getDayScholar()
	{
		return dayScholar;
	}
	public void setDayScholar(boolean dayScholar )
	{
		this.dayScholar=dayScholar;
	}
	
}
