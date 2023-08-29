//enter five different values...by using loop and display sum of that numbers
class sum
{
	public static void main(String[] args) 
	{
	   //for loop
		int summ=0;
		for (int i=1;i<=5;i++)
		{
			summ=summ+i;
		}
		System.out.println("Sum is:"+summ);
		
		//while loop
		int a=1;
		while(a>=5)
		{
			summ=summ+a;
			a++;
		}
			System.out.println("Sum is:"+summ);

		//do while loop
		int b=1;
		int add=0;
		do
		{
			add=add+b;
			b++;
		}
		while (b<=10);
		System.out.println("Sum is:"+add);

	}
}
