import java.util.*;
public class rev {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int d,a,rev=0;
		System.out.println("enter the no");
	a=sc.nextInt();
		while(a>0) {
		for(int i=0;i<a;i++) {
			d=a%10;
			rev=rev*10 +d;
			a=a/10;
		}
		System.out.println("rev"+rev);
		}
	}
}
