import java.util.*;
public class Merge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of First Array");
		int n = sc.nextInt();
		System.out.println("Enter Size of Second Array");
		int a = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element of First Array");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr1 = new int[a];
		System.out.println("Enter Element of Second Array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		int a1 = arr.length;
		int b1 = arr1.length;
		
		int c = 0;
		c = a1+b1;
		int[] arr2 = new int[c];
				for(int i=0;i<arr.length;i++) {
					arr2[i]=arr[i];
				}
				for(int i=0;i<arr1.length;i++) {
					arr2[a1 + i]=arr1[i];
				}
				System.out.println(Arrays.toString(arr2));
	}
}
 