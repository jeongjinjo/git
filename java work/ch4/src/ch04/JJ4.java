package ch04;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class JJ4 {
	
public static void main(String[] args) throws FileNotFoundException{
	Scanner sc=new Scanner(new File("src/abc.txt"));


	int a=sc.nextInt();
	System.out.println("a="+a);
		
	if (a>=90) {System.out.println("A입니다");}
	
	else if (a>=80)	{System.out.println("b입니다.");
	}
	
	if (a>=70)  {
}

