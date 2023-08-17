package com.Task_9;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks :");
		int mark = sc.nextInt();

		if (mark > 100) {
			System.out.println("Invalid Input");
		} else if (mark == 100) {
			System.out.println("The grade is S");
		} else if (mark >= 90 && mark < 100) {
			System.out.println("The grade is A");
		} else if (mark >= 80 && mark < 90) {
			System.out.println("The grade is B");
		} else if (mark >= 70 && mark < 80) {
			System.out.println("The grade is C");
		} else if (mark >= 60 && mark < 70) {
			System.out.println("The grade is D");
		} else if (mark >= 50 && mark < 60) {
			System.out.println("The grade is E");
		} else if (mark < 50) {
			System.out.println("The grade is F");
		}

	}

}
