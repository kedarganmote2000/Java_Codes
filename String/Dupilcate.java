package String;
import java.util.*;
public class Dupilcate {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter String");
   String str = sc.next();
   char strr[] = str.toCharArray();
   for(int i=0;i<strr.length;i++) {
	   for(int j=i+1;j<strr.length;j++) {
	   if(strr[i]==strr[j]) {
		   System.out.print(strr[i]);
		   break;
	   }
   }
	}
}
}
