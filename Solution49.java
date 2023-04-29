package ilp;
import java.util.*;
public class Solution49
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Book[] book = new Book[4];
		for(int i=0;i<4;i++)
		{
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			double d = sc.nextDouble();
			book[i]=new Book(a,b,c,d);
		}
		Book[]   books= sortbooksbyprice( book);
		for(int i=0;i<books.length;i++)
		{
			System.out.println(books[i].getId()+" "+books[i].getTitle()+" "+books[i].getAuthor()+" "+books[i].getPrice());
		}
		
	}
	public static  Book[]   sortbooksbyprice(Book[] book)
	{
		for(int i=0;i<book.length-1;i++)
		{
			for(int j=0;j<book.length-i-1;j++)
			{
				if(book[j].getPrice()>book[j+1].getPrice())
				{
					Book temp = book[j];
					book[j]=book[j+1];
					book[j+1]=temp;
				}
			}
		}
		return book;
	}

}
class Book
{
	int id;
	String title;
	String author;
	double price;
	Book(int id,String title,String author,double price)
	{
		this.id=id;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String  getAuthor()
	{
		return author;
	}
	public void setId(String author)
	{
		this.author=author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
}
