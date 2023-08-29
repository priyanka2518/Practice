//Accept the basic salary via CLA* and calculate the following
//DA=20% of basic
//HRA=30%of basic
//calculate gross salary GROSS=BASIC+DA+HRA
//calculate the income tax(IT) based on the following condition
class payslip
{
	public static void main(String[] args) 
	{
		int basic_sal=20000;

        double da=0.2*basic_sal;
		System.out.println("DA is:"+da);
		
		double hra=0.3*basic_sal;
		System.out.println("HRA is:"+hra);

	    double gross=basic_sal+da+basic_sal;
		System.out.println("Gross salary is:"+gross);

		double tax=0;

        if(basic_sal>0 && basic_sal<4000)
		{
			tax=basic_sal*0.04;
			System.out.println("Tax is:"+tax);
		}
		else if (basic_sal>=4000 && basic_sal<10000)
		{
			tax=basic_sal*0.06;
			System.out.println("Tax is:"+tax);
		}
		else if (basic_sal>=10000 && basic_sal<17000)
		{
			tax=basic_sal*0.08;
			System.out.println("Tax is:"+tax);
		}
		else if (basic_sal>=17000 && basic_sal<27000)
		{
			tax=basic_sal*0.1;
			System.out.println("Tax is:"+tax);
		}
		else
		{
			tax=basic_sal*0.15;
			System.out.println("Tax is:"+tax);
		}
	}
}
