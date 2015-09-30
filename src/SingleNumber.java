import java.util.Arrays;



public class SingleNumber {
	public static void main(String[] args){
		SingleNumber c=new SingleNumber();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		int[] n={20,20,12,11,11,12,23,1,1};
		System.out.println(s.singleNumber(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public int singleNumber(int[] nums) {
	    	if(nums.length<0) return 0;
	    	Arrays.sort(nums);
	    	int pre=nums[0];
	    	for(int i=1;i<nums.length;i++){
	    		if(nums[i]==pre&&i<nums.length-1){
	    			pre=nums[i+1];
	    			i++;
	    		}else{
	    			if(i%2==1) return pre;
	    			else return nums[i];
	    		}
	    		
	    	}
	        return pre;
	    }
	}
}
