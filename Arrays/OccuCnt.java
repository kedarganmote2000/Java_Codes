import java.util.*;
public class OccuCnt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int arr [] = new int[n];
		System.out.println("Enter Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		  int cnt=1;
		  if(i!=arr.length-1) {
		 // boolean flag = true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				 
					cnt++;
				
				}
		}
		  }
			
		  
			System.out.println("Occurance of "+arr[i]+"="+cnt);
			i+=(cnt-1);   //It is used to shift the i to the last Position
		}              //of the Occurance element or be on the same position
	}              //for single Element 
			              //for eg (4 4 4 5 2) here i=0,but after line 26 i value will become 2
			              // i.e it will go to last position of the same element
			              //  and when i will 3 it will be on the same position i.e i=3
	} 

