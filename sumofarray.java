//calculate the sum of number in array
class sumofarray
{
	public static void main(String[] args) 
	{
		int n[]={8,5,4,9,3};
		int sum=0;
		for (int index=0;index<n.length;index++)
		{
			sum=sum+n[index];
		}
		System.out.println(sum);
	}
}
