package String;
import java.util.*;
public class Leadingzero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		int i;
		for( i=0;i<str.length();i++) {
			if(str.charAt(i)!='0') {
				break;
			}
		}
		System.out.println(str.substring(i));
	}
}
