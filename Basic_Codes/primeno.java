import java.util.*;
public class primeno {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("no");
	int a,count=0;
	a=sc.nextInt();
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			count++;
			break;
		}
	}
	if(count==0) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
	}
		
	}
	

