package week5;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산할 단 수: ");
		int scanData = sc.nextInt();
		
		for (int i=1; i <= 9; i++) {
			System.out.println(scanData + " x " + i + " = " + scanData*i);
		}
		
		sc.close();
	}
}
