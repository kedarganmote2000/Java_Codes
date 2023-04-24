import java.util.*;
public class Fibonnaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int num=0;
		int num1=1,num2;
		System.out.print(num + " ");
		System.out.print(num1 + " ");
		for(int i=2;i<=n;i++) {
			num2=num+num1;
			System.out.print(num2+ " ");
			num=num1;
			num1=num2;
		}
	}
}
