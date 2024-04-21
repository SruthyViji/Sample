package superkeyword;

public class super_mtd2 extends super_mtd1 {
	public void add() {
		super.add();                // super method
		
		int c=super.a+ super.b;     // super variable
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super_mtd2 obj=new super_mtd2();
		obj.add();
	}

}
