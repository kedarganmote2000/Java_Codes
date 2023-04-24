import java.util.*;
public class Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Element");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length-1 ;i++) {
				if(arr[i]!=arr[i+1]) {
					arr[j++]=arr[i];
				}
			}
			arr[j++]=arr[arr.length-1];
					 for(int i=0;i<j;i++) {
							System.out.print(arr[i] + " ");
						      }
	}
}
