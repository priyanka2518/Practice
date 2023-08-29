class supercls 
{
	int x=20;
	void display()
	{
		System.out.println("super class x:"+x);
	}
	}

	class subcls extends supercls
	{
		int x=80;
		void display()
		{
			System.out.println("sub class x :"+x);
			super.display();
		}
	}

	class demo
	{
	public static void main(String[] args) 
	{
		subcls obj=new subcls();
		obj.display();
		supercls s=obj;
		s.display();
	}
}
