//super call statement
class employee
{
	String name;
	employee(String name)
	{
		this.name=name;
		System.out.println(name);
	}
}
class company extends employee
{
	company()
	{
		super("priya");
		System.out.println("Company()");
	}
	public static void main(String[] args) 
	{
		company c=new company();
	}
}
