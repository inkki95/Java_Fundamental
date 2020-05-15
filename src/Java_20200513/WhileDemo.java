package Java_20200513;

public class WhileDemo {
public static void main(String[] args) {
	int sum = 0;
	int  i = 0;
while(i<=10) {
	sum += i;
	i++;
}
System.out.printf("%d\n",sum);

int j=2;
int k=1;
while(j<=9) {
	k=1;
	while(k<=9) {
		System.out.printf("%dX%d=%d\t",j,k,j*k);
		k++;
	}
	j++;
	System.out.println("");
	
}


}

}
