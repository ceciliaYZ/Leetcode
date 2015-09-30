
public class SearchRange {
	public static void print(int[] nums, int[] num){
		for(int i=0;i<nums.length;i++){
//			for(int j=0;j<matrix[0].length;j++)
				System.out.print(nums[i]);
			System.out.print(" ");
		}
		System.out.print(" ->"+num[0]+" "+num[1]);
	}
	public static void main(String[] args){
		int[] n={1};
		int target=1;
		int[] result=Solution.searchRange(n,target);
		print(n, result);
		System.out.println("Done");
	}
	public static class Solution {
	    public static int[] searchRange(int[] nums, int target) {
	    	int [] result={-1,-1};
	    	for(int i=0;i<nums.length;i++){
	    		if(nums[i]==target){
	    			if(result[0]==-1) {
	    				result[0]=i;
	    				result[1]=i;
	    			}
	    			else result[1]=i;
	    		}
	    	}
	    	return result;
	    }
	}
}
