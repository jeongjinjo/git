package dkfjlajfkd;

public class Adfs {

	int width;
	int height;
	//alt + shift + s->o
	public Tri() {} //다른 생성자 선언시에는 기본 생성자는 선언 해야한다. 원래는 생략 가능.
	
	
	public Tri(int width, int height) {
		this.width = width;//
		this.height = height;
	}
	
	// alt + shift + s ->s
	@Override
	public String toString() {
		return "Tri [width=" + width + ", height=" + height + "]";
}
	public double area() {
		return width*height*0.5;
	}
