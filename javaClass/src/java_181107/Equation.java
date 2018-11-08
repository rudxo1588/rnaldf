package java_181107;
// 방정식 해 구하기
// 2x + 4y = 10;
public class Equation {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		int sum = 0;
		for (int i = 0; 10 >= i; i++) {
			
			for (int a = 0; 10 >= a; a++) {
				
				sum = (x * i) + (y * a);
				
				if ((x * i) + (y * a) == 10) {
					 
					System.out.println("x " + i + " y " + a + " sum " + sum);
				}
			}
		}
	}

}
