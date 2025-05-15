package week11;

public class LOL extends Game{
	public LOL(String title, String version) {
		// 부모 클래스의 생성자로 초기화
		super(title, version);
	}

	@Override
	public void gameDesc() {
		System.out.println("롤은 세계 최고의 MOBA 게임입니다.");
	}
}