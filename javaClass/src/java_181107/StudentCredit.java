package java_181107;

import java.util.Scanner;

public class StudentCredit {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int grade = 1;
		boolean a = true;
		System.out.println("60점 이상이면 합격입니다.");
		System.out.println("4학년은 70점 이상이 합격입니다.");
		while(a) {
			System.out.println("학년 > ");
			grade = scan.nextInt();
			if(grade > 4 || grade < 1) {
				
				System.out.println("학생이 아닙니다.");
				a = false;
			} else {
			
			System.out.println("점수 입력 > ");
			num = scan.nextInt();
			if(num >= 70 && grade == 4) {
				System.out.println("합격");
				
			} else if(num >=60 && grade < 4){
				System.out.println("합격");
			} else {
			    System.out.println("불합격.");
			}
				
			} 
		}
	}

}
