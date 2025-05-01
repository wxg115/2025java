package week8;

public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", 70, 80, 50);
		
		System.out.printf("%s : 총점 %d점, 평균 %.1f점", stu.name, stu.getTotal(), stu.getAve());
	}
}
