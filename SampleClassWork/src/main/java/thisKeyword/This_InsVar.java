package thisKeyword;

public class This_InsVar {
	String name;
	int height;
	
	public void details(String name, int height) {
		this.name =name;
		this.height=height;
	}
	public void display() {
		System.out.println(name+ "" + height);
	}
	
	public static void main (String args[]) {
		This_InsVar obj=new This_InsVar();
		obj.details("Sruthy",165);
		obj.display();
	}
}