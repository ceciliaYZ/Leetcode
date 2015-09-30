
public class JumpGame {
	public static void print(int[] nums){
		for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]+",	");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int[] n=new int[3333];
		for(int i=0;i<n.length;i++){
			n[i]=1;
		}
//		int[] n={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(Solution.canJump(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static boolean canJump(int[] nums) {
	    	int i,n=nums.length-2,last=n+1;
	        for(i=n;i>=0;i--){
	            if(i+nums[i]>=last)last=i;
	        }
	        
	        return last<=0;
	    }
	    
	}
}
