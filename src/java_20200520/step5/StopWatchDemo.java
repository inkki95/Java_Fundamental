package java_20200520.step5;

public class StopWatchDemo {
	
	public static void run(StopMilliWatch s1) {
		s1.execute();
		System.out.println();
	}
	
	public static void run(StopNanoWatch s1) {
		s1.execute();
		System.out.println();
	}
	
	public static void run(StopMicroWatch s1) {
		s1.execute();
		System.out.println();
	}
	
	public static void main(String[] args) {
//		StopNanoWatch s1 = new StopNanoWatch();
		StopMilliWatch s1 = new StopMilliWatch();
		run(s1);
		StopMicroWatch s2 = new StopMicroWatch();
		run(s2);
		StopNanoWatch s3 = new StopNanoWatch();
		run(s3);
	
	
	}
}