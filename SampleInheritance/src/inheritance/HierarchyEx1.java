package inheritance;

public class HierarchyEx1 extends HierarchyEx {
	public void add() {
		c=a-b;
	System.out.println("Subtraction=" +c);
		
	}

	public static void main(String[] args) {
		
		HierarchyEx1 obj=new HierarchyEx1();
		obj.values();
		obj.add();
		
	}

}
