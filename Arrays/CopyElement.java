import java.util.*;
public class CopyElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of First Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Element of First Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr1 = new int[n];
		arr1 = arr;
		System.out.println("sec"+Arrays.toString(arr1));
	}
}
