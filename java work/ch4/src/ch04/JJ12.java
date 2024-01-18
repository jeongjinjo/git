package ch04;
//charAt() 몇번째
//toCharArry()	문자로 배열만들어라
//split()	분할해라	
//subString 몇번째부터 자르기

public class JJ12 {
	// charAt() 몇번쨰...
	// toCharArray() 문자로 배열만들어라
	// replace 대체해라
	// split 분할해라
	// subString 몇번쨰 자르기

	public static String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
		
		String temp = my_string.substring(0, s) + overwrite_string;
		
		
		System.out.println(my_string.substring(9));
		System.out.println(temp.length());

//		System.out.println();

//        System.out.println(my_string.length());
//        System.out.println(my_string.substring(5,8));
//        System.out.println(my_string.substring(7,10));

//        System.out.println(my_string);
//        System.out.println(overwrite_string);
//        System.out.println(s);

		return my_string.substring(0, s) + overwrite_string + my_string.substring(temp.length());
	}

	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d", "lloWorl", 2));
		System.out.println(solution("Program29b8UYP", "merS123", 7));
	}
}