interface vehical
{
	public void speed();
}
class electricpower
{
	public void capacity()
	{
		System.out.println("capacity()");
	}
}
class electricalvehical extends electricpower implements vehical
{
  public void speed()
	{
	  System.out.println("speed()");
	}
	public static void main(String[] args) 
	{
		electricalvehical e=new electricalvehical();
		e.capacity();
		e.speed();
	}
}
