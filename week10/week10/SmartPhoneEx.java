package week10;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("갤럭시", "white");
		
		System.out.println("모델 : " + phone1.getModel());
		System.out.println("색상 : " + phone1.getColor());
		System.out.println("wifi : " + phone1.isWifi());
		
		phone1.bell();
		phone1.sendVoice("Hello");
		phone1.receiveVoice("Hello");
		phone1.hangUp();
		
		phone1.setWifi(true);
		phone1.isWifi();
		phone1.internet();
	}
}
