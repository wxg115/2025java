package week5;

public class sum {
	public static void main(String[] args) {
		//for 문: 횟수 반복
		//1~100까지의 합 구하기
		//누적 변수는 반드시 초기화가 필요
		
		int result = 0;
		for (int i=1; i <= 100; i++) {
			result += i;
		}
		
		System.out.println("1~100까지의 합: " + result);
	}
}
