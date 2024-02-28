package com.cisco.app;

import java.util.Scanner;

public class MyApp {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		int []cashback = {30,40,10,4,60,23,90,45};
		System.out.println("Enter any number");
		int luckyNo=sc.nextInt();
		try {
			int cash=cashback[luckyNo];
			System.out.println("Congratulations you won cashback of "+ cash);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Better luck next time");
		}finally {
			sc.close();
		}
		
	}
}
