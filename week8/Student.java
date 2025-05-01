package week8;

public class Student {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.korScore = kor;
		this.engScore = eng;
		this.mathScore = math;
	}
	
	int getTotal() {
		return this.korScore + this.engScore + this.mathScore;
	}
	
	double getAve() {
		return getTotal() / 3;
	}
}
