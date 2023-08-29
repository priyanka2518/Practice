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
}

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

		if(this.mobile==((friend)obj).mobile)
		{
			n=true;
		}
		return n;
	}
}
class demo2
{
	public static void main(String args[])
	{
		friend f=new friend("vivo");
		System.out.println(f.mobile);
		friend f2=new friend("vivo");
		System.out.println(f2.mobile);

		System.out.println(f2.equals(f));


	}
}*/

class earth
{
	String size;
	earth(String s)
	{
		size=s;
	}

	public boolean equals(Object obj)
	{
		boolean n=false;
		if(this.size==((earth)obj).size)
		{
		 n=true;
		}
		return n;
	}
}
class planet
{
  public static void main(String args[])
	{
	  earth e1=new earth("100000cm");
		System.out.println(e1.size);
      earth e2=new earth("100000cm");
		System.out.println(e2.size);

      		System.out.println(e1.equals(e2));

	 

	}
}
