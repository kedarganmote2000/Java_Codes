import java.util.*;
public class Sumeqkey {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n= sc.nextInt();
		System.out.println("Enter Array Element");
		int arr [] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Key");
		int a = sc.nextInt();
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==a) {
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
}
