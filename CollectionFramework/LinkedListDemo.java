package com.jid.CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();
		l.add((int) 'a');
		l.add(30);
		l.add(null);
		l.add((int) 'b');
		System.out.println(l);
		
		l.set(0,5);
		System.out.println(l);
		
		l.add(0, 11);
		System.out.println(l);
		
		((LinkedList<Integer>) l).removeLast();
		System.out.println(l);
		
		((LinkedList<Integer>) l).addFirst(123);
		System.out.println(l);
		
	}

}
