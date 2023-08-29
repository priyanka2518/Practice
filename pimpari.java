/* abstract class city
{
	abstract public void facilities();
}*/ 
abstract class  pune2 
{
	abstract public void corporation();
	
}
class pimpari extends pune2
{
	public void corporation()
	{
		System.out.println("Pimpari is corporation");
	}

	public static void main(String[] args) 
	{
		pimpari p=new pimpari();
		p.corporation();

		pune2 p2;
		
	}
}
