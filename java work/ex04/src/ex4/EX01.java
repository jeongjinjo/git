package ex4;

import java.util.Scanner;

public class EX01 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			String a=sc.next();
	
	char [] chars=a.toCharArray();
	System.out.println("char[0]="+chars[0]);
	System.out.println("char[1]="+chars[1]);
	System.out.println("char[2]="+chars[2]);
	System.out.println("char[3]="+chars[3]);
	
	for(int i=0; i<chars.length;i++)
		System.out.println(chars[i]);
		
}
}
