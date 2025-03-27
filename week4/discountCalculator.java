package week4;

import java.util.Scanner;

public class discountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 구매 금액: ");
		int price = sc.nextInt();
		
		System.out.printf("원래 가격: %d원\n", price);
		
		int discountRate = 0;
		if (price >= 100000) {
			discountRate = 10;
		} else if (price >= 50000) {
			discountRate = 5;
		}
		
		System.out.printf("할인율: %d%%\n", discountRate);
		
		int discountPrice = price * discountRate / 100;
		
		System.out.printf("최종 가격: %d원\n", price - discountPrice);
		
		sc.close();
	}
}
