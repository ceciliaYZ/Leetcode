import java.lang.reflect.Array;
import java.util.List;

public class SpiralMatrixII {
	public static void main(String[] args){
		int n=0;
		int[][] result=Solution.generateMatrix(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(result[i][j]);
			System.out.println(" ");
		}
		System.out.println("Done");
	}
	public static class Solution {
	    public static int[][] generateMatrix(int n) {
	    	int [][] result=new int[n][n];
	    	if(n==0) return result;
	    	
	    	int direction=0;
	    	for(int i=0;i<n;i++){
				for(int j=0;j<n;j++)
					result[i][j]=0;
			}
	    	int i=0,j=0;
	    	result[0][0]=1;
	    	int length=n*n+1;
	    	for(int k=2;k<length;k++){
				switch(direction){
				case 0:
					if(j==n-1){
						result[++i][j]=k;
						direction=1;
					}else if(result[i][j+1]>0){
						result[++i][j]=k;
						direction=1;
					}else{
						result[i][++j]=k;
					}
					break;
				case 1:
					if(i==n-1){
						result[i][--j]=k;
						direction=2;
					}else if(result[i+1][j]>0){
						result[i][--j]=k;
						direction=2;
					}else{
						result[++i][j]=k;
					}
					break;
				case 2:
					if(j==0){
						result[--i][j]=k;
						direction=3;
					}else if(result[i][j-1]>0){
						result[--i][j]=k;
						direction=3;
					}else{
						result[i][--j]=k;
					}
					break;
				case 3:
					if(i==0){
						result[i][++j]=k;
						direction=0;
					}else if(result[i-1][j]>0){
						result[i][++j]=k;
						direction=0;
					}else{
						result[--i][j]=k;
					}
					break;
				
				}
			}
	    	return result;
	    }
	}
}
