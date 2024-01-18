package ex4;
//두 정수에 대한 a+b 에 대한 연산으로 두 정수를 붙여서.. 
import java.util.Scanner;

public class TEST01 {
	
	/*int -> double
	 * double->int 
	 * 
	 * String->int
	 * Integer.parseInt(변수명)
	 * 
	 * String->double
	 * Double.parseDouble(변수명);
	 * 
	 * String->float
	 * Float/parseFloat(변수명);
	*/
	public static int solution(int a, int b) {
		int result1=Integer.parseInt(a+""+b);
		int result2=Integer.parseInt(b+""+a);
		
		if (result1<result2)
			return result2;
		else
			return result1;
	}
	
	public static void main(String[] args) {
		
	
	 int a=12;
	 int b=9;
	 System.out.println(12+""+3);
	 
	 int result=solution(a,b);
	 System.out.println(result);
	 

	}
	

		
	

	}
