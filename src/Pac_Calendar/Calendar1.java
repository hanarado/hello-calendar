package Pac_Calendar;

import java.util.Scanner;

public class Calendar1 {
	public static void main(String[] args) {
		System.out.println("[Calendar] Year 2020. Month 10");
		System.out.println("    월\t   화\t   수\t   목\t   금\t   토\t   일\t");
		System.out.println("  \t \t \t  1\t  2\t  3\t  4\t");
		System.out.println("  5\t  6\t  7\t  8\t  9\t 10\t 11\t");
		System.out.println(" 12\t 13\t 14\t 15\t 16\t 17\t 18\t");
		System.out.println(" 19\t 20\t 21\t 22\t 23\t 24\t 25\t");
		System.out.println(" 26\t 27\t 28\t 29\t 30\t 31\t \t");

		// 월을 받아 최대 일자 출력
		int month;
		int maxDay;
		int[] yearMonth = {31, 28, 31,30,31,30,31,31,30,31,30,31};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복 회수 입력 !");
		int repeat = sc.nextInt();
		
		for(int i = 0; i < repeat; i++) {
			System.out.println("Enter a month!");
			month = sc.nextInt();
			
			maxDay = yearMonth[month -1];
			System.out.println(month + " = " + maxDay);
		}
	
		System.out.println("The end");
		
	} 
}