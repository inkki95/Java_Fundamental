package java_20200519;

public class CallrefValueDemo {
public static void change(int i, int[] j) {
	i=20;
	j[3]=4000;
}
public static void main(String[] args) {
	int i = 10;
	int[] j = {2,3,4,5};

int l = i;
//프리미티브는 복사만함
l=20;

int[] k = j;
//배열은 레퍼런스라 참조로 동기화됨
k[3] = 4000;

change(i,j);
System.out.println(i+","+j[3]);
System.out.println(i+","+k[3]);
j[3]=2000;
System.out.println(i+","+j[3]);
System.out.println(i+","+k[3]);
System.out.println();
System.out.println();

int a=10;
double b=10.0;
System.out.println(a==b);
//primitive == primitive =>값비교

int[] a1 = {1,2,3,4};
int[] b1 = {1,2,3,4};
System.out.println(a1==b1);
a1=b1;
System.out.println(a1==b1);
//reference == reference =>두 ref가 같은 객체를 참조하는지를 판단
// 같은 객체 참조 -> true 아니면 false
}	
}


