package com.jid.JVMInternals;

public class ReflectionDemo {

	public static void demoClassObjectAccess() {
		System.out.println("\nIn demoClassObjectAccess...");
		
		//Using objectRef.getClass()
		String[] strArray = {"a", "b", "c"};
		System.out.println("\nstrArray.getClass().getName():" + strArray.getClass().getName());
		
		//Using for class.forName
		Class clazz = null;
		try {
			clazz = Class.forName("com.jid.JVMInternals.User");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("\nCan't find class...");
			
		}
		System.out.println("\nClazz.getName()" + clazz.getName());
		
	}

}
