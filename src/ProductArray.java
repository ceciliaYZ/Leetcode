

public class ProductArray {
	public static void print(int[] nums){
		for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]+",	");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		int[] n={};
		int[] result=Solution.productExceptSelf(n);
		print(result);
	}
	public static class Solution {
	    public static int[] productExceptSelf(int[] nums)  {
	    	int temp=1;
	    	int[] result=new int[nums.length];
	    	for(int i=0;i<nums.length;i++){
	    		result[i]=temp;
	    		temp*=nums[i];
	    	}
	    	temp=1;
	    	for(int i=nums.length-1;i>=0;i--){
	    		result[i]*=temp;
	    		temp*=nums[i];
	    	}
	    	return result;
	    }
	}
}
