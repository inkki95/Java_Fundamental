package java_20200520.step1;

//나노세컨드로 경과시간 알려주는 앱
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	long startNanoTime;
	long endNanoTime;

	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000;
	}

	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / 1_000_000_000;
	}

	public static void main(String[] args) {

		FootNanoStopWatch f1 = new FootNanoStopWatch();
		f1.startNanoTime = System.nanoTime();

		double elapsedTime = f1.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
