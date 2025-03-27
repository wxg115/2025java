package week4;

public class ifNested {
	public static void main (String[] args) {
		//0~100 사이의 정수
		int score = (int)(Math.random() * 100);
		String grade;
		System.out.println("점수 : " + score);
		
		if (score >= 90) {
			if (score > 95) {
				grade = "A+";
			} else if (score > 93) {
				grade = "A";
			} else {
				grade = "A-";
			}
		} else if (score >= 80) {
			if (score > 85) {
				grade = "B+";
			} else if (score > 83) {
				grade = "B";
			} else {
				grade = "B-";
			}
		} else {
			grade = "C";
		}
		
		System.out.println("등급 :" + grade);
	}
}

