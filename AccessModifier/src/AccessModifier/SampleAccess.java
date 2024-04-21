package AccessModifier;

public class SampleAccess {
	 
	public void display() {
	System.out.println("Method_Public Modifier");	
	}
	protected void display1() {
		System.out.println("Method_Protected Modifier");
	}
	private void display2() {
		System.out.println("Method _Private Modifier");
	}
	void display3() {
		System.out.println("Method_Default Modifier");
	}
	
	public static void main(String[] args) {
		
		SampleAccess obj=new SampleAccess();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	}
}
