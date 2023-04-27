import java.util.Scanner;
public class StringPalin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		String ret = "";
		int cnt=0;
		for(int j=str.length()-1;j>=0;j--) {
			ret+=str.charAt(j);
		}
	    if(ret.equals(str)) {
	    	System.out.println("Palindrom");
	    }
	    else {
	    	System.out.println("Not Palindrom");
	    }
//		for(int i=0;i<str.length();i++) {
//			for(int j=str.length()-1;j>=0;j--) {
//				if(str.charAt(i)==str.charAt(j)) {
//					cnt++;
//				}
//			}
//		}
//		if(cnt>=str.length()+2) {
//			System.out.println("String is palin");
//		}
//		else {
//			System.out.println("Not palin");
//		}
	}
}
