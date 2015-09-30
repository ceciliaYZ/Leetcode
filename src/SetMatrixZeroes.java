


public class SetMatrixZeroes {
	public static void main(String[] args){
		int[][] n={{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
		int[][] result=Solution.setZeroes(n);
		print(result);
		System.out.println("Done");
	}
	public static class Solution {
	    public static int[][] setZeroes(int[][] matrix){
	    	int m=matrix.length,n=matrix[0].length;
	    	boolean ver=false, hor=false;
	    	for(int i=1;i<n;i++){
				if(matrix[0][i]==0){
					hor=true;
					break;
				}
			}
	    	for(int i=1;i<m;i++){
	    		if(matrix[i][0]==0){
					ver=true;
					break;
				}
			}
	    	print(matrix);
	    	for(int i=1;i<m;i++){
				for(int j=1;j<n;j++){
					if(matrix[i][j]==0){
						matrix[0][j]=0;
						matrix[i][0]=0;
					}
				}
			}
	    	print(matrix);
	    	for(int i=1;i<n;i++){
				if(matrix[0][i]==0){
					for(int j=0;j<m;j++){
						matrix[j][i]=0;
					}
				}
			}
	    	print(matrix);
	    	for(int i=1;i<m;i++){
	    		if(matrix[i][0]==0){
	    			for(int j=0;j<n;j++){
	    				matrix[i][j]=0;
	    			}
				}
			}
	    	print(matrix);
	    	if(matrix[0][0]==0){
	    		hor=true;
	    		ver=true;
	    	}
	    	if(hor){
				for(int j=0;j<n;j++){
					matrix[0][j]=0;
				}
			}
	    	if(ver){
				for(int j=0;j<m;j++){
					matrix[j][0]=0;
				}
			}
	        return matrix;
	    }
	}
	public static void print(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++)
				System.out.print(matrix[i][j]);
			System.out.println(" ");
		}
		System.out.println(" ");
	}
}
