package week2;

public class DataType3 {
	public static void main(String[] args) {
		//char 데이터 타입
		//char 타입은 음수가 없음
		
		char cData1 = 'A'; //문자 리터럴을 직접 저장
		char cData2 = 65; //10진수로 저장
		char cData3 = '\u0041'; //16진수로 저장
		System.out.println("cData1: " + cData1);
		System.out.println("cData2: " + cData2);
		System.out.println("cData3: " + cData3);
		
		char cData4 = '가';
		char cData5 = 44032;
		char cData6 = '\uac00';
		System.out.println("cData4: " + cData4);
		System.out.println("cData5: " + cData5);
		System.out.println("cData6: " + cData6);
		
		//char 타입 변수의 유니코드 값을 알고 싶으면 int 변수에 저장 후 확인
		int cData7 = 'B';
		int cData8 = '나';
		int cData9 = '&';
		System.out.println("cData7: " + cData7);
		System.out.println("cData8: " + cData8);
		System.out.println("cData9: " + cData9);
	}
}
