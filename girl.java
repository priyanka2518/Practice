//multiple inheritance in java
interface eat
{
	void action();
} 
class move
{
	void moving()
	{
		System.out.println("A girl can perform action");
	}
}
class girl extends move implements eat
{
	public void action()
	{
		System.out.println("A girl can move and eat");
	}
	public static void main(String[] args) 
	{
		girl g=new girl();
		g.action();
		g.moving();
		move m=g;
		m.moving();
	}
}
