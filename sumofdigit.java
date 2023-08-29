//enter three digit number and calculate sum of digit
class sumofdigit 
{
	public static void main(String[] args) 
	{
		int n=541;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digit is:"+sum);
	}
}
