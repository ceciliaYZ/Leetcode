
public class RotateImage {
	public static void print(int[][] nums){
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[0].length;j++)
				System.out.print(nums[i][j]+",	");
			System.out.println(" ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
//		int[][] n={{1,2,3},
//				{4,5,6},
//				{7,8,9}};
		int[][] n={{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},{13,14,15,16}};
//		print(n);
		Solution.rotate(n);
		print(n);
		System.out.println("Done");
	}
	public static class Solution {
	    public static void rotate(int[][] matrix) {
	    	int size=matrix.length/2;
	    	int max=matrix.length-1;
	    	for(int i=0;i<size;i++){
	    		int jmax=max-i;
	    		for(int j=i;j<jmax;j++){
	    			int temp=matrix[j][max-i];
	    			matrix[j][max-i]=matrix[i][j];
	    			matrix[i][j]=matrix[max-j][i];
	    			matrix[max-j][i]=matrix[max-i][max-j];
	    			matrix[max-i][max-j]=temp;
	    		}
	    	}
	    }
	}
}
