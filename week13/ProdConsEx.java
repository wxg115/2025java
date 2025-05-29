package week13;

public class ProdConsEx {
	public static void main(String[] args) {
		// DataBox 객체 생성
		DataBox dataBox = new DataBox();
		
		ProducerThread prod = new ProducerThread(dataBox);
		ConsumerThread cons = new ConsumerThread(dataBox);	// 공유 객체
		prod.start();
		cons.start();
		
	}
}
