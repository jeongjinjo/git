package ex02;

import java.util.Scanner;

public class EX08_2 {
	//num1과 num2를 매개 변수로 받는 solution 함수
	
	public static int solution(int num1,int num2) {
		return num1+num2;
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int num1=scan.nextInt();
	
		System.err.println("숫자 입력");
		int num2=scan.nextInt();
		
		int result=solution(num1,num2);
		
		System.out.println("결과="+result);
		System.out.println("num1="+result);
		
		int result1=solution(num1,num2);
		
		System.out.println("결과="+result1);
		
	}
}
