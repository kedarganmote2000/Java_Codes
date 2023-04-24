import java.util.*;
public class Sort_0_1_2 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int n = sc.nextInt();
		int [] nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		  int temp;
	        int low=0,mid=0,high=n-1;
	        while(mid<=high){
	            if(nums[mid]==0){
	                 temp=nums[low];
	                nums[low]=nums[mid];
	                nums[mid]=temp;
	                low++;
	                mid++;
	            }
	            else if(nums[mid]==1){
	                mid++;
	            }
	            else if(nums[mid]==2)
	            {
	                temp=nums[mid];
	                nums[mid]=nums[high];
	                nums[high]=temp;
	                high--;
	            }
	        }
	        System.out.println(Arrays.toString(nums));
	}

}
