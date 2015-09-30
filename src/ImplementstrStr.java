

public class ImplementstrStr {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String s="";
		String s2="";
		System.out.println(Solution.strStr(s,s2));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static int strStr(String haystack, String needle){
	    	if(needle.length()==0) return 0;
	    	for(int i=0; i<haystack.length()-needle.length()+1;i++){
	    		for(int j=0;j<needle.length();j++){
	    			if(needle.charAt(j)!=haystack.charAt(i+j)) break;
	    			else if(j==needle.length()-1) return i;
	    		}
	    	}
	    	return -1;
	    	
	    }
	}
}
