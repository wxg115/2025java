package week12;

public class TonFree implements EarPhone{
	public TonFree() {
		System.out.println("LG TonFree 연결");
	}
	
	@Override
	public void play() {
		System.out.println("LG TonFree 음악 재생 중");
	}

	@Override
	public void stop() {
		System.out.println("LG TonFree 음악 중지");
	}
	
}
