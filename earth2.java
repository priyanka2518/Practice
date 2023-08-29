//classcast exception
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
class earth2 extends persiancat 
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.walk();
        cat c=(cat)a;
		c.sleep();
	}
}
