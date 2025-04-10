package week6;

public class ArrayEx2 {
	public static void main(String[] args) {
		//길이가 10인 정수 타입의 배열을 선언
		int[] score = new int[10];
		
		//누적되는 변수는 반드시 초기화
		int sum = 0;
		
		System.out.println("== 랜덤 생성된 점수 배열 ==");
		//각 배열에 랜덤 생성 점수를 저장(0~99)
		for (int i=0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 100);
			sum += score[i];
			System.out.printf("score[%d] : %d\n", i, score[i]);	
		}
		double average = (double)sum / score.length;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
	}
}
