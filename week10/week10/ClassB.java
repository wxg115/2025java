package week10;
public class ClassB {
	// public 은 모든 클래스에서 호풀 가능
	ClassA c1 = new ClassA(true);
	
	// default 는 같은 패키지에서는 호출 가능
	ClassA c2 = new ClassA(10);
	
	// private 는 자기 클래스 안에서만 사용
	//ClassA c3 = new ClassA("asd");
}
