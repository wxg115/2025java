package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("점수 입력 >> ");
			int inputScore = sc.nextInt();
			char grade;
			if (inputScore < 0) {
				System.out.println("프로그램 종료");
				break;
			}
			if (inputScore >= 90) {
				grade = 'A';
			} else if (inputScore >= 80) {
				grade = 'B';
			} else if (inputScore >= 70) {
				grade = 'C';
			} else if (inputScore >= 60) {
				grade = 'D';
			} else {
				grade = 'F';			
			}
			System.out.println("SCORE\t GRADE");
			System.out.println("==============");
			System.out.println(inputScore + "\t " + grade);
		}
	}
}
