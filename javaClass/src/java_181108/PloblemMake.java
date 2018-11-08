package java_181108;

import java.util.Scanner;

// 문제 맞추기
public class PloblemMake {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		int count= 0;
		String[][] strArr = { 
				{"chair", "의자"},
				{"desk", "책상"},
				{"water", "물"},
				{"moniter", "화면"},
				{"mouse", "마우스"}
		};
		for(int i =0; i<strArr.length; i++) {  // 배열의 길이만큼 반복
			System.out.println("문제"+ (i+1) + ". " + strArr[i][0] + "뜻은 무엇인가요?");
			answer = scan.nextLine();
			
			
			if(strArr[i][1].equals(answer)) { 
				// 배열의 i번째 행과 열을 비교
				// String 타입은 equals 로 비교
				System.out.println("정답입니다.");
				count++; // 맞은개수 카운트업
			} else {
				System.out.println("틀렸습니다.\n정답은 " + strArr[i][1]); 
				
			}
			
			
		}
		System.out.println("총" + count + "개를 맞췄습니다.\n정답률은 " + (double)count/strArr.length*100 + "% 입니다.");
	}
	

}
