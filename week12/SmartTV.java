package week12;

public class SmartTV implements Searchable, RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Smart Tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart Tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
	}
	
}
