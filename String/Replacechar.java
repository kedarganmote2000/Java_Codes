package String;
import java.util.*;
public class Replacechar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("Enter Index");
		int n = sc.nextInt();
		System.out.println("Enter Char");
		char c = sc.next().charAt(0);
		String str = s.substring(0,n) +  c + s.substring(n +1);
	    System.out.println(str);
	}
}
