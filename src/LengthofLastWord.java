
public class LengthofLastWord {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String s="   Hello World    ";
		System.out.println(Solution.lengthOfLastWord(s));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static int lengthOfLastWord(String s) {
	    	int result=0;
	    	for(int i=s.length()-1;i>=0;i--){
	    		if(result!=0&&s.charAt(i)==' ') break;
	    		else if(s.charAt(i)!=' ') result++; 
	    	}
	    	return result;
	    }
	}
}
