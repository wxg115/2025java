package week10;

public class ClassE {
	public ClassE() {
		ClassD c1 = new ClassD();
		c1.field1 = 20;
		c1.field2 = 20;
		// private
		//c1.field3 = 20;
		
		c1.method1();
		c1.method2();
		// private
		//c1.method3();
	}
}
