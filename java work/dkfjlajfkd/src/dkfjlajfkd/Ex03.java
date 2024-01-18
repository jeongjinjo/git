package dkfjlajfkd;

import java.util.Arrays;

public class Ex03 {
	
	
	public void sort(int [] arr) {
		for (int i=0 ; i<5 ; i++) {
			for(int j=0;j<5;j++) {
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}
	}
	public void print(int[] arr) {
		for(int i=0; i<5;i++) {
			System.out.println(arr[i]+"\t");
		}
	}

	Ex03(){
		int arr[] = new int[] {10,20,5,2,11};
		//{10,20,5,2,11}그냥 이렇게 선언해도 됨.
		sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+"\t");
			
		}
	}
		
public static void main(String[] args) {
	new Ex03();
}		
		//배열 선언 매서드 이용해서 ! 

		       
		//배열 정렬
		
		
		//배열의 모든 값을 더해서 출력해보기
	
	}


