package Pac_gugudan;

import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		String inString;
		int firstNo, secondNo;
		int result;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("x,b 형태로 원하는 단수 및 숫자를 입력하시요.");
			inString = sc.nextLine();
			String[] splited = inString.split(",");
			firstNo = Integer.parseInt(splited[0]);
			secondNo = Integer.parseInt(splited[1]);
			
			if(firstNo <2 || firstNo > 9) {
				System.out.println("단수 error");
				continue;
			}
			
			if(secondNo < 1 || secondNo > 9) {
				System.out.println("번 수 error");
				continue;
			}
			
			for(int i=2; i<=firstNo; i++) {
				if(i < firstNo) {
					System.out.println("[ " + i + " Dan]");
					for(int j=1; j<=9; j++) {
						result = i * j;
						System.out.println( i + " * " + j + " = " + result);
					}
				} else {
					System.out.println("[ " + i + " Dan]");
					for(int j=1; j<=secondNo; j++) {
						result = i * j;
						System.out.println( i + " * " + j + " = " + result);
					}		
				}
				
				System.out.println();
			}
		}
	}
}
