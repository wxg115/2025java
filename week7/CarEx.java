package week7;

public class CarEx {
	public static void main(String[] args) {
		//실행 클래스
		//객체 생성
		Car myCar = new Car();
		
		//필드 값 출력
		//필드 값에 접근할 때는 반드시 객체 변수명으로 접근
		System.out.println("== myCar ==");
		System.out.println("제작 회사: " + myCar.company);
		System.out.println("모 델: " + myCar.model);
		System.out.println("색 상: " + myCar.color);
		System.out.println("최고 속도: " + myCar.maxSpeed);
		System.out.println("현재 속도: " + myCar.speed);
		
		//필드 값 변경
		//외부 클래스에서는 반드시 필드 값을 객체 변수명으로 접근
		myCar.speed = 100;
		System.out.println("현재 속도: " + myCar.speed);
		
		Car yourCar = new Car();
		System.out.println("== yourCar ==");
		System.out.println("제작 회사: " + yourCar.company);
		System.out.println("모 델: " + yourCar.model);
		System.out.println("색 상: " + yourCar.color);
		System.out.println("최고 속도: " + yourCar.maxSpeed);
		System.out.println("현재 속도: " + yourCar.speed);
		
		//매개변수를 이용해서 초기화하는 생성자를 이용
		Car myCar2 = new Car("그랜저", "white", 350);
		System.out.println("== myCar2 ==");
		System.out.println("제작 회사: " + myCar2.company);
		System.out.println("모 델: " + myCar2.model);
		System.out.println("색 상: " + myCar2.color);
		System.out.println("최고 속도: " + myCar2.maxSpeed);
		System.out.println("현재 속도: " + myCar2.speed);
		
		Car yourCar2 = new Car("소나타", "black", 200);
		System.out.println("== yourCar2 ==");
		System.out.println("제작 회사: " + yourCar2.company);
		System.out.println("모 델: " + yourCar2.model);
		System.out.println("색 상: " + yourCar2.color);
		System.out.println("최고 속도: " + yourCar2.maxSpeed);
		System.out.println("현재 속도: " + yourCar2.speed);
	}
}
