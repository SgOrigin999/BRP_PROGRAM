package com.day2;

public class MethodError {
	public static void main(String[] args) {
		Produce p = new Produce();
		p.add(5, 6);
		//p.display();
	}
}

class Produce {
	int c=0;
	public void add(int a, int b) {
		 c = a + b;
		 show(c);
	}
	public void show(int c) {
		System.out.println("Output::"+c);
	}
}
