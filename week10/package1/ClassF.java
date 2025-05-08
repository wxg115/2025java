package package1;

import week10.ClassD;

public class ClassF {
	public ClassF() {
		ClassD c1 = new ClassD();
		
		//public 는 모든 클래스에서 접근 가능
		c1.field1 = 10;
		// default 는 같은 패키지 안에서만 접근 가능
		//c1.field2 = 10;
		// private 은 자신의 클래스 안에서만 접근 가능
		//c1.field3 = 10;
		
		// public
		c1.method1();
		// default 
		//c1.method2();
		// private 
		//c1.method3();
	}
}
