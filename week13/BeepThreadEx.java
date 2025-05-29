package week13;

public class BeepThreadEx {
	public static void main(String[] args) throws InterruptedException {
		// main 메소드 => main 스레드
		
		BeepThread thread = new BeepThread();
		thread.start();
		
		// main 작업
		for(int i=0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
