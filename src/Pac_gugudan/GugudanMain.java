//계산 결과 저장, 출력기능을 별도 class(GugudanCalc)의 method 활용해서 처리
package Pac_gugudan;

import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		int inNum;
		int outNum;
		Scanner sc = new Scanner(System.in);
		RunTimePrint rtp = new RunTimePrint();    //run time print class start
		
		while (true) {
			System.out.println();
			System.out.println(" Insert number for gugudan!");
			inNum = sc.nextInt();
			
			rtp.runTimeStart();    //run time start
			
			System.out.println("[ " + inNum + " Dan ]");
			if (inNum < 10) {
				for (int i = 1; i < 10; i++) {
					outNum = inNum * i;
					System.out.println("  " + inNum + " * " + i + " = " + outNum);
				}
			} else {
				GugudanCalc.calPrint(GugudanCalc.calcOut(inNum));
			}
			
			rtp.runTimeEnd();   //run time start
		}
		
	}
}
