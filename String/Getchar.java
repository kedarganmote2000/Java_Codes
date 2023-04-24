package String;
import java.util.*;
public class Getchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s =sc.next();
		int index = sc.nextInt();
//		int n = s.length();
//		for(int i=0;i<n;i++) {
//			if(s.charAt(i)==index) {
				System.out.println(s.charAt(index));
				
//			}
//		}
	}
}
