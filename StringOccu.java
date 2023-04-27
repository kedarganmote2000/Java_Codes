package String;
import java.util.*;
public class StringOccu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		System.out.println("Enter Char");
		char c = sc.next().charAt(0);
		int a=0;
		int cnt=1;
		for(int i=0;i<str.length();i++) {
			if(c!=str.charAt(i)) {
				cnt++;
			}
		}
		if(cnt==str.length()+1) {
			System.out.println("Char is not present");
			return;
		}
		cnt=1;
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				cnt++;
			}
		}
		if(cnt==3) {
			System.out.println("Only two char are present");
		}
		if(cnt!=3) {
		for(int i=0;i<str.length();i++) {
			if(c==str.charAt(i)) {
				cnt++;
				a=i;
			}
		}
		int b=0;
		for(int i=0;i<a;i++) {
			if(c==str.charAt(i)) {
				cnt++;
				b=i;
			}
		}	
		System.out.println(b);
		}
	}

}
