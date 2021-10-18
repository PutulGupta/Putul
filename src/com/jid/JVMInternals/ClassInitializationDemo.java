package com.jid.JVMInternals;

public class ClassInitializationDemo {
	
	static {
		System.out.println("ClassInitializationDemo : Static initializer");
	}

	public static void main(String[] args) {
			System.out.println("SubClass.STATIC_FINAL:" + SubClass.STATIC_FINAL );
			System.out.println("SubClass.STATIC_FINAL2:" + SubClass.STATIC_FINAL2 );
			new SubClass();


	}

}
