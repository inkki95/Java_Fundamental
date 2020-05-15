package java_20200511;

public class LiteralDemo {
public static void main(String[] args) {
	//byte b1 = 128;
	//바이트 범위를 넘으므로 오버플로우 발생-> 컴파일 에러
	double a1 = 128.24; //10진수
	int a2 = 076; //8진수
	int a3 = 0x123; //16진수
    int a4 = 0b1010; // 2진수
System.out.println(a1);
System.out.println(a2);
System.out.println(a3);
System.out.println(a4);
long l1 = 121231231221332323l;
// long은 숫자뒤에 L 쓰기

float f1 = 123.4f;
// float은 숫자뒤에 f 붙이기 (안하면 더블로 들어감, 플롯이랑 충돌)
System.out.println(f1);

double d1 = 123.56d;
//double은 숫자뒤에 d 쓰기 (***생략가능)

boolean isExisted = false;
// boolean은 true or false

byte b1 = 10;
byte b2 = 20;
//byte b31 = b1+b2;
//한번에 안더해짐    (자료형이 int로 기본인데 byte랑 충돌)
byte b32 = (byte)(b1+b2); //이렇게하거나-------->>>>> 바이트 범위를 넘어버리면 컴파일 오류도 안나고 쓰레기값이 나옴
int b4 = b1+b2; //기본형이 int로 박히기때문
// ***********byte안쓰고 int를 쓰는 이유***************

char c1 = 'd';
String c2 = "apple";
System.out.println(c1);
System.out.println(c2);
System.out.println(2*b4);

//특수기호 1개(33~47), 대문자1(65~90), 나머지 영문숫자8개









}
}
