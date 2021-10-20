package com.jid.CollectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Putul");
		list.add("Gaurav");
		list.add("Shabbu");
		list.add("Rajesh");
		list.add("Saurav");
		
		System.out.println(list);
		
		ListIterator<String> litr = list.listIterator();
		while(litr.hasNext()) {
			String s = (String)litr.next();
			if(s.equals("Shabbu")) {
				litr.remove();
			}
			else if(s.equals("Rajesh")) {
				litr.add("Shabnam");
			}
			else if(s.equals("Gaurav")) {
				litr.set("Silent");
			}
		}
		System.out.println(list);

	}

}
