package com.Task_9;

public class Pallindrome {

	public static void main(String[] args) {
		String str = "malayalam";
		String result2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			result2 = result2 + str.charAt(i);
		}

		if (str.equals(result2)) {
			System.out.println("yes it is");
		} else {
			System.out.println("No it was not");
		}
	}

}
