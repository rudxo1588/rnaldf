package java_181106;
// 1+(-2)+3... 더해서 100이상이 되면 종료.
public class Sum100 {
	public static void main(String [] args) {
		int sum = 0;
		
		for(int i = 0; i<300; i++) {
			if(i % 2 == 0) {
				sum -= i;
			} else if(i % 2 != 0) {
				sum += i;
			}
			if(sum >= 100) {
				System.out.println(i + "번째 까지하면 합이" + sum);
				break;
			}
		}
		
		int sum1 = 0;
		int s = 1;
		int num = 0;
		for(int i=1; true; i++) { // 조건식을 true로 주면 무한반복 사용가능. 
			num = i * s; // 반복변수 i가 1부터 무한반복으로 증가하면서 
			sum1 = sum1 + num;
			s = -s; 
//			System.out.println(num); // 확인용 출력문.
			if(sum1>=100) { // sum1 값이 100이상일시 
				break;      // break
			}
		}
		System.out.println("num" + num);
		System.out.println("sum" + sum1);
		
	}

}
