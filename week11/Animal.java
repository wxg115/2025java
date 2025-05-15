package week11;

// 추상 클래스 -> 객체 생성 불가, 상속 가능
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상화: 반드시 자식 클래스에서 재정의 해야 함
	// 실행문이 없음, 메소드 형태만 선언
	public abstract void sound();
}
