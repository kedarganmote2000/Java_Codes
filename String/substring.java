package String;
import java.util.*;
public class substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		//String st = "";
        for(int i=0;i<str.length();i++) {
        	for(int j=i+1;j<=str.length();j++) {
        	System.out.println(str.substring(i,j));   ;
        }
        
	}
	}
}
