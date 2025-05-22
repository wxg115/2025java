package week12;

import java.util.Scanner;

public class SmartPhoneEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		// 필요한 객체
		SmartPhone phone = new SmartPhone();
		EarPhone ep = null;
		
		System.out.println("=== 스마트폰으로 음악 재생 ===");
		
		while(true) {
			System.out.println("\n이어폰 선택(1.Buds 2.AirPods 3.TonFree 4.종료) >> ");
			menu = sc.nextInt();
			if (menu == 4) 
				break;
			
			if (menu == 1) 
				ep = new Buds();
			else if (menu == 2)
				ep = new AirPods();
			else if (menu == 3)
				ep = new TonFree();
			
			phone.musicOn(ep);
			phone.musicOff(ep);
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
