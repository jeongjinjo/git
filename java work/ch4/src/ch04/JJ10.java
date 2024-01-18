package ch04;

import java.util.Scanner;

public class JJ10 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	String temp=sc.next();
	
	System.out.println(temp.charAt(0));
	System.out.println(temp.charAt(1));
	System.out.println(temp.charAt(2));
	System.out.println(temp.charAt(3));
	System.out.println(temp.charAt(4));
	
	String[] ar= {"ㄱ","ㄴ","ㄷ","ㄹ",};
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	System.out.println(ar[3]);
	
	String c="10 20 30 ";
	String test[]=c.split(" ");
	System.out.println(test[0]);
	System.out.println(test[1]);
	System.out.println(test[2]);
	System.out.println(test[3]);
	
	
	
}
}
