package com.Task_9;

public class StringReverse {

	public static void main(String[] args) {

		String str = "HariHaran";
		String result2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			result2 = result2 + str.charAt(i);
		}
		System.out.println(result2);

	}

}
