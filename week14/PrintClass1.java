package week14;

public class PrintClass1 {
	// 데이터를 입력받아 출력하는 메소드
	// 데이터 타입이 다 다른 경우 => 메소드 오버로딩
	public void printValue(int value) {
		System.out.println("value: " + value);
	}
	
	public void printValue(String value) {
		System.out.println("value: " + value);
	}
	
	public void printValue(boolean value) {
		System.out.println("value: " + value);
	}
}
