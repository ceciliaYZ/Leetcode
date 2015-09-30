


public class MinimumSizeSubarraySum {
	public static void print(int[] nums){
		for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]+",	");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		int[] n={3,1,1,5};
		int s=8;
		System.out.println(Solution.minSubArrayLen(s,n));
	}
	public static class Solution {
	    public static int minSubArrayLen(int s, int[] nums)   {
	    	int p1=0, p2=0, length=nums.length+1,sum=0;
	    	while(p1>=p2&&p1<nums.length){
	    		sum+=nums[p1++];
	    		while(sum>=s){
	    			length=Math.min(p1-p2, length);
	    			sum-=nums[p2++];
	    		}
	    	}
	    	return length==nums.length+1 ? 0:length;
	    }
	}
}
