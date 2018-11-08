package java_181106;

import java.util.Scanner;

public class ForExample {
	public static void main(String [] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		int a=0;
		a = scan.nextInt();
		int b = scan.nextInt();
		for(int i=a; i<=b; i++) {
			sum += i;
			if(i == b) {
			System.out.print(i + "=" + sum);
		} else {
			System.out.print(i + "+");
		}
		}
	}
}
