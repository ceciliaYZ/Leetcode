

public class LongestCommonPrefix {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String[] s={"aaa","aa"};
		System.out.println(Solution.longestCommonPrefix(s));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static String longestCommonPrefix(String[] strs)  {
	    	String result=new String();
	    	if(strs.length==0) return result;
	    	result=strs[0];
	    	for(int i=1;i<strs.length;i++){
	    		if(strs[i].length()==0) return result.substring(0, 0);
	    		for(int j=0;j<result.length();j++){
	    			
	    			if(strs[i].length()<j+1||strs[i].charAt(j)!=result.charAt(j)){
	    				result=result.substring(0, j);
	    			}
	    		}
	    	}
	    	return result;
	    	
	    }
	}
}
