package com.jid.JVMInternals;

public class SubClass extends SuperClass {
	static final int STATIC_FINAL = 47;
	static final int STATIC_FINAL2 = (int) (Math.random() * 5);

	static {
		System.out.println("Subclass : Static initializer");
	}
	
	public SubClass() {
		System.out.println("Subclass : Constructor");
	}

}
