import java.util.*;
public class Best_time_to_Buy_sell_Stocks {
	 public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Size");
			int n = sc.nextInt();
			int [] prices = new int[n];
			for(int i=0;i<prices.length;i++) {
				prices[i] = sc.nextInt();
			}
			 int min=prices[0];
		        int profit=0;
		        int cost;
		        for(int i=1;i<n;i++){
		             cost=prices[i] - min;
		             profit=Math.max(profit,cost);
		             min=Math.min(min,prices[i]);
		        }
		        System.out.println(profit);
	 }
}
