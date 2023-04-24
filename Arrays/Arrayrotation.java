import java.util.*;
public class Arrayrotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of First Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Element of First Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Shift array by :");
		int b = sc.nextInt();
		for(int j=0;j<b;j++) {
		int a = arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = a;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
//This is a code for rotation of elements from single array.
