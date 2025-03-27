package week4;

public class switch3 {
	public static void main(String[] args) {
		//switch 결과를 변수에 바로 대입
		String grade = "B";
		
		int score1 = 0;
		
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			score1 = 100 - 20;
			break;
		default:
			score1 = 60;
		}
		
		System.out.println("score1: " + score1);
		
		System.out.println();
		
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};
		
		System.out.println("score2: " + score2);
	}
}
