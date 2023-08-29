//multilevel inheritance
class india
{
	public void country()
	{
		System.out.println("India is my country");
	}
}
class Maharashtra extends india
{
	public void state()
	{
		System.out.println("Maharashtra is our state");
	}
}
class pune extends Maharashtra
{
	public void dist()
	{
		System.out.println("Pune is my district");
	}
	public static void main(String[] args) 
	{
		pune p=new pune();
		p.dist();
		p.state();
		p.country();
	}
}
