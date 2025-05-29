package week13;

public class BeepTask implements Runnable{
	// Runnable 인터페이스 구현 메소드
	@Override
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println("Beep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {	}
		}
	}
	
}
