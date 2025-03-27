package week2;

public class PersonInfo {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 21;
		double height = 170.1;
		char gender = 'M';
		boolean isStudent = true;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.printf("키: %.1fcm\n", height);
		System.out.printf("성별: %c\n", gender);
		System.out.printf("학생 여부: %b\n", isStudent);
	}
}
