import java.util.*;
public class Occurance {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arr");
		int n = sc.nextInt();
		System.out.println("Enter Array");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println("Enter element");
		int key = sc.nextInt();
	//	int index = 0;
		for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
               continue;
            }
            
		System.out.print(arr[i] + " ");
//	 	for(int i=0;i<arr.length;i++){
		   
	 	}
		
	}

}
