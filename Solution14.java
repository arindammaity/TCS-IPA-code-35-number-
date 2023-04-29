package ilp;
import java.util.*;
public class Solution14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		RRT[] rr= new RRT[4];
		for(int i=0;i<4;i++)
		{
			int a= sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			sc.nextLine();
			String e= sc.nextLine();
			rr[i]=new RRT(a,b,c,d,e);
		}
		String f = sc.nextLine();
		
		RRT temp = getHighestPriorityTicket( rr, f);
		if(temp==null)
		{
			System.out.println("No such Ticket");
		}
		else
		{
			System.out.println(temp.getTicketNo());
			System.out.println(temp.getRaisedBy());
			System.out.println(temp.getAssignedTo());
		}
		
	}
  public static   RRT  getHighestPriorityTicket(RRT[] rr,String f)
  {	  
	  ArrayList<RRT>pq= new  ArrayList<RRT>();
	  for(int i=0;i<4;i++)
	  {
		  if(rr[i].getProject().equalsIgnoreCase(f))	  
			  {
				  pq.add(rr[i]);
			  }  
	  }
	  if(pq.size()>0)
	  {
	   Comparator<RRT>mysort= Comparator.comparing(RRT::getPriority);
	   Collections.sort(pq,mysort);
	   return pq.get(0);
	  }
	  else
	  {
	      return null;
	  }
  }
}
class RRT
{
	int ticketNo;
	String raisedBy;
	String assignedTo;
	int priority;
	String project;
	RRT(int ticketNo,String raisedBy,String assignedTo,int priority,String project)
	{
		this.ticketNo=ticketNo;
		this.raisedBy=raisedBy;
		this.assignedTo=assignedTo;
		this.priority=priority;
		this.project=project;
	}
	public int getTicketNo() 
	{
	    return ticketNo;	
	}
	public void setTicketNo(int ticketNo)
	{
		this.ticketNo=ticketNo;
	}
	public String getRaisedBy() 
	{
	    return raisedBy;	
	}
	public void setRaisedBy(String raisedBy)
	{
		this.raisedBy=raisedBy;
	}
   
	public String getAssignedTo() 
	{
	    return assignedTo;	
	}
	public void setAssignedTo(String assignedTo)
	{
		this.assignedTo=assignedTo;
	}
	public int getPriority() 
	{
	    return priority;	
	}
	public void setPriority(int priority)
	{
		this.priority=priority;
	}
	public String getProject() 
	{
	    return project;	
	}
	public void setProject(String project)
	{
		this.project=project;
	}

}
