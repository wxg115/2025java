package week11;

public abstract class Game {
	private String title;
	private String version;
	
	// private 필드 초기화
	public Game(String title, String version) {
		this.title = title;
		this.version = version;
	}
	
	public void start() {
		System.out.println("제목: " + title);
		System.out.println("버전: " + version);
		System.out.println(title + " 게임을 시작합니다.");
	}
	
	public abstract void gameDesc();
}
