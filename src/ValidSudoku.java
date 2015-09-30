import java.util.HashSet;
import java.util.Set;


public class ValidSudoku {
	public static void main(String[] args){
		ValidSudoku c=new ValidSudoku();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		String[] s1={".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
		
		char[][]board=new char[9][9];
		for(int i=0;i<9;i++){
			board[i]=s1[i].toCharArray();
		}
		System.out.println(s.isValidSudoku(board));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public boolean isValidSudoku(char[][] board) {
	    	int size=board.length;
	    	HashSet[] ver=new HashSet[size];
	    	HashSet[] hor=new HashSet[size];
	    	HashSet[][] cube=new HashSet[(int) Math.sqrt(size)][(int) Math.sqrt(size)];
	    	for(int i=0;i<size;i++){
	    		ver[i]=new HashSet();
	    		hor[i]=new HashSet();
	    	}
	    	for(int i=0;i<(int) Math.sqrt(size);i++){
	    		for(int j=0;j<(int) Math.sqrt(size);j++){
	    			cube[i][j]=new HashSet();
	    		}
	    	}
	    	for(int i=0;i<size;i++){
	    		for(int j=0;j<size;j++){
	    			if(board[i][j]!='.'){
	    				if(!ver[j].add(board[i][j])) return false;
	    				if(!hor[i].add(board[i][j])) return false;
	    				if(!cube[i/3][j/3].add(board[i][j])) return false;
	    			}
	    		}
	    	}
	        return true;
	        
	    }
	}
}
