package superkeyword;

public class super_variable_2 extends super_variable_1 {
String name ="Vijesh";

public void display() {
	System.out.println(name);
	System.out.println(super.name);
}
	public static void main(String[] args) {
		super_variable_2 obj =new super_variable_2();
		obj.display();

	}

}
