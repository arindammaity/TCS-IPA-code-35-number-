package ilp;
import java.util.*;
public class Solution5
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StudentS[] ss = new StudentS[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			String d = sc.nextLine();
			ss[i]= new StudentS(a,b,c,d);
		}
		String  e = sc.nextLine();
		
		StudentS pq = getLowestScoredStudentByCollegeName( ss, e);
		if(pq==null)
		{
			System.out.println("No such student found");
			
		}
		else
		{
			System.out.println(pq.getStudentId());
			System.out.println(pq.getStudentName());
			System.out.println(pq.getScore());
			System.out.println(pq.getCollegeName());
		}
		
		StudentS mm = getSecondHighestScoredStudent( ss);
		if(mm==null)
		{
			System.out.println("No such student found");
			
		}
		else
		{
			System.out.println(mm.getStudentId());
			System.out.println(mm.getStudentName());
			System.out.println(mm.getScore());
			System.out.println(mm.getCollegeName());
		}
	}
	public static StudentS getLowestScoredStudentByCollegeName(StudentS[] ss,String e)
	{
		ArrayList<StudentS>pq= new ArrayList<StudentS>();
		for(int i=0;i<4;i++)
		{
			if(ss[i].getCollegeName().equalsIgnoreCase(e))
			{
				pq.add(ss[i]);
			}
		}
		if(pq.size()>0)
		{
		Comparator<StudentS>mysort = Comparator.comparing(StudentS::getScore);
		Collections.sort(pq,mysort);
		return pq.get(0);
		}
		else
		{
			return null;
		}
	}
	
	public static StudentS getSecondHighestScoredStudent(StudentS[] ss)
	{
		ArrayList<StudentS>mm=new ArrayList<StudentS>();
		for(int i=0;i<4;i++)
		{
			if(ss[i].getScore()%2!=0 && ss[i].getScore()>500)
			{
				mm.add(ss[i]);
			}
		}
		if(mm.size()>1)
		{
		Comparator<StudentS>mysort = Comparator.comparing(StudentS::getScore);
		Collections.sort(mm,mysort);
		return mm.get(1);
		}
		else
		{
			return null;
		}
	}

}
class StudentS
{
	int  studentId;
	String  studentName;
	int  score;
	String collegeName;
	StudentS(int studentId,String studentName,int score, String collegeName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.score= score;
		this.collegeName=collegeName;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentId(int studentId)
	{
		this.studentId=studentId;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	public int getScore()
	{
		return score;
	}
	public void setScore(int score)
	{
		this.score=score;
	}
	public String getCollegeName()
	{
		return collegeName;
	}
	public void setCollegeName(String collegeName)
	{
		this.collegeName=collegeName;
	}
}
