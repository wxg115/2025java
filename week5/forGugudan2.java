package week5;

public class forGugudan2 {
	public static void main(String[] args) {
		for (int i=1; i <= 9; i++) {
			System.out.println("=============");
			System.out.println("구구단: " + i + "단");
			System.out.println("=============");
			for (int j=1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
	}
}
