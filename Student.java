class Student
{
	private int id;
	String name;
	double fee;
    public double getfee()
	{
		return fee;
	}
	public void setfee(double fee)
	{
		this.fee=fee;
	}
	public void display()
	{
	 System.out.println(this.id);
	 System.out.println(this.name);
	 System.out.println(this.fee);
	}
	Student(int id,String name,double fee)
	{
		this.id=id;
		this.name=name;
		this.fee=fee;
	}

	public static void main(String args[])
	{
		Student s1=new Student(1,"riya",100000);
		System.out.println(s1);

		System.out.println(s1.getfee());
		s1.setfee(20000);
		System.out.println(s1.getfee());
		s1.display();
		}
}