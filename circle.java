import java.io.*;
import java.util.*;
class circle 
{
	double rad;
	
	circle(int r)
	{
		rad=r;
	}
	void displayArea()
	{
		double area;
		area=3.14*rad*rad;
		System.out.println(area);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int r;
		System.out.println("Enter radius:");
		r=sc.nextInt();
		circle obj=new circle(r);
		circle.displayArea();
	}
}

