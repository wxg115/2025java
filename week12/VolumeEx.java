package week12;

public class VolumeEx {
	// 익명 구현 객체 => 구현 클래스 선언 없이 바로 구현 개체를 생성
	// 인터페이스 변수 = new 인터페이스() {...};
	Volume vol = new Volume() {

		@Override
		public void volumeUp(int level) {
			System.out.println("익명 객체 볼륨을 올립니다: " + level);
		}

		@Override
		public void volumeDown(int level) {
			System.out.println("익명 객체 볼륨을 내립니다: " + level);
		}
	};
	
	vol.volumeUp(5);
	vol.volumeDown(3);
	
	Volume vol2 = new Volume() {
		
		@Override
		public void volumeUp(int level) {
			
		}
		
		@Override
		public void volumeDown(int level) {
			
		}
	};
}
