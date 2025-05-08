package week10;

public class SonicAirPlane extends AirPlane {
	// 비행 모드에 따라 비행 방법이 달라지는 경우
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	private int soundSpeed;
	private int maxSpeed;
	
	// 재정의
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("음속 비행");
		}
		else {
			super.fly();
		}
	}
	
	public int getSoundSpeed() {
		return soundSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
}
