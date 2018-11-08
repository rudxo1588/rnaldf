package java_181108;

import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int stud[] = null;
		int choice = 0;
		double avg = 0;
		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("학생수> ");
				stud = new int[scan.nextInt()];
			} else if (choice == 2) {
				for (int i = 0; i < stud.length; i++) {
					System.out.println((i + 1) + ".번 째 학생 점수 : ");
					stud[i] = scan.nextInt();

				}

			} else if (choice == 3) {

				for (int i = 0; i < stud.length; i++) {
					System.out.println((i + 1) + "번 째 학생 점수 : " + stud[i]);
				}

			} else if (choice == 4) {
				for (int i = 0; i < stud.length; i++) {
					sum += stud[i];
					avg = sum / stud.length;

				}
				System.out.println("분석 >");
				System.out.println("반 총점 : " + sum + "반 평균 : " + avg);
			} else if (choice == 5) {
				System.out.println("종료합니.");
				scan.close();
				break; 
			}
		}
	}
}
