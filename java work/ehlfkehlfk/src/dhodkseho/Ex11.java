package dhodkseho;

class Data	 {
	int x=10;
	int y=20;
	
	void chagePri(int x	) {
		x=200;
	}
	void chageRef(Data d1) {
		d1.x=200;
	}
}

public class Ex11{
	Ex11(){
		Data d1 = new Data();
		d1.x=100;
		
		System.out.println(d1.x);
		
		d1.chageRef(d1);
		System.out.println(d1.x);
	}
	public static void main(String[] args) {
		new Ex11();
	}
}