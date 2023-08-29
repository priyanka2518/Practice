//hashcode
/*class p44
{
	public static void main(String[] args) 
	{
		p44 obj=new p44();
		System.out.println(obj.hashCode());
	}
}*/

class mobile
{
  int price;
  mobile(int p)
  {
	  price=p;
  }
  public int hashCode()
	{
	  return price;
	}
}
class ram
{
	public static void main(String args[])
	{
		mobile m=new mobile(10000);
		System.out.println(m.hashCode());
	}
}
