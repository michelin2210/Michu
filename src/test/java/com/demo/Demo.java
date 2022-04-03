package com.demo;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {
	private void methodEnumeration() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(80);
		Enumeration<Integer> elements = v.elements();
		while (elements.hasMoreElements()) {
			Integer element = (Integer) elements.nextElement();
			System.out.println(element);
		}
	}

	private void hello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.methodEnumeration();
		d.hello();
	}

}
