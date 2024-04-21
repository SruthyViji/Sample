package thisKeyword;
//thiskey for method
public class ThisKeyUse2 {

		public void method1()
		{
			System.out.print("Hello" + " ");	
			this.method2();
		}
		public void method2()
		{
			System.out.print("World");
		}
		public static void main(String args[])
		{
			ThisKeyUse2 obj=new ThisKeyUse2();
	     obj.method1();	 
		}
	}


		
	