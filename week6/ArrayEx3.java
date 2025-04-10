package week6;

import java.util.Arrays;

public class ArrayEx3 {
	public static void main(String[] args) {
		//2차원 배열은 1차원 배열을 이용해서 구현
		int[][] math = new int[2][3];
		//행의 반복은 바깥 쪽 for 문을 이용함
		//열의 반복은 안 쪽 for 문을 이용함
		for (int i=0; i < math.length; i++) {
			//배열 이름의 length = 행의 크기
			for (int j=0; j < math[i].length; j++) {
				//math[i].length = i 번째 행의 길이
				System.out.printf("math[%d][%d] = %d\n", i, j, math[i][j]);
			}
		}
		
		System.out.println();
		//모든 행은 동일한 열로 구성되지 않을 수도 있음
		int[][] eng = new int[2][];
		eng[0] = new int[2];
		eng[1] = new int[3];
		for (int i=0; i < eng.length; i++) {
			for (int j=0; j < eng[i].length; j++) {
				System.out.printf("eng[%d][%d] = %d\n", i, j, eng[i][j]);
			}
		}
		
		System.out.println();
		//배열의 복사
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[7];
		
		//1. for 문을 이용
		for (int i=0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		//2. System.arraycopy() 이용
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		//3. Array 클래스 이용
		arr2 = Arrays.copyOf(arr1, arr1.length);
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
