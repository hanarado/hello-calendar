package Pac_gugudan;

import java.util.Scanner;

public class Gugudan1 {
	public static void main(String[] args) {
		int inNum;
		int outNum;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println(" Insert number for gugudan!");
			inNum = sc.nextInt();	
			System.out.println("[ " + inNum + " Dan ]");
			if(inNum <10) {
				for(int i=1; i<10; i++) {
					outNum = inNum * i;
					System.out.println("  " + inNum + " * " + i + " = " + outNum);				
				}
// for문 사용. 단일 method				
//			} else {
//				for(int j=1; j<=inNum;j++) {
//					outNum = inNum * j;
//					System.out.println("  " + inNum + " * " + j + " = " + outNum);
//				}
//			}
// 다중 method 사용 방식
			} else {
				calPrint(calcOut(inNum));
			}		
		}
		
	}
	
	public static int[] calcOut(int inNum) {
		int[] calNum = new int[inNum];
		for(int i=0; i < calNum.length; i++) {
			calNum[i] = inNum * (i + 1);
		}
		return calNum;
	}
	
	public static void calPrint(int[] printNum) {
		for(int i=0; i < printNum.length; i++) {
			System.out.println("  " + printNum.length + " * " + (i+1) + " = " + printNum[i]);
		}
	}
	
}