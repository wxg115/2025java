package week13;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		// 비프음 출력
		for(int i=0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		}
		
		// *** 출력 작업
		for(int i=0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
