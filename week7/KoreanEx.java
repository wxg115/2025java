package week7;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "250417-3000000", "010-0000-0000");
		System.out.println("국 적: " + k1.nation);
		System.out.println("이 름: " + k1.name);
		System.out.println("주민등록번호: " + k1.ssn);
		System.out.println("전화번호: " + k1.phone);
	}
}
