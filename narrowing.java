class  narrowing
{
	public static void main(String[] args) 
	{
		//long to int
		long a=54643;
		int b=(int)a;
		System.out.println(a);
		System.out.println(b);

		//long to char
		long c=97;
		char d=(char)c;
		System.out.println(c);
		System.out.println(d);

		/*float to int
        float e=1.0;
		int f=(int)e;
		System.out.println(e);
		System.out.println(f);*/

       /*float to char
	   float m=97.0;
	   char n=(char)m;
		System.out.println(m);
		System.out.println(n);*/
		
		//double to long
		double m=123.123;
		long n=(long)m;
		System.out.println(m);
		System.out.println(n);

		//double to int
		double o=321.321;
		int p=(int)o;
		System.out.println(o);
		System.out.println(p);

		//double to char
		double r=123.123;
		char s=(char)r;
		System.out.println(r);
		System.out.println(s);

		//double to float
		double t=987.987;
		float u=(float)t;
		System.out.println(t);
        System.out.println(u);
	}
}
