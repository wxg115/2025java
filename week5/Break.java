package week5;

public class Break {
	public static void main(String[] args) {
		while (true) {
			int randInt = (int)(Math.random() * 10);
			System.out.println("랜덤 숫자: " + randInt);
			if (randInt == 7) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
