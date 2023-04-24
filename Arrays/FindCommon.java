import java.util.*;
public class FindCommon {
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
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int cmn =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
				//	cmn = arr[i];
					System.out.print(arr[i] + " ");
				}
			}
		}
		
	}
}
