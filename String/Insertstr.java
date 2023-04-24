package String;

import java.util.*;

public class Insertstr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println("Insert string you want");
		String st = sc.next();
		System.out.println("Enter Index");
		int n = sc.nextInt();
		String newString = "";
		for(int i=0;i<str.length();i++) {
			 newString += str.charAt(i); 
			if(i==n) {
				newString += st;
			}
		}
		System.out.println(newString);
	}
}
