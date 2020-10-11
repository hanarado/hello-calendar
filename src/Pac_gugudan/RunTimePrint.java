package Pac_gugudan;

// method를 통한 run time check start, end 및 runtime print

public class RunTimePrint {
	
	public static long startTime, endTime;
	
	public static void runTimeStart() {
		startTime = System.currentTimeMillis();
	}
	
	public static void runTimeEnd() {
		endTime = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("=====================================================");
		System.out.println("startTime = " + startTime);
		System.out.println("endTime   = " + endTime);
		System.out.println("Run Time : "  + ((float)(endTime-startTime)) / 1000 + " sec");
		System.out.println("=====================================================");
		System.out.println();
	}
	
}

