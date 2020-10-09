/*
from year 부터 to year까지 윤년 판정
윤년 여부  : 1=윤년, 0=평년
 */
package Pac_Calendar;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String prompt = " Year >> ";
			
		while(true) {
			System.out.println("Finding Leap Year!");
			System.out.println("Year From?");
			int fromYear = sc.nextInt();
			
			System.out.println("Year To?");
			int toYear = sc.nextInt();
			
			System.out.println("년도별 출력 ? Y or N");
			String printYn = sc.next();
			
			int leapYear = 0;
			int leapYearCnt = 0;
			
			for(int i = fromYear; i <= toYear; i++) {
				leapYear = leapYear(i);
				
				if(leapYear == 1) {
					leapYearCnt ++;
				}
				
				if(printYn.equalsIgnoreCase("y")) {
					System.out.println(prompt + i + " : " + leapYear);
				}

			}
			
			System.out.println("---------------");
			System.out.println("Leap Year Count from Year" + fromYear + " to Year"+ toYear + " = " + leapYearCnt);
			System.out.println();
		}
		
	}
	
	public static int leapYear(int year) {
		int leapYear = 0;
		
		if((year%4) == 0) {
			leapYear = 1;
			if((year%100) == 0) {
				leapYear = 0;
				if((year%400) ==0) {
					leapYear = 1;
				}
			}
		}

		return leapYear;
 	}
}