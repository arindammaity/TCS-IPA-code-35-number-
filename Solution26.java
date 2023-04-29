package ilp;
import java.util.*; 
public class Solution26
{
	public static void main(String[]  args)
	{
		Scanner sc = new Scanner(System.in);
        Medicine[] mm = new Medicine[4];
        for(int i=0;i<4;i++)
        {
        	String a = sc.nextLine();
        	String b= sc.nextLine();
        	String c = sc.nextLine();
        	int d = sc.nextInt();
        	sc.nextLine();
        	mm[i]= new Medicine(a,b,c,d);
        }
        String  e = sc.nextLine();
        Integer[] ll= getpricebydisease(mm,e);
        for(int i=0;i<ll.length;i++)
        {
        	System.out.println(ll[i]);
        }
		
	}
	public static   Integer[]  getpricebydisease(Medicine[] mm,String e)
	{
		Integer[] ll= new Integer[0];
		for(int i=0;i<4;i++)
		{
			if(mm[i].getDisease().equalsIgnoreCase(e))
			{
				ll= Arrays.copyOf(ll,ll.length+1);
				ll[ll.length-1]=mm[i].getPrice();
			}
		}
		Arrays.sort(ll);
		return ll;
	}
}
class Medicine
{
	String  name;
  	String  batch;
  	String disease;
  	int price;
  	Medicine(String name,String batch,String disease,int price)
  	{
  		this.name=name;
  		this.batch=batch;
  		this.disease=disease;
  		this.price=price;
  	}
  	public String  getName()
  	{
  		return  name;
  	}
  	public void setName(String name)
  	{
  		this.name=name;
  	}
  	public String  getBatch()
  	{
  		return  batch;
  	}
  	public void setBatch(String batch)
  	{
  		this.batch=batch;
  	}
  	public String  getDisease()
  	{
  		return  disease;
  	}
  	public void setDisease(String disease)
  	{
  		this.disease=disease;
  	}
  	public int  getPrice()
  	{
  		return  price;
  	}
  	public void setPrice(int price)
  	{
  		this.price=price;
  	}
}