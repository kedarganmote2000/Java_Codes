import java.util.Scanner;
public class que2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element");
		int a = sc.nextInt();
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				cnt++;
			}
		}
		if(cnt>=1) {
			System.out.println("True");
		}
		else {
			System.out.println("False") ;
		}
	}
}