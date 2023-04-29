package ilp;
import java.util.*;
public class Solution11 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Course[] cc = new Course[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			int e = sc.nextInt();
			sc.nextLine();
			cc[i]=new Course(a,b,c,d,e);
		}
		String f = sc.nextLine();
		int  g = sc.nextInt();
		int  avg =   findAvgOfQuizByAdmin(cc, f);
		if(avg==0)
		{
			System.out.println("No course found");
		}
		else
		{
			System.out.println(avg);
		}
		
		 Course[]  hhh=  sortCourseByHandsOn(cc, g);
		 if(hhh.length>0)
		 {
			 for(int i=0;i<hhh.length;i++)
			 {
				 System.out.println(hhh[i].getCourseName());
			 }
		 }
		 else
		 {
			 System.out.println("No course found with mentioned attribute");
		 }
		
	}

	
	
	public static    int   findAvgOfQuizByAdmin(Course[] cc,String f)
	{
		int count=0;
		int sum =0;
		for(int i=0;i<4;i++)
		{
			if(cc[i].getCourseAdmin().equalsIgnoreCase(f))
			{
				count++;
				sum = sum+cc[i].getQuiz();
			}
		}
		if(count>0)
		{
			return (sum/count);
		}
		else
		{
			return 0;
		}
	}
	
	public static     Course[]   sortCourseByHandsOn(Course[] cc,int g)
	{
		Course[] hhh = new Course[0];
		for(int i=0;i<4;i++)
		{
			if(cc[i].getHandson()<g)
			{
				hhh = Arrays.copyOf(hhh, hhh.length+1);
				hhh[hhh.length-1]=cc[i];
			}
		}
		
		Arrays.sort(hhh,(x,y)->x.getHandson()-y.getHandson());
		return hhh;
	}
}
class Course
{
	int courseId;
	String courseName;
	String courseAdmin;
	int quiz;
	int handson;
	Course(int courseId,String courseName,String courseAdmin,int quiz,int handson)
	{
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseAdmin=courseAdmin;
		this.quiz=quiz;
		this.handson=handson;
	}
	public int getCourseId()
	{
	    return courseId;	
	}
	public void setCourseId(int courseId)
	{
		this.courseId=courseId;
	}
	public String getCourseName()
	{
	    return courseName;	
	}
	public void setCourseId(String courseName)
	{
		this.courseName=courseName;
	}
	public String getCourseAdmin()
	{
	    return courseAdmin;	
	}
	public void setCourseAdmin(String courseAdmin)
	{
		this.courseAdmin=courseAdmin;
	}
	public int getQuiz()
	{
	    return quiz;	
	}
	public void setQuiz(int quiz)
	{
		this.quiz=quiz;
	}
	public int getHandson()
	{
	    return handson;	
	}
	public void setHandson(int handson)
	{
		this.handson=handson;
	}
}
