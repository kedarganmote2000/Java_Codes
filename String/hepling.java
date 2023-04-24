import java.util.*;
public class hepling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		//String str1 = "AEIOUY";
		char [] crr = str.toCharArray();
		int cnt=0;
		if(str.charAt(2)=='A' || str.charAt(2)=='I' || str.charAt(2)=='O' || str.charAt(2)=='U' || str.charAt(2)=='Y') {
			System.out.println("Invalid");
		}
		else {
		for(int i=0;i<crr.length-1;i++) {
			if(((int)crr[i]+(int)crr[i+1])%2==0 && crr[i]!='-') {
				cnt++;
			}
		}
		if(cnt==6) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		}
	}
}
