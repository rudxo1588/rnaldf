package java_181107;
// 은행 입출금 만들기.
import java.util.Scanner;

public class Bank {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int deposit = 0;
		int withdraw = 0;
		int  balance = 0;
		int choice = 0;
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			choice = scan.nextInt();
			if(choice == 1) {
				System.out.println("예금액> ");
				deposit = scan.nextInt();
				System.out.println("예금이 완료되었습니다.");
				
				balance += deposit;
				System.out.println("현재 잔고는>\n" + balance + "입니다.");
				
			}else if(choice == 2) {
				System.out.println("출금액> ");
				withdraw = scan.nextInt();
				if(balance < withdraw) {
					System.out.println("잔고가 부족합니다\n 현재 잔고는> " + balance + "입니다.");
				
				} else {
					balance -= withdraw;
				System.out.println("출금이 완료되었습니다.");
				System.out.println("현재 잔고는>\n" + balance + "입니다.");
				}
				
			}else if(choice == 3) {
				System.out.println("현재 잔고는>" + balance + "입니다.");
			}else if(choice == 4) {
				System.out.println("프로그렘을 종료합니다 ");
				System.out.println("이용해 주셔서 감사합니다.");
				break;
			}else {
				System.out.println("다시 선택해주세요(1~4번)");
			}
			
		}
	
	}

}
