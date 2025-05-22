package week12;

public class Audio implements RemoteControl {
	private int volume;
	private int memoryVolume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VALUE) {
			volume = MAX_VALUE;
		}
		else if (volume < MIN_VALUE) {
			volume = MIN_VALUE;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio의 볼륨 : " + volume);
	}
	
	// 일반적으로 무음 처리할 때 현재 볼륨을 저장
	// 무음을 해제할 때 기존 볼륨으로 복원
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("Audio 무음 처리");
			this.memoryVolume = this.volume;
			setVolume(MIN_VALUE);
		} else {
			System.out.println("Audio 무음 해제");
			setVolume(memoryVolume);
		}
	}
}
