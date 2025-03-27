package week4;

public class ifElseError {
	public static void main (String[] args) {
		int score = 85;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
			System.out.println("90 이상");
		} else if (score >= 80) {
			grade = 'B';
			System.out.println("80 이상");
		} else if (score >= 70) {
			grade = 'C';
			System.out.println("70 이상");
		} else if (score >= 60) {
			grade = 'D';
			System.out.println("60 이상");
		} else {
			grade = 'F';
		}
		
		System.out.println(grade);
	}
}
