import java.util.*;
public class Second_max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arr");
		int n = sc.nextInt();
		System.out.println("Enter Array");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			max = Math.max(max, arr[i]);
		}
		int sec_max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max>arr[i]) {
				sec_max = Math.max(sec_max, arr[i]);
			}
		}
		System.out.println(sec_max);
	}
}
