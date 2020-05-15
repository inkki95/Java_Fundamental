package java_20200514;

public class HomeWork {
public static void main(String[] args) {
	
	int ss = 0;
	asd:for (int i = 1; i <= 100; i++) {
		for (int j = 2; j <= i-1; j++) {
			ss= i%(j);
			if(ss==0) {
				continue asd;
			}
				
			
		}
		System.out.printf("%d\n", i);
	}
}
}
