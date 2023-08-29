class p3 
{
	public static void main(String[] args) 
	{
		int n=7;//6,7,
		int m=--n;//6,7,6,7
		int x=m++;//6,5,4
		int y=--x;//5,6
		System.out.println(++n);//7
		System.out.println(m--);//7
		System.out.println(++y);//6
		System.out.println(x--);//5
		System.out.println(++m);//7
		System.out.println(n);//7
		System.out.println(m);//7
		System.out.println(x);//4
		System.out.println(y);//6

	}
}
