package inheritance;

public class MultiLevelEx2 extends MultiLevelEx1 {
	public void display2() {
		System.out.print("  Rose");
	}

	public static void main(String[] args) {
		MultiLevelEx2 obj=new MultiLevelEx2();
		obj.display();
		obj.display1();
		obj.display2();

	}

}
