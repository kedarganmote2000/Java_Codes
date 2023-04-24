import java.util.*;
public class Kadane_Algo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int n = sc.nextInt();
		int [] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		 int sum=0;
         int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>max){
                max=Math.max(max,sum);
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
	}

}
