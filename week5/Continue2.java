package week5;

public class Continue2 {
	public static void main(String[] args) {
		int result1 = 0;
		for (int i=1; i <= 100; i++) {
			if (i % 3 == 0) {
				continue;
			}
			result1 += i;
		}
		System.out.println(result1);
		
		//검증 프로그램
		//3의 배수만 합산
		int result2 = 0;
		for (int i=1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			}
			result2 += i;
		}
		System.out.println("result1 + result2 = " + (result1 + result2));
	}
}