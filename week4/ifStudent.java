package week4;

import java.util.Scanner;

public class ifStudent {
	public static void main (String[] args) {
		//외부로부터 데이터 입력 => Scanner 클래스 이용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 연도 입력: ");
		int year = sc.nextInt();		
		System.out.println(year);
		
		int age = 2025 - year;
		if (age >= 20 && age <= 26) {
			System.out.println("대학생입니다");
		} else if (age >= 17 && age <= 19) {
			System.out.println("고등학생입니다.");
		} else if (age >= 14 && age <= 16) {
			System.out.println("중학생입니다.");
		} else if (age >= 8 && age <= 13) {
			System.out.println("초등학생입니다.");
		} else {
			System.out.println("학생이 아닙니다.");
		}
		
		sc.close();
	}
}
