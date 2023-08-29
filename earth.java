//Downcasting -->parent to child
class Animal
{
	public void walk()
	{
	System.out.println("All animals can walk");
	}
}
class cat extends Animal
{
  public void sleep()
	{
	  System.out.println("All cats are lazy");
	}
}
class persiancat extends cat
{
	public void sound()
	{
		System.out.println("They have specific sound");
	}
}
class earth extends persiancat 
{
	public static void main(String[] args) 
	{
		Animal a=new persiancat();
		a.walk();
		System.out.println();

		cat c=(cat)a;
		c.walk();
		c.sleep();
		System.out.println();

		persiancat p=(persiancat)c;
		p.walk();
		p.sleep();
		p.sound();
	}
}
