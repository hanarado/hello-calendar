package Pac_Calendar;

import java.util.Scanner;

public class SumTwoNum {

	public static void main(String[] args) {
		int firstNo, secondNo;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers!");
		
		firstNo = sc.nextInt();
		secondNo = sc.nextInt();
		
		sum = firstNo + secondNo;
		
		System.out.println(firstNo + " + " + secondNo + " = " + sum);
		
		sc.close();
		
	}
}

