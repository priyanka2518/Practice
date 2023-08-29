abstract class city
{
	abstract public void facilities();
}
abstract class  pune2 extends city
{
	public void corporation()
	{
		System.out.println("Pune city provide multiple facilities");
	}
class pimpari extends pune2
{
	public void corporation()
	{
		System.out.println("Pimpari is corporation");
	}
}
	public static void main(String[] args) 
	{
		pimpari p=new pimpari();
	}
}
