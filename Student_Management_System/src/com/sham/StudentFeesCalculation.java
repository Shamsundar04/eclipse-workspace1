package com.sham;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentFeesCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Select a particular type of Student :");
			System.out.println(" 1) Hosteller Student ");
			System.out.println(" 2) Day Scholar Student ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				try {
					System.out.println("You have selected Hosteller!!!");
					System.out.print("Enter Student id : ");
					int hId = sc.nextInt();

					System.out.print("Enter Student Name : ");
					sc.nextLine();
					String hName = sc.nextLine();

					System.out.print("Enter Exam Fees : ");
					double eFee = sc.nextDouble();

					System.out.print("Enter Hostel Fee : ");
					double hFee = sc.nextDouble();

					System.out.print("Enter your total fees : ");
					double totalFee = sc.nextDouble();

					Hosteller hosteller = new Hosteller(hId, hName, eFee, hFee, totalFee);
					System.out.println("Refundable Amount is : " + hosteller.payFee());
					System.out.println(hosteller);

				} catch (InputMismatchException e) {
					System.out.println("Invalid input type! Please enter numbers where required.");
				}
				break;
			}

			case 2: {
				try {
					System.out.println("You have selected Day Scholar!!!");
					System.out.print("Enter Student id : ");
					int sId = sc.nextInt();

					System.out.print("Enter Student Name : ");
					sc.nextLine(); // consume newline
					String sName = sc.nextLine();
					
					System.out.print("Enter Exam Fees : ");
					double eFee = sc.nextDouble();

					System.out.print("Enter Transport Fee : ");
					double tranFee = sc.nextDouble();

					System.out.print("Enter your total fees : ");
					double totalFee = sc.nextDouble();

					DayScholar dayScholar = new DayScholar(sId, sName, eFee, tranFee, totalFee);
					System.out.println("Payable Amount is : " + dayScholar.payFee());
					System.out.println(dayScholar);

				} catch (InputMismatchException e) {
					System.out.println("Invalid input type! Please enter numbers where required.");
				}
				break;
			}

			default:
				throw new IllegalArgumentException("Invalid choice! Please select 1 or 2.");
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter only numeric values.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Something went wrong: " + e.getMessage());
		} finally {
			sc.close();
			System.out.println("Program Ended.");
		}
	}
}
