package Pac_Calendar;

import java.util.Scanner;

public class Calendar2 {
	public static void main(String[] args) {
		
		// 월을 받아 최대 일자 출력
		// while 로 반복문 처리
		// break문과 continue문 활용하여  -1로 종료, 0이하나 13개월 이상은 skip 계속 처리
		
		int month;
		int maxDay;
		int[] yearMonth = {31, 28, 31,30,31,30,31,31,30,31,30,31};
		long startTime, endTime;

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a month! 0 입력시 종료");
			month = sc.nextInt();
			
			startTime = System.currentTimeMillis();
			
			if(month < 0 || month > 12) {
				continue;				
			} else if(month == 0) {
				break;
			} else {		
				maxDay = yearMonth[month -1];
				System.out.println(month + " = " + maxDay);
			}
			
			endTime = System.currentTimeMillis();
			
			System.out.println("==========================");
			System.out.println("Start Time = " + startTime);
			System.out.println("End Time   = " + endTime);
			System.out.println("Run Time   = " + ((float)(endTime - startTime)) /1000 + " sec" );
			System.out.println("==========================");
			System.out.println();
		}
	
		System.out.println("The end");
		
	} 
}