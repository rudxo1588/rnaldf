package java_181107;
// up&down
import java.util.Scanner;

public class NumberCheck {
	public static void main(String [] args) { 
		int num = (int)(Math.random()*100)+1;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("1과 100사이에 값을 입력하세요 :");
		int Check = scan.nextInt();
		if(Check < num) {
			System.out.println("더 큰 수를 입력하세요.");
			count++;
		} else if(Check > num) {
			System.out.println("더 작은 수를 입력하세요.");
			count++;
		} else if(Check == num) {
			count++;
			System.out.println("맞췄습니다.");
			System.out.println("시도횟수는 " + count + "번입니다.");
			break;
		} 
		
		}

}
}
