package week12;

public class AirPods implements EarPhone{
	public AirPods() {
		System.out.println("Apple AirPods 연결");
	}
	
	@Override
	public void play() {
		System.out.println("Apple AirPods 음악 재생 중");
	}

	@Override
	public void stop() {
		System.out.println("Apple AirPods 음악 중지");
	}
	
}
