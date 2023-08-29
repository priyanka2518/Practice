//toString()
/*class p43 
{
	public static void main(String[] args) 
	{
		p43 obj=new p43();
		System.out.println(obj);
		System.out.println(obj.toString());
	}
}

class campus
{
	String name;
	campus(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "Campus of "+this.name;
	}
	public static void main(String args[])
	{
		campus c=new campus("DYP");
		System.out.println(c);
	}
}*/

class family
{
	int count;
	family(int members)
	{
		count=members;
	}
	public string toString()
	{
	  return "In my family"+count+ "members";
	}
}
class members
{
	public static void main(String args[])
	{
		family f=new family(14);
		System.out.println(f);
	}
}