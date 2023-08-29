class block 
{
	int a=10;
    {
		System.out.println(a);
	}
	int b=20;
	{
		System.out.println(this.b);
	}
	public static void main(String[] args) 
	{
		block obj=new block();
	}
}
