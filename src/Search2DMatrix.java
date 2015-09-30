import java.util.Arrays;
public class Search2DMatrix {
	public static void print(int[][] nums, boolean num){
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[0].length;j++)
				System.out.print(nums[i][j]+", ");
			System.out.println(" ");
		}
		System.out.print(" ->"+Boolean.toString(num));
	}
	public static void main(String[] args){
		int[][] n={{1,   3,  5,  7},
				  {10, 11, 16, 20},
				  {23, 30, 34, 50}};
		int target=50;
		boolean result=Solution.searchMatrix(n,target);
		print(n, result);
		System.out.println("Done");
	}
	public static class Solution {
	    public static boolean searchMatrix(int[][] matrix, int target) {
	    	for(int i=0;i<matrix.length;i++){
	    		int result=Arrays.binarySearch(matrix[i], target);
	    		System.out.println(result);
	    		if(result>=0) return true;
	    	}
	    	return false;
	    }
	}
}
