package com.jid.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		for(int i =0; i<10; i++) {
			v.addElement(i);
			
		}
		System.out.println(v);
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			Integer I = (Integer) e. nextElement();
			if(I%2 == 0) {
				System.out.println(I);
			}
			else {
				System.out.println(I + "-Will be removed");
				v.remove(I);
				System.out.println(v);
			}
		}
		System.out.println(v);

	}

}
