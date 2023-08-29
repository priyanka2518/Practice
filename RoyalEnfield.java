//upcasting-->
class bike
{
	public void varieties()
    {
       System.out.println("There are lots of bike in a market");
	}
}
class bullet extends bike
{
	public void colour()
	{
	  System.out.println("there are many colors in bullet");
	}
}
class  RoyalEnfield extends bullet
{
	public void sound()
	{
	  System.out.println("Specific sound");
	}
	public static void main(String[] args) 
	{
		RoyalEnfield r=new RoyalEnfield();
		r.sound();
		r.colour();
		r.varieties();
		
		bullet b=r;
		b.colour();
		b.varieties();
		//b.sound();

		bike bk=b;
		bk.varieties();
		//bk.colour();
		//bk.sound();
	}
}
