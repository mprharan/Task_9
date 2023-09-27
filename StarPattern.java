package com.Task_9;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n = scanner.nextInt();
		scanner.close();

		// Loop to iterate through rows
		for (int i = 1; i <= n; i++) {
			// Loop to iterate through columns
			for (int j = 1; j <= n; j++) {
				// Print spaces if i is not equal to j and not equal to n - j + 1
				if (i != j && i != n - j + 1) {
					System.out.print(" ");
				} else {
					// Print asterisk if i is equal to j or n - j + 1
					System.out.print("*");
				}
			}
			// Move to the next line after each row
			System.out.println();
		}
	}
}
