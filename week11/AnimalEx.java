package week11;

public class AnimalEx {
	public static void main(String[] args) {
		// 추상 클래스는 객체 생성 불가
		// 대신 상속은 가능
		//Animal animal = new Animal();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("=====");
		
		Animal animal = dog;	// 자동 타입 변환
		animal.sound();
		animal = cat;
		animal.sound();
		
		System.out.println("===매개 변수의 다형성===");
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		
		// 자식 클래스에만 정의된 필드, 메소드는 강제 타입 변환을 통해서만 접근이 가능
		if(animal instanceof Dog) {
			System.out.println("Dog 객체로 변환 가능");
			Dog dog = (Dog)animal;
			dog.dogLife();
		}
		else if(animal instanceof Cat) {
			System.out.println("Cat 객체로 변환 가능");
			Cat cat = (Cat)animal;
			cat.catLife();
		}
		
	}
}
