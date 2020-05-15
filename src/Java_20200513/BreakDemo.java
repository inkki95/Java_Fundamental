package Java_20200513;
public class BreakDemo {
public static void main(String[] args){
	int sum = 0;
	for (int i = 1; i <= 10; i++) {
		sum += i;
		if(i==5) break;
	}
	System.out.printf("1부터 5까지의 합은 %d 입니다%n",sum);

	
inki:for (int i = 2; i <= 9; i++) {
	for (int j = 1; j <= 9; j++) {
		System.out.printf("%dX%d=%d\t",i,j,i*j);
	if(i==5 && j==5) break inki;
	}
//	if(i==5) break;
// ★★★★★★★★레이블 브레이크문, 가장 밖의 반복문으로 나감
//	브레이크는 한겹만 나감
	
	System.out.printf("\n");

}
	



}
}
