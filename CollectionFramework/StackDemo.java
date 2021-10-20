package com.jid.CollectionFramework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
		

	}

}
