package week10;

class AirLine {
	// 부모 클래스
		public void takeOff() {
			System.out.println("이륙");
		}
		
		public void fly() {
			System.out.println("일반 비행");
		}
		
		public void land() {
			System.out.println("착륙");
		}
}

public class AirCraft extends AirLine {
	@Override
	public void fly() {
		System.out.println("여객기 비행");
	}
	
	public static void main(String[] args) {
		AirCraft air = new AirCraft();
		air.takeOff();
		air.fly();
		air.land();
	}
}
