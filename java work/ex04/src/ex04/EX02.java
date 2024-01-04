package ex04;

public class EX02 {
public static void main(String[] args) {
	int  a=10;
	double b=20.2;
	
	System.out.println("a="+ a);
	System.out.println("b="+b );
	
	int c=(int) b;
	double d= a;
	System.out.println("c="+c);
	System.out.println("d="+d);
	
	System.out.println(a==b);
	System.out.println(b==c);
	
	System.out.println(a==d);
	
	System.out.println(a==b||a==d);

}
}
