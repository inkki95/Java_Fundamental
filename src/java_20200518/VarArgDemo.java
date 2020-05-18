package java_20200518;

import java.util.Iterator;

public class VarArgDemo {

	public void print(int... a) {
		int length = a.length;
		
		for(int value :a) {
			System.out.printf("%d",value);
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo();
		
		v1.print(1);
		v1.print(1,20);
		v1.print(1,20,20);
		v1.print(1,20,30);
	}
	
	
}
