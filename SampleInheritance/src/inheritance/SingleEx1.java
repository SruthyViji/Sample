package inheritance;

public class SingleEx1 extends SingleEx {     // class ChildclassName extends ParentClassName
	
	public void display() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		
SingleEx1 obj=new SingleEx1();       // object initialization
obj.display();
obj.Add();
	}

}
