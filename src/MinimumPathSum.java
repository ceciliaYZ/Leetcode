
public class MinimumPathSum {
	public static void print(int[][] nums){
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[0].length;j++){
				System.out.print(nums[i][j]+",	");
    		}
			System.out.println("	");	
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		int[][] n={{1,1,2},{2,1,5},{2,1,3}};
		System.out.println(Solution.minPathSum(n));
	}
	public static class Solution {
	    public static int minPathSum(int[][] grid)   {
	    	int [][] table=new int[grid.length][grid[0].length];
	    	int m=grid.length, n=grid[0].length;
	    	for(int i=0;i<m;i++){
	    		for(int j=0;j<n;j++){
	    			if(i==0&&j==0) table[i][j]=grid[i][j];
	    			else if(i==0) table[i][j]=grid[i][j]+table[i][j-1];
	    			else if(j==0) table[i][j]=grid[i][j]+table[i-1][j];
	    			else table[i][j]=-1;
	    		}
	    	}
	    	return min(m-1,n-1,grid,table);
	    }
	    public static int min(int i, int j, int[][] grid, int[][] table){
	    	if(table[i][j]>-1) return table[i][j];
	    	else {
	    		int temp1=min(i-1,j,grid,table);
	    		int temp2=min(i,j-1,grid,table);
	    		table[i][j]=grid[i][j]+Math.min(temp1, temp2);
	    		return table[i][j];
	    	}
	    }
	}
}
