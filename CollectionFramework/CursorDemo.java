package com.jid.CollectionFramework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		Enumeration<String> e = v.elements();
		Iterator<String> itr = v.iterator();
		ListIterator<String> litr =  v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
		
	}

}
