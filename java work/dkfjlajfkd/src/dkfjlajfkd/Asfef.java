package dkfjlajfkd;

public class Asfef {
	
	
	Asfef(){
		int x[]= {10,20};
		int y=10;
		
		System.out.println("기본생성자 y="+y);
		doy(y);
		System.out.println("기본생성자 y="+y);
		
		
		System.out.println("기본생성자 x[0]="+x[0]);
		System.out.println("기본생성자 x[1]"+x[1]);
		
		
		doArr(x);
		
		System.out.println("기본생성자 x[0]="+x[0]);
		System.out.println("기본생성자 x[1]"+x[1]);
	}
	
	public void doArr(int y) {
		y=200;
		System.out.println("doArr="+y);
	}
	
	public void doArr(int x[]) {
		x[0]=100;
		System.out.println("doArr="+x[0]);
	}
	
	public static void main(String[] args) {
		
		new Asfef();
	}

}
