package week7;

public class Car {
	//자동차 객체를 만들기 위한 라이브러리용 클래스 => 설계도
	//자동차 객체의 속성 => field(필드)
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자를 선언하지 않으면 기본 생성자가 자동으로 생성됨
	
	//생성자 오버로딩 => 객체 초기화를 다양하게
	Car(){
		//기본 생성자
	}
	
	Car(String model){
//		this.model = model;
//		this.color = "black";
//		this.maxSpeed = 300;
		this(model, "black", 300);
	}
	
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 200;
		this(model, color, 200);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
