package week7;

public class CarEx2 {
	public static void main(String[] args) {
		//오버로딩된 생성자 이용
		Car car1 = new Car();
		System.out.printf("car1: %s %s %d\n", car1.model, car1.color, car1.maxSpeed);
		
		Car car2 = new Car("그랜저");
		System.out.printf("car2: %s %s %d\n", car2.model, car2.color, car2.maxSpeed);
		
		Car car3 = new Car("소나타", "white");
		System.out.printf("car3: %s %s %d\n", car3.model, car3.color, car3.maxSpeed);
		
		Car car4 = new Car("아반떼", "navy", 250);
		System.out.printf("car4: %s %s %d\n", car4.model, car4.color, car4.maxSpeed);
	}
}
