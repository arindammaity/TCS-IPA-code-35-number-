package ilp;
import java.util.*;
public class Solution55
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int noofinput = sc.nextInt();
	Employee[] employees = new Employee[3];
	for(int i=0;i<employees.length;i++)
	{
		int employeeID = sc.nextInt();
		sc.nextLine();
		String employeeName = sc.nextLine();
		int employeeSalary = sc.nextInt();
		sc.nextLine();
		String employeeGrade = sc.nextLine();
		employees[i]= new Employee(employeeID, employeeName,
		employeeSalary, employeeGrade);
		}
		String searchinggrade= sc.nextLine();
		Employee[] worker=
		getEmployeeWithTheSpecificGrade(employees,searchinggrade);
		if(worker.length==0)
		{
		System.out.println("No employee found with the mentioned grade");
		}
		else
		{
		for(int i=0;i<worker.length;i++)
		{
		System.out.println(worker[i].getEmployeeID());
		System.out.println(worker[i].getEmployeeName());
		System.out.println(worker[i].getEmployeeSalary());
		System.out.println(worker[i].getEmployeeGrade());
		}
		}
		Employee[] employees1 = getEmployeeNameInAscendingOrder(employees);
		for(int i=0;i<employees.length;i++)
		{
		System.out.println(employees1[i].getEmployeeID());
		System.out.println(employees1[i].getEmployeeName());
		System.out.println(employees1[i].getEmployeeSalary());
		System.out.println(employees1[i].getEmployeeGrade());
		}
		}
		public static Employee[] getEmployeeWithTheSpecificGrade(Employee[]
		employees,String searchinggrade)
		{
		int length=0;
		for(int i=0;i<employees.length;i++)
		{
			if(employees[i].getEmployeeGrade().equals(searchinggrade))
			{
			length++;
			}
			}
			Employee[] worker= new Employee[length];
			int count=0;
			for(int i=0;i<employees.length;i++)
			{
			if(employees[i].getEmployeeGrade().equals(searchinggrade))
			{
			worker[count]=employees[i];
			count++;
			}
			}
			return worker;
			}
			public static Employee[] getEmployeeNameInAscendingOrder(Employee[]
			employees)
			{
			for(int i=0;i<employees.length-1;i++)
			{
			for(int j=0;j<employees.length-i-1;j++)
			{
			if(employees[j].getEmployeeName().compareTo(employees[j+1].getEmployeeName())>0)
			{
			Employee temp = employees[j];
			employees[j]= employees[j+1];
			employees[j+1]= temp;
			}
			}
			} return employees;
			}
			}
			class Employee
			{
			private int employeeID;
			private String employeeName;
			private int employeeSalary;
			private String employeeGrade;
			Employee(int employeeID,String employeeName,int employeeSalary,String
			employeeGrade)
			{
				this.employeeID = employeeID;
				this.employeeName=employeeName;
				this.employeeSalary=employeeSalary;
				this.employeeGrade=employeeGrade;
				}
				public int getEmployeeID()
				{
				return employeeID;
				}
				public void setEmployeeId(int employeeId)
				{
				this.employeeID=employeeID;
				}
				public String getEmployeeName()
				{
				return employeeName;
				}
				public void setEmployeeName(String employeeName)
				{
				this.employeeName=employeeName;
				}
				public int getEmployeeSalary()
				{
				return employeeSalary;
				}
				public void setEmployeeSalary(int employeeSalary)
				{
				this.employeeSalary=employeeSalary;
				}
				public String getEmployeeGrade()
				{
				return employeeGrade;
				}
				public void setEmployeeGrade(String employeeGrade)
				{
				this.employeeGrade=employeeGrade;
				}
				}

