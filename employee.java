//this call statement
class employee
{
	String name;
	String cname;
	employee(String name)
	{
		this.name=name;
		System.out.println(name);
	}

	employee()
	{
		this("priya",1);
		System.out.println("Company()");
	}

	employee(String cname,int id)
	{
		this("priya");
		System.out.println("company name is Infosys");
	}

	public static void main(String[] args) 
	{
		employee e=new employee();
	}
}
