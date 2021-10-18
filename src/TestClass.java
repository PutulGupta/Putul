
public class TestClass {
	
	public static int getVal() {
		return 42;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Intref i = new Intref();
		//Intref i = new ServiceProvider();
		Intref i = (Intref) new SubSubClass();
		i.m1();
		i.m2();
		

	}

}
