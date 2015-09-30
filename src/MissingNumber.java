
public class MissingNumber {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int[] n={0,1,3};
		System.out.println(Solution.missingNumber(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	
	public static class Solution {
	    public static int missingNumber(int[] nums) {
	    	int expectedSum=0, sum=0;
	    	for(int i=0;i<nums.length;i++){
	    		sum+=nums[i];
	    	}
	    	for(int i=0;i<nums.length+1;i++){
	    		expectedSum+=i;
	    	}
	    	
	        return expectedSum-sum;
	    }
	}
}
