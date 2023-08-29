//method overriding with help of interface
interface hp
{
  void manufacturing();
}
class company2
{
	public void manufacturing()
	{
		System.out.println("Company can manufacture products");
	}
	public static void main(String[] args) 
	{
		company2 c=new company2();
		c.manufacturing();
	}
}
