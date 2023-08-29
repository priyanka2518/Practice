//method overriding
class mobile
{
  public void ram()
	{
	  System.out.println("Mobile has a ram");
	}
}
class vivo extends mobile
{
	public void ram()
	{
		System.out.println("Vivo has a ram");
	}
	public static void main(String[] args) 
	{
		vivo v=new vivo();
		v.ram();
		mobile m=v;
		m.ram();
	}
}
