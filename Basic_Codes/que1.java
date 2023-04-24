import java.util.*;
public class que1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int yr = sc.nextInt();
		if((yr%4==0) && (yr%100!=0) || yr%400==0){
			System.out.println("Year is a Leap Year");	
		}
		else {
			System.out.println("Year is not a Leap Year");
		}
		
	}
}
