import java.util.Arrays;

class ArrayEx4 {
	public static void main(String[] args) {
		int [] arr = {100,90,60,40,120};
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=1 ; j<5-j ; j++) {
			if(arr[i]>arr[j]){
				int temp=arr[1];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
				
		}
	}

