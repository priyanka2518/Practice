import java.io.*;
import java.util.*;
class integer 
{
	int x,y;

	integer(int a,int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter value of a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		integer obj=new integer(a,b);
		obj.display();
	}
}

