package week6;

public class ReferenceString {
	public static void main(String[] args) {
		String ssn = "0501153000000";
		
		//문자열은 0번부터 인덱스를 가짐
		//특정 문자 추출
		char gender = ssn.charAt(6);
		switch (gender) {
		case '1', '3' -> System.out.println("남자");
		case '2', '4' -> System.out.println("여자");
		}
		
		//문자열의 길이
		int length = ssn.length();
		if (length == 13) {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}
		
		//문자열 대체
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "java");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//문자열 잘라내기
		//0번부터 5번까지 가져오기 위해서 마지막 인덱스 +1
		String firstNumber = ssn.substring(0, 6);
		System.out.println(firstNumber);
		
		String secondNumber = ssn.substring(6);
		System.out.println(secondNumber);
		
		//문자열 찾기
		// String oldStr = "자바 프로그래밍";
		//indexOf: 특정 단어가 문자열에서 시작되는 인덱스 값을 반환
		int index = oldStr.indexOf("프로그래밍");
		
		//찾고자 하는 단어가 문자열 안에 없는 경우에는 -1을 반환함
		if (index == -1) {
			System.out.println("프로그래밍 단어가 포함되어 있지 않음");
		} else {
			System.out.println(index + "번 인덱스에 프로그래밍 단어가 있음");
		}
		
		//문자열 포함 여부를 확인할 때는 Contains()를 사용
		//true || false 로 반환됨
		boolean result = oldStr.contains("java");
		if (result) {
			System.out.println("oldStr 안에 java 문자열이 포함됨");
		} else {
			System.out.println("oldStr 안에 java 문자열이 포함되지 않음");
		}
		
		//split()을 사용하여 문자열 분리
		String board = "1,자바학습,참조타입 String 클래스,홍길동";
		String[] tokens = board.split(",");
		for (int i=0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		//향상된 for 문 사용 
		for (String i : tokens) {
			System.out.println(i);
		}
	}
}
