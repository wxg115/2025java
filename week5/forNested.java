package week5;

public class forNested {
	public static void main(String[] args) {
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 3; j++) {
				System.err.println("i = " + i + ", j = " + j);
			}
		}
	}
}
