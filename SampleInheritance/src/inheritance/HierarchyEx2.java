package inheritance;

public class HierarchyEx2 extends HierarchyEx{
	public void sub() {
		c=a-b;
		System.out.println("Subtration= "+ c);
	}

	public static void main(String[] args) {
		HierarchyEx2 obj= new HierarchyEx2();
		obj.values();
		obj.sub();
	}

}
