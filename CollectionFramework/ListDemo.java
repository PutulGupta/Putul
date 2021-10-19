package com.jid.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class ListDemo {
	private static void arrayListDemo() {
		Collection<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(null);
		System.out.println("list1:" + list1);
		//Bulk operations
		
	}
	public static void main(String[] args) {
		arrayListDemo();
	}

}
