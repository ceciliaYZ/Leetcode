import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args){
//		int [][] nums={{ 1, 2, 3 },
//				 { 4, 5, 6 },
//				 { 7, 8, 9 }};
		int [][] nums={};
		List<Integer> result=Solution.spiralOrder(nums);
//		for(int i=0;i<result.size();i++){
//			System.out.print(result.get(i));
//		}
		System.out.println("Done");
	}
	public static class Solution {
	    public static List<Integer> spiralOrder(int[][] matrix) {
	    	List<Integer> result=new ArrayList<Integer>();
	    	int m=matrix.length;
	    	if(m==0) return result;
	    	int n=matrix[0].length;
	    	
	    	int curM=0, curN=0;
	    	int countLines=0;
	    	for(int i=0;i<m*n;){
	    		int length=0;
	    		if(countLines%2==0) {
	    			length=n-(countLines+1)/2;
	    			for(int j=0;j<length;j++){
	    				if(countLines%4==0) result.add(matrix[curM][curN++]);
	    				else result.add(matrix[curM][curN--]);
		    			i++;
		    		}
	    			if(countLines%4==0) {
	    				curN--;
	    				curM++;
	    			}
	    			else {
	    				curN++;
	    				curM--;
	    			}
	    			countLines++;
	    		}
	    		else {
	    			length=m-(countLines+1)/2;
	    			for(int j=0;j<length;j++){
	    				if((countLines-1)%4==0) result.add(matrix[curM++][curN]);
	    				else result.add(matrix[curM--][curN]);
		    			i++;
		    		}
	    			if((countLines-1)%4==0) {
	    				curM--;
	    				curN--;
	    			}
	    			else {
	    				curM++;
	    				curN++;
	    			}
	    			countLines++;
	    		}
	    		
	    	}
	    	return result;
	    }
	}
}
