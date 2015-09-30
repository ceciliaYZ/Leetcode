
public class RemoveDuplicatesII {
	public static void print(int[] nums){
		for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]+",	");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		int[] n={};
		int result=Solution.removeDuplicates(n);
		print(n);
		System.out.println(result);
	}
	public static class Solution {
	    public static int removeDuplicates(int[] nums) {
	    	int i,count=0,len=nums.length,countDuplicate=1;
	        for(i=0;i<len;i++){
	                if(i==0){
	                    count++;
	                }else if(nums[i]!=nums[i-1]){
	                	nums[count]=nums[i];
	                    count++;
	                    countDuplicate=1;
	                }else if(countDuplicate<2){
	                	nums[count]=nums[i];
	                    count++;
	                    countDuplicate++;
	                }else
	                {
	                	countDuplicate++;
	                }
	        }
	        return count;
	    }
	
	}
	
}
