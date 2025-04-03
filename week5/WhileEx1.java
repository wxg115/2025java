package week5;

public class WhileEx1 {
	public static void main(String[] args) {
		//1~100까지의 합 구하기
		int num = 1;
		int result = 0;
		
		while (num <= 100) {
			result += num;
			num++;
		}
		System.out.println("1~100의 합: " + result);
	}
}
