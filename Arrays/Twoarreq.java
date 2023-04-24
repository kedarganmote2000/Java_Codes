import java.util.*;
public class Twoarreq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of First Array");
		int n = sc.nextInt();
		System.out.println("Enter Size of Second Array");
		int a = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Element of First Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr1 = new int[a];
		System.out.println("Enter Element of Second Array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		boolean result = Arrays.equals(arr, arr1);
//		int cnt=0;
//		if(arr.length==arr1.length) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=arr1[i]) {
//				cnt++;
//			}
//		}
//		}
//		if(cnt>=1){
//			System.out.println("False");
//		}
//		else {
//			System.out.println("True");
//		}
		if(result==true) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}
