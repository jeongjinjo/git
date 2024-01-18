package ch04;

import java.util.Scanner;

public class JJ09 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("시간 입력하세요");
	
	int hour=scan.nextInt();
	int min=scan.nextInt();
	
	System.out.println(hour);
	System.out.println(min);
	
	//만약에 분이 45분보다 작으면 시간을 1빼야한다.
	//10분 - 45분
	//45이상이면 분은 그냥 빼면되고 아니면 10 +60해서 45를 빼야한다.

	if(min<45)
	{	hour=hour-1;
	min = (min+60)-45;
	}
	System.out.println(hour);
	System.out.println(min);
	
	}
}

