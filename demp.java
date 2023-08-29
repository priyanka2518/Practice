//equals()
/*class p45 
{
	public static void main(String[] args) 
	{
		p45 p1=new p45();
		System.out.println(p1);
		p45 p2=new p45();
		System.out.println(p2);

		System.out.println(p2.equals(p1));
		System.out.println();

		p45 var1=new p45();
		p45 var2=var1;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var1.equals(var2));


	}
}*/

class friend
{
	String mobile;
	friend(String m)
	{
		this.mobile=m;
	}
	public boolean equals(Object obj)
	{
		boolean n=false;

		if(this.mobile==((friend)var).mobile)
		{
			n=true;
		}
		return n;
}
class demo
{
	public static void main(String args[])
	{
		friend f=new friend("vivo");
		System.out.println(f);
		friend f2-new friend("oppo");
		System.out.println(f2);

		System.out.println(f2.equals(f1));


	}
}
