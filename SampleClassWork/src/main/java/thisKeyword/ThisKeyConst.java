package thisKeyword;

public class ThisKeyConst {

		public ThisKeyConst(int a,int b)  
		{
		this();
		int c=a+b;
		System.out.println(c);

		}
		public ThisKeyConst()
		{
		System.out.print("Sum =");
		}
		public static void main (String args[])
		{
		ThisKeyConst a=new ThisKeyConst(5,8);
		}
		}