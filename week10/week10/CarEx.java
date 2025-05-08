package week10;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		// setter() 를 이용해서 값을 지정
		myCar.setCompany("현대");
		myCar.setModel("그랜저");
		myCar.setColor("white");
		myCar.setMaxSpeed(500);
		
		// getter() 메소드를 이용해 값을 조회
		System.out.println(myCar.getCompany());
		System.out.println(myCar.getModel());
		System.out.println(myCar.getColor());
		System.out.println(myCar.getMaxSpeed());
	}
}
