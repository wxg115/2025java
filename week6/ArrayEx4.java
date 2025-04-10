package week6;

import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String[] args) {
		String[] studentList = {"김", "이", "박", "전", "고"};
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. >> ");
		String inputName = sc.next();
		boolean found = false;
		
		for (int i=0; i < studentList.length; i++) {
			if (studentList[i].equals(inputName)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(inputName + " 학생이 명단에 있음");
		} else {
			System.out.println(inputName + " 학생이 명단에 없음");
		}
		
		sc.close();
	}
}
