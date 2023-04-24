package String;
import java.util.*;
public class sortstring {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char strr [] = str.toCharArray();
		Arrays.sort(strr);
		System.out.println(strr);
		}
}
