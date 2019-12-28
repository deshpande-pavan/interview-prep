package com.recursion;

public class RecursionInternallyStack {

	public static void main(String[] args) {
		foo(3);
	}

	private static void foo(int i) {
		if (i < 1) {
			return;
		} else {
			foo(i - 1);
			System.out.println("hello world " + i);
		}
	}

}
