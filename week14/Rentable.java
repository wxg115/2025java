package week14;

public interface Rentable<T> {
	// 다양한 제품을 렌트하기 위해서 리턴 타입을 제네릭으로 선언
	T rent();
}
