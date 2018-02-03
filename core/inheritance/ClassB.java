package com.core.inheritance;

public class ClassB extends ClassA {
	int i = 20;

	@Override
	public void m1() {
		System.out.println("m1() of ClassB");
	}

	public void m2() {
		System.out.println("m2() of ClassB");
	}
}
