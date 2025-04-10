package week6;

public class ArrayEx1 {
	public static void main(String[] args) {
		//값 목록으로 배열을 생성하는 방법
		int[] score = {70, 80, 90, 65, 95};
		String[] pNames = {"java", "c", "python", "c#"};
		double[] dArray1;
		dArray1 = new double[] {0.1, 0.2, 0.3, 0.4};
		
		//new 연산자를 이용해서 배열 생성
		//자동으로 데이터 기본값으로 초기화
		int[] intArray = new int[5];
		System.out.println("intArray[0] = " + intArray[0]);
		
		double[] dArray2 = new double[5];
		System.out.println("dArray2[0] = " + dArray2[0]);
		
		String[] sArray = new String[5];
		System.out.println("sArray[0] = " + sArray[0]);
	}
}
