package java_181107;

import java.util.Scanner;

public class Strarray {
	public static void main(String [] args) {
	int[] numarray = new int[4];
	Scanner sc = new Scanner(System.in);
	int sum = 0;
	for(int i=0; i < 4; i++) {
		System.out.println((i+1) + "번째 숫자를 입력하세요 :");
		numarray[i] = sc.nextInt();
		sum += numarray[i];
	
	}
	System.out.println("합계==> " + sum);
	
	}
}
