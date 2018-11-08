package java_181106;

import java.util.Scanner;

public class Floatprint {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int Num = 0;
		System.out.println("정수를 입력하세요.");
		while(true) {
			Num = scan.nextInt();
		if(Num % 2 == 0) {
			System.out.println("짝수입니다 나머지는" + Num%2 + " 이며 몫은" + Num/2);
		} else {
			System.out.println("홀수입니다 나머지는" + Num%2+ " 이며 몫은" + Num/2);
			
		}
		}
	}

}
