//method overriding
class bank
{
	public int roi()
	{
		return 0;
	}
}
class sbi extends bank
{
	public int roi()
	{
		return 9;
	}
	public static void main(String[] args) 
	{
		sbi s=new sbi();
		System.out.println(s.roi());
		bank b=s;
		System.out.println(b.roi());
	}
}
