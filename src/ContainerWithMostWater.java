
public class ContainerWithMostWater {
	public static void print(int[] nums){
		for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]+",	");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		long start = System.currentTimeMillis();
//		int[] n=new int[3333];
//		for(int i=0;i<n.length;i++){
//			n[i]=1;
//		}
		int[] n={1,2,4,3};
		System.out.println(Solution.maxArea(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static int maxArea(int[] height) {
	    	int max=0,i=0,j=height.length-1;
	    	while(i<j){
	    		int temp=Math.min(height[i], height[j])*(j-i);
    			max=temp>max?temp:max;
    			if(height[i]<height[j]) i++;
    			else j--;
	    	}
	        return max;
	    }
	    
	}
}
