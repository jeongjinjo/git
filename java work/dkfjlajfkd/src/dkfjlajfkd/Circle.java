package dkfjlajfkd;
// 반지름설정, 원넓이 구하기
public class Circle {
	
	
	private int rad;
	final double PI=3.14;//final로 값 변경 못하게 만들어준다.

	
	public Circle() {}
		public Circle(int rad) {
			this.rad=rad;
			
		}
	
	
	public double getArea() {
// 퍼블릭에서 선언하는 것은 모든 것에서 호출할 수 있다.
	return rad*rad*PI;
	}
}
