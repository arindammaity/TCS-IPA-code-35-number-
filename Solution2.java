package ilp;
import java.util.*;
public class Solution2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Student [] ss = new Student[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			ss[i]= new Student(a,b,c,d);
			
		}
		int e = sc.nextInt();
		
		Student  pq =  findStudentWithMaximumAge( ss);
		if(pq!=null)
		{
			System.out.println("id-"+pq.getId());
			System.out.println("name-"+pq.getName());
			System.out.println("marks-"+pq.getMarks());
			System.out.println("age-"+pq.getAge());
		}
		else
		{
			System.out.println("Nothing");
		}
		
		Student temp = searchStudentById( ss, e);
		if(temp!=null)
		{
			System.out.println("id-"+temp.getId());
			System.out.println("name-"+temp.getName());
			System.out.println("marks-"+temp.getMarks());
			System.out.println("age-"+temp.getAge());
		}
		else
		{
			System.out.println("No student found with mentioned attribute");
		}
			
	} 
	public  static    Student    findStudentWithMaximumAge(Student[] ss)
	{
		ArrayList <Student> pq = new ArrayList<Student>();
		for(int i=0;i<ss.length;i++)
		{
			pq.add(ss[i]);
		}
		Comparator<Student> mysort = Comparator.comparing(Student::getAge);
		Collections.sort(pq,mysort);
		return pq.get(3);
	}
	
	public static  Student searchStudentById(Student[] ss,int e)
	{
		for(int i=0;i<ss.length;i++)
		{
			if(ss[i].getId()==e)
			{
				return ss[i];
			}
		}
		return null;
	}

}
class Student
{
	int id;
	String name;
	int marks;
	int age;
	Student(int id,String name,int marks,int age)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}
