package week11;

public class ChildEx {
	public static void main(String[] args) {
		Child child1 = new Child();
		
		child1.method1();
		// 부모로부터 상속받은 메소드라도 자식 클래스에서 재정의되면 재정의 된 메소드가 호출됨
		child1.method2();
		child1.method3();
		child1.field1 = "1";
		child1.field2 = "2";
		
		System.out.println("==자동 타입 변환==");
		// 클래스의 자동 타입 변환
		// 부모 클래스 변수 <- 자식 객체를 대입
		Parent parent1 = child1;
		
		parent1.method1();
		// 자동 타입 변환이 적용된 경우 부모 클래스 변수라도 자식 클래스에서 재정의된 메소드 호출
		parent1.method2();
		// 자식 객체가 부모 클래스 변수에 자동 타입 변환이 되어도
		// 부모 클래스 변수는 자식 클래스에만 정의된 메소드는 호출 불가능
		// 부모 클래스 변수는 부모 클래스에 정의된 것만 접근 가능
		//parent1.method3();
		
		parent1.field1 = "1";
		//parent1.field2 = "2";
		
		System.out.println("==강제 타입 변환==");
		// 강제 타입 변환(casting)
		// 다시 자식 클래스에만 정의된 필드나 메소드에 접근하려면 강제 타입 변환이 필요
		Child child2 = (Child)parent1;
		
		child2.method3();
		child2.field2 = "2";
		
		// 순수 부모 객체를 Casting 하면 실행 시 오류 발생
		Parent parent2 = new Parent();
		Child child3 = (Child)parent2;
		child3.method3();
	}
}
