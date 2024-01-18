package dkfjlajfkd;

class InstClass{
	static int num=0;
	
	InstClass(){
		num++;
		System.out.println("생성자 호출"+num);
	}
}

public class Accumulator {
	
	public static void main(String[] args) {
		new InstClass();
		new InstClass();
		new InstClass();
		
		System.out.println(InstClass.num);
		
		
		
		
	}

}
