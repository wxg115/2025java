package week12;

public class Buds implements EarPhone{
	public Buds() {
		System.out.println("삼성 Buds 연결");
	}
	
	@Override
	public void play() {
		System.out.println("삼성 Buds 음악 재생 중");
	}

	@Override
	public void stop() {
		System.out.println("삼성 Buds 음악 중지");
	}
	
}
