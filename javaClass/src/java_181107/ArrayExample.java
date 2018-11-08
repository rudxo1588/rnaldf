package java_181107;

import java.util.Scanner;

// 가장 큰수 찾기.
public class ArrayExample {
	public static void main(String[] args) {
//		int max = 0;
//		int num[] = new int[5];
//		Scanner sc = new Scanner(System.in);
//		max = num[0];
//		System.out.println("양수 5개를 입력하세요.");
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//			if (max < num[i]) {
//				max = num[i];
//			}
//
//		}
//		System.out.println("가장 큰 수는 " + max + "입니다..");
//
//	}
//
//}
		// 내림차순 
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    int temp;
    System.out.println("양수 5개를 입력하세요.");
    for(int i=0; i<arr.length; i++) { // 5번입력
    	arr[i] = sc.nextInt();
    }
    for(int j=0; j<arr.length; j++) {       // 위치 정렬
    	for(int k=j+1; k<arr.length; k++) { // 위치 정렬
    		if(arr[j] < arr[k]) { 
    			temp = arr[j];
    		    arr[j] = arr[k];
    			arr[k] = temp; 
    			
    		}
    		
    	}
    }
    for(int n=0; n<arr.length; n++) { // 출력하기 위한 포문
    	System.out.print(arr[n] + " ");
    }
	}
}