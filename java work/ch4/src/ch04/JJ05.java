package ch04;

import java.util.Scanner;

public class JJ05 {
	public static void main(String[] args) {
		int month=0;
		Scanner scanner=new Scanner(System.in);
		String tmp=scanner.nextLine();
		month=Integer.parseInt(tmp);
		
		switch(month) {
		case 3:
			System.out.println("3입니다.");
			break;
			
			default:
				System.out.println(예외입니다.);
		}
		System.out.println("종료됩니다.");
	
	}
}