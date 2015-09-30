

public class SearchInsertPosition {
	public static void print(int[] nums, int num){
		for(int i=0;i<nums.length;i++){
//			for(int j=0;j<matrix[0].length;j++)
				System.out.print(nums[i]);
			System.out.print(" ");
		}
		System.out.print(" ->"+num);
	}
	public static void main(String[] args){
		int[] n={1};
		int target=2;
		int result=Solution.searchInsert(n,target);
		print(n, result);
		System.out.println("Done");
	}
	public static class Solution {
	    public static int searchInsert(int[] nums, int target) {
	    	for(int i=0;i<nums.length;i++){
	    		if(nums[i]==target||nums[i]>target) return i;
	    	}
	    	return nums.length;
	    }
	    
	}
}
