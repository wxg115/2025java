package week5;

public class forStar {
	public static void main(String[] args) {
		//랜덤 숫자 생성: 1~10사이의 정수
		int randInt = (int)Math.random() * 10 + 1;
		System.out.println("랜덤 숫자: " + randInt);
		
		for (int i=1; i <= randInt; i++) {
			System.out.print("★");
		}
	}
}
