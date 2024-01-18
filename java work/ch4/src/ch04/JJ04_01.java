package ch04;

import java.util.Scanner;

public class JJ04_01 {
	public static void solution(int a) {
		if (a >= 90) {
			System.out.println("A입니다.");
		}else if (a < 89){
		System.out.println("사무실로 오세요.");
		};
	}



	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("A입력해주세요.");
		int a=scan.nextInt();
		System.out.println("a="+a);
		System.out.println("B입력해주세요.");
		int b=scan.nextInt();
		System.out.println("b="+b);
		
		solution (a);
		solution (b);
		
}
}