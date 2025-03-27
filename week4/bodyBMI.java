package week4;

import java.util.Scanner;

public class bodyBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("키(cm)를 입력하세요: ");
		int height = sc.nextInt();
		
		System.out.print("몸무게(kg)을 입력하세요: ");
		int weight = sc.nextInt();
		
		System.out.println();
		System.out.println(name + "님의 키는 " + height + "cm이고 몸무게는 " + weight + "kg입니다.");
		
		double meterHeight = (double)height / 100;
		double bmi = weight / (meterHeight * meterHeight);
		
		System.out.printf("BMI 지수는 %.2f이고 ", bmi);
		
		if (bmi >= 18.5 && bmi <= 22.9) {
			System.out.println("정상입니다.");
		} else if (bmi >= 23 && bmi <= 24.9) {
			System.out.println("과체중입니다.");
		} else if (bmi >= 25 && bmi <= 29.9) {
			System.out.println("비만입니다.");
		} else if (bmi >= 30) {
			System.out.println("고도비만입니다.");
		} else {
			System.out.println("저체중입니다.");
		}
		
		sc.close();
	}
}
