package com.Task_9;

public class LargestOfThree {

	public static void main(String[] args) {

		int a = 100;
		int b = 100;
		int c = 1200;

		if (a == b && b == c) {
			System.out.println("All the inputs are equal");
		} else if (a > b && a > c) {
			System.out.println(a + " Is the largest among all");
		} else if (b > a && b > c) {
			System.out.println(b + " Is the largest among all");
		} else if (c > a && c > b) {
			System.out.println(c + " Is the largest among all");
		}

	}

}
