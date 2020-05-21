package java_20200520.step1;

public class FootStopWatch {
public static void main(String[] args) {
	
long startTime = System.currentTimeMillis();
// 1970년 1월 1일부터 지금까지 시간을 미리 세컨드로 반환
	for (long i = 0; i < 13000000000l; i++) {
		
	}
	long endTime = System.currentTimeMillis();
	
	double elapsedTime =  (double)(endTime - startTime)/1000;
	System.out.printf("경과시간 : %.3f",elapsedTime);
}
}
