//main method 없음. 실행용 method만 존재
//main method가 있는 별도 class에서 호출됨.

package Pac_gugudan;

public class GugudanCalc {
	public static int[] calcOut(int inNum) {
		int[] calNum = new int[inNum];
		for (int i = 0; i < calNum.length; i++) {
			calNum[i] = inNum * (i + 1);
		}
		return calNum;
	}

	public static void calPrint(int[] printNum) {
		for (int i = 0; i < printNum.length; i++) {
			System.out.println("  " + printNum.length + " * " + (i + 1) + " = " + printNum[i]);
		}
	}
}