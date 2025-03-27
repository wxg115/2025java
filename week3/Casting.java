package week2;

public class Casting {
	public static void main(String[] args) {
		//강제 타입 변환
		int iData = 65;
		char cData = (char)iData;
		System.out.println(cData);
		
		long lData = 500;
		iData = (int)lData;
		System.out.println(iData);
		
		double dData = 3.14;
		iData = (int)dData;
		System.out.println(iData);
		
		//casting 하기 전에 데이터 손실 여부 확인
		int iValue = 128;
		byte bValue = (byte)iValue;
		System.out.println(bValue);
		
		if(iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE) {
			bValue = (byte)iValue; //casting 가능 범위
		} else {
			System.out.println("casting 범위를 벗어납니다.");
		}
	}
}
