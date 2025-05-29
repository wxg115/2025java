package week13;

public class RamenEx {
	public static void main(String[] args) {
		// 작업 스레드 생성 및 실행
		RamenCooker guest1 = new RamenCooker("김");
		guest1.start();
		
		RamenCooker guest2 = new RamenCooker("이");
		guest2.start();
		
		RamenCooker guest3 = new RamenCooker("박");
		guest3.start();
	}
}
