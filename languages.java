//hierarchical inheritance
class java
{
   public void lang()
	{
	  System.out.println("There are two types in java");
	}
}
class corejava extends java
{
  public void type()
	{
	  System.out.println("core java is a type of a java");
	}
}
class advancejava extends java
{
	public void type2()
	{
		System.out.println("Advance java is a type of a java");
	}
}
class  languages
{
	public static void main(String[] args) 
	{
		advancejava aj=new advancejava();
		aj.type2();
		aj.lang();

		corejava cj=new corejava();
		cj.type();
		cj.lang();
	}
}
