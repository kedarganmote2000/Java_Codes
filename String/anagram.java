import java.util.*;
public class anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		System.out.println("Enter second string");
		String str1=sc.next();
		
		char [] crr=str.toCharArray();
		char [] cr = str1.toCharArray();
		
		Arrays.sort(crr);
		Arrays.sort(cr);
		
//		System.out.println(crr);
//		System.out.println(cr);
		boolean result = Arrays.equals(crr, cr);
		if(result==true) {
			System.out.println("String is Annagram");
		}
		else {
			System.out.println("String is not Annagram");
		}
}
}
//themorsecode  herecomedots