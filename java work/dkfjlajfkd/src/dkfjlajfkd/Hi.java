package dkfjlajfkd;

/**
 * import java.lang.*
 * toString
 * 기본생성자
 * 생성자 바로 밑에 쓰는 super();생략 가능.
 */

class Tri{
	int width;
	int height;
	//alt + shift + s->o
	public Tri() {} //다른 생성자 선언시에는 기본 생성자는 선언 해야한다. 원래는 생략 가능.
	
	
	public Tri(int width, int height) {
		super();
		this.width = width;//
		this.height = height;
	}
	
	// alt + shift + s ->s
	@Override
	public String toString() {
		return "Tri [width=" + width + ", height=" + height + "]";
	}
	
}

public class Hi {

	public static void main(String[] args) {
		
		Tri t1=new Tri(10,20);//기본생성자 호출.
		Tri t2=new Tri();
		
		System.out.println(t1);
		System.out.println(t2);
		
	}

	
}