package ex4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
				
				
		int total=0;
		int productCnt =4;
		int calcu_total=0;
		
		total=scan.nextInt();
		productCnt=scan.nextInt();
		
		int[] itemPrice=new int[productCnt];
		int[] itemCnt=new int[productCnt];
		
		for(int i=0; i<productCnt; i++){
			itemPrice[i]=scan.nextInt();
			itemCnt[i]=scan.nextInt();
		}
		
		for(int i=0; i<productCnt; i++) {
			System.out.println("itemPrice[i]"+itemPrice[i]);
			System.out.println("itemCnt[i]"+itemCnt[i]);
		}
	}
		/*
		 * 260000 4 20000 5 30000 2 10000
		 */
		
		
}