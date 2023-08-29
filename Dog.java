class Animal
{
	public void eat()
	{
		System.out.println("Animal can eat");
	}
}
class Dog extends Animal
{ 
	public void walk()
	{
		System.out.println("All dogs are walk");
	}

	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		d1.walk();
		d1.eat();
	}
}
