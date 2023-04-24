import java.util.Scanner;
public class StringPalin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int cnt=0;
		for(int i=0;i<str.length();i++) {
			for(int j=str.length()-1;j>=0;j--) {
				if(str.charAt(i)==str.charAt(j)) {
					cnt++;
				}
			}
		}
		if(cnt>=str.length()+2) {
			System.out.println("String is palin");
		}
		else {
			System.out.println("Not palin");
		}
	}
}
