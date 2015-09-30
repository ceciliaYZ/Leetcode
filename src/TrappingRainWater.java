import java.util.List;


public class TrappingRainWater {
	public static void main(String[] args){
		int [] nums={0,1,0,2,1,0,1,3,2,1,2,1};
		int result=Solution.trap(nums);
		System.out.println(result);
	}
	public static class Solution {
	    public static int trap(int[] A) {
	    	int i = 0, j = A.length - 1, result = 0, plank = 0;
	        while(i <= j){
	            plank = plank < Math.min(A[i], A[j]) ? 
	            		Math.min(A[i], A[j]) : plank;
	            result = A[i] >= A[j] ? 
	            		result + (plank - A[j--]) : result + (plank - A[i++]);
	        }
	        return result;
	    }
	}
}
