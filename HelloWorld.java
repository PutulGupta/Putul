package eclipsetest;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!!");
		long l = 42;
		int i = (int)l;
		mathDemo();

	}

	private static void mathDemo() {
		// TODO Auto-generated method stub
		double random = Math.random();
		int winner = (int) (random * 100) + 1;
		
		System.out.println(random);
		System.out.println(winner);
		
		long distance1 = Math.round(24.45);
		float distance2 = Math.round(24.5f);
		
		System.out.println(distance1);
		System.out.println(distance2);
		
		//ceil round up
		double ceil1 = Math.ceil(24.45);
		double ceil2 = Math.ceil(25.0);
		
		System.out.println(ceil1);
		System.out.println(ceil2);
		
		double max = Math.max(24.45, 24.5);
		System.out.println(max);
		
		HelloWorld hw = new HelloWorld(1);
		
	}
	public HelloWorld(){
		System.out.println("Inside no-args constructor");
	}
	
	public HelloWorld(int id){
		System.out.println("Inside parametrized constructor");
	}
	{
		System.out.println("Inside instance initializer...");
	}
	
	

}
