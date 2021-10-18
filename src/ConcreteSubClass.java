public class ConcreteSubClass extends SubClass {
	
	void test2() {
		System.out.println("test2");
	}
	
	void test3() {
		System.out.println("test3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreteSubClass concrete = new ConcreteSubClass();
		//concrete.test1();
		concrete.test2();
		concrete.test3();

	}

}
