package java_181106;

import java.util.Scanner;

public class CatingExample {
	
	public static void main(String [] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		// int 변수를 char 변수에 저장.(char변수가 int변수보다 작기에 강제타입변환)
		char charValue1 = 100;
		int intValue1 = charValue;
		// char 변수를 int 변수에 저장.
		double doubleValue1 = 1.1;
		int intValue2 = (int)doubleValue1;
		// double 변수를 int에 저장.(double변수가 int 변수보다 크기에 자동변환x)
		int intValue3 = 3;
		double doubleValue2 = intValue3;
		System.out.println(charValue);
		System.out.println(intValue1);
		System.out.println(intValue2);
		System.out.println(doubleValue2);
		System.out.println("-------------------------------------------");
		// 대입연산
	    int a=3; int b = 3; int c=3;
	 
	 a += 3;
	 b *= 3;
	 c %= 2;
	 System.out.println("a=" + a + ", b=" + b + ", c=" + c);
	 
	 int d=3;
	 
	 a = d++; // 후치연산으로 d값이 a에 대입이 된후 ++가 됨
	 System.out.println("a=" + a +", d=" + d);
	 a = ++d; // 전치연산으로 d값이 ++가 된후에 a에 값을 대입.
	 System.out.println("a=" + a + ", d="+ d);
	 a = d--; 
	 System.out.println("a=" + a + ", d=" + d);
	 a = --d;
	 System.out.println("a=" + a + ", d=" + d);
	 System.out.println("-------------------------------------------");
	  // for문
	 while(true) { // else값이 나오기전까지 계속해서 반복해줌.
	 int gender=0;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("성별을 구분하겠습니다.");
	 System.out.println("주민번호 뒷자리 앞자리를 입력해 주십시오.");
//	 gender = scan.nextInt();
	 
	 if(gender == 1 || gender == 3) {
		 System.out.println("남자입니다.");
		 
	 } else if(gender == 2 || gender == 4) {
		 System.out.println("여자입니다.");
	 } else {
		System.out.println("사람이 아닙니다.");
		break;
	 }
	 }	 
	 System.out.println("-------------------------------------------");
	 // 1부터 100까지의 합.
	 int sum=0;
	 int i;
	 for(i = 1; i <=100; i++) {
		 
		 sum += i;
		 
	 }
	 System.out.println("sum = " + sum);
	 System.out.println("i = " + i);
	 System.out.println("-------------------------------------------");
	 // 구구단.
	 for(int x=2; x<=9; x++) {
		 for(int y=1; y<=9; y++) 
			 System.out.print(x + "*" + y + "=" + x*y+ "\t"); // 하나씩 탭으로 뛰기.
			 System.out.println("");
			 
		 
	 }
	 System.out.println("-------------------------------------------");
	
	 // 문제풀이
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
	 int sum1 = 0;
	 int cnt= 0;
	 boolean e = true;
	while(e) {
		
		int Num = scan.nextInt();
		if(Num != 0) {
		sum1 += Num;
		cnt++;
		
		} else {
			
			double avg = sum1/cnt;
			System.out.println("수의 개수는" + cnt +"개이며 평균은" + avg + "입니다." );
			e = false;
		}
		
	} 

	 } 
}