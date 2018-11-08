package java_181108;

public class ArrayExample {
	public static void main(String [] args) {
		int[][] score = { 
				{2,3},  // 1행
				{4,4},  // 2행
				{3,3},  // 3행
				{1,1}   // 4행
		}; //4행 2열의 배열.
		int sum = 0;
		double avg = 0;
		
		  for(int i=0; i<score.length; i++){
			   for(int j=0; j<score[i].length; j++){
			    sum += score[i][j]; // 1열과 2열의 합은 sum
			    
			
		
	}

}
		  avg = (double)sum/(score.length*score[0].length); // score의 길이는 4, score[0]의 길이는 2이므로 4*2는 8
		  System.out.printf("4년동안의 총점은 : %d\n4년동안의 평균은 : %.1f", sum,avg);
	}
}
