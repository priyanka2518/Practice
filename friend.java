class friend 
{
	String mobile;

	friend(String mobile)
	{
		this.mobile=mobile;
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
	public static void main(String[] args) 
	{
		friend f=new friend("MI");
		friend f2=new friend("vivo");
		System.out.println(f.mobile);
		System.out.println(f.equals(f2));

		friend f3=new friend("vivo");
		friend f4=new friend("vivo");
		System.out.println(f3.mobile);
		System.out.println(f3.equals(f4));
	}
}
