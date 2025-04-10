package week6;

public class Referance1 {
	public static void main(String[] args) {
		//기본 데이터 타입 변수는 스택 영역에 값과 같이 저장됨
		int iValue1 = 100;
		int iValue2 = 100;
		System.out.println("iValue1 == iValue2: " + (iValue1 == iValue2 ? true : false));
		
		//참조 타입 변수는 스택 영역에 저장됨
		//해당 객체의 값은 힙 영역에 저장됨
		//객체 주소가 스택에 있는 변수에 저장됨
		//문자열 리터럴은 값이 동일할 경우 같은 주소는 공유함
		//String은 가장 대표적인 클래스 타입
		String sValue1 = "Java";
		String sValue2 = "Java";
		System.out.println("sValue1 == sValue2: " + (sValue1 == sValue2 ? true : false));
		
		//new 연산자를 사용하여 객체 생성 시 다른 주소를 참조함
		String sValue3 = new String("Java");
		String sValue4 = new String("Java");
		System.out.println("sValue3 == sValue4: " + (sValue3 == sValue4 ? true : false));
		
		//참조 변수가 null 값을 가지면 해당 객체는 힙 영역에 생성되지 않음
		String sValue5 = null; //nullPointerException 주의
		// System.out.println("sValue5.length: " + sValue5.lenght());
		sValue5 = "Java";
		System.out.println("sValue1 == sValue5: " + (sValue1 == sValue5 ? true : false));
		
		//String 객체가 동일한 문자열을 가지고 있는지 비교할 경우 반드시 equals() 메소드를 사용해야 함
		if (sValue3.equals(sValue4)) {
			System.out.println("sValue3 == sValue4: true");
		} else {
			System.out.println("sValue3 == sValue4: false");
		}
	}
}
