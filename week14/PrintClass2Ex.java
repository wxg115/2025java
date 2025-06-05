package week14;

public class PrintClass2Ex {
	public static void main(String[] args) {
		// 제네릭 타입 파라미터 => 주체적인 클래스 타입으로 지정
		PrintClass2<Integer> pc2 = new PrintClass2<Integer>();
		pc2.printValue(100);
		
		PrintClass2<String> pc3 = new PrintClass2<String>();
		pc3.printValue("ABC");
		
		PrintClass2<Boolean> pc4 = new PrintClass2<Boolean>();
		pc4.printValue(true);
	}
}
