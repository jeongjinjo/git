package dhodkseho;

public class Ex5 {

	public static void main(String[] args) {
		
		//배열은 기본형타입에 배열이면 0으로 초기화하고
		//참조형타입은 null값으로 초기화한다.
		
		Tv[] tv=new Tv[100];
		
		// 인스턴스화..메모리에 올린다...
		tv[0]=new Tv();
		
		System.out.println(tv[0]);
		System.out.println(tv[1]);
		System.out.println(tv[2]);
		System.out.println(tv[3]);
		System.out.println(tv[4]);
		
		//int 객체는 Integer
		//null은 아무것도 안들어가져있다.
		int[] a=new int[10];
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		
		//객체
		String[] c= new String[100];
		System.out.println(0);
	}
}
