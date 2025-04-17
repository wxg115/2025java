package week7;

public class PetEx {
	public static void main(String[] args) {
		Pet pet1 = new Pet("바둑이", "강아지");
		
		System.out.println("< 애완동물 정보 >");
		System.out.println("이름: " + pet1.name);
		System.out.println("종류: " + pet1.species);
		System.out.println("나이: " + pet1.age + "살");
		System.out.println("색상: " + pet1.color);
		
		Pet pet2 = new Pet("초코", "고양이", 2, "흰색");
		
		System.out.println("< 애완동물 정보 >");
		System.out.println("이름: " + pet2.name);
		System.out.println("종류: " + pet2.species);
		System.out.println("나이: " + pet2.age + "살");
		System.out.println("색상: " + pet2.color);
	}
}
