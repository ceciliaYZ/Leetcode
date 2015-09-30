import java.util.Arrays;


public class NextPermutation {
	public static void print(int[] nums){
		for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]+",	");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		int[] n={1,5,1};
		int product=1;
		for(int i=0;i<n.length;i++){
			product*=(i+1);
		}
//		for(int i=0;i<product;i++){
			Solution.nextPermutation(n);
			print(n);
//		}
	}
	public static class Solution {
		public static void swap(int[] nums, int a, int b){
			int temp=nums[a];
			nums[a]=nums[b];
			nums[b]=temp;
		}
	    public static void nextPermutation(int[] nums)  {
	    	int size=nums.length, targetPosition=-1;
	    	//find the last nums[i]<nums[i+1]
	    	for(int i=0;i<size-1;i++){
	    		if(nums[i]<nums[i+1]) targetPosition=i;
	    	}
	    	if(targetPosition==-1){
	    		Arrays.sort(nums);
	    	}else if(targetPosition==size-2){
	    		swap(nums,targetPosition,targetPosition+1);
	    	}else {
	    		int nextTarget=targetPosition+1;
	    		for(int i=1;i<size-targetPosition;i++){
	    			if(nums[targetPosition+i]>nums[targetPosition]
	    					&&nums[targetPosition+i]<nums[nextTarget])
	    				nextTarget=targetPosition+i;
	    		}
	    		swap(nums,targetPosition,nextTarget);
	    		Arrays.sort(nums, targetPosition+1, size);
	    	}
	    }
	}
}
