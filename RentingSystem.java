package com.Task_9;

import java.util.Scanner;

public class RentingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number :");
		int monthno = sc.nextInt();
		System.out.println("Enter the rent per day :");
		int rentperday = sc.nextInt();
		System.out.println("Enter no of days :");
		int days = sc.nextInt();
		double totalrent = 0;
		switch (monthno) {
		case 1:
			System.out.println("The month is January");
			break;
		case 2:
			System.out.println("The month is Febraury");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		case 4:
			System.out.println("The month is April");
			break;
		case 5:
			System.out.println("The month is May");
			break;
		case 6:
			System.out.println("The month is June");
			break;
		case 7:
			System.out.println("The month is July");
			break;
		case 8:
			System.out.println("The month is August");
			break;
		case 9:
			System.out.println("The month is September");
			break;
		case 10:
			System.out.println("The month is October");
			break;
		case 11:
			System.out.println("The month is November");
			break;
		case 12:
			System.out.println("The month is December");
			break;
		}

		if (monthno == 4 || monthno == 5 || monthno == 6 || monthno == 10 || monthno == 11 || monthno == 12) {
			totalrent = (rentperday * days) + ((20 * rentperday) / 100) * days;
		} else {
			totalrent = rentperday * days;
		}
		System.out.printf("%.2f",totalrent);
	}

}
