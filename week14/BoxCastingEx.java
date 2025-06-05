package week14;

public class BoxCastingEx {
	public static void main(String[] args) {
		BoxCasting box = new BoxCasting();
		
		box.setObj("Hello");
		String sValue = box.getObj();
		
		box.setObj(100);
		int iValue = (int)box.getObj();
	}
}
