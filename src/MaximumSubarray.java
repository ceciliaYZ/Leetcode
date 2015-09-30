
public class MaximumSubarray {
	
	public static void main(String[] args){
		int[] n={-2,1,-3,4,-1,2,1,-5,4};
		long start = System.currentTimeMillis();
		System.out.println(Solution.maxSubArray(n));
		long end = System.currentTimeMillis();
		System.out.println("toke: "+(end-start));
	}
	public static class Solution {
	    public static int maxSubArray(int[] nums) {
	    	int maxSum=Integer.MIN_VALUE,sum=0;
	    	for(int i=0;i<nums.length;i++){
	    		sum=(sum+nums[i])<nums[i]?nums[i]:(sum+nums[i]);
	    		maxSum= maxSum<sum? sum :maxSum;
	    	}
	    	return maxSum;
	    }
	}
}
