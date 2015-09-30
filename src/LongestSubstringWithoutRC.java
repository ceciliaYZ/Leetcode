

public class LongestSubstringWithoutRC {
	public static void main(String[] args){
		LongestSubstringWithoutRC c=new LongestSubstringWithoutRC();
		long start = System.currentTimeMillis();
		String s1="abbvabvd";
		Solution s=c.new Solution();
		System.out.println(s.lengthOfLongestSubstring(s1));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        if(s.length()<2) return s.length();
	    	String curS=s.charAt(0)+"";
	        int len=1,maxLen=len;
	        for(int i=1;i<s.length();i++){
	        	int find=curS.indexOf(s.charAt(i));
	        	if(find>-1){
	        		curS=curS.substring(find+1)+s.charAt(i);
	        		len=curS.length();
	        	}else{
	        		curS+=s.charAt(i);
	        		len++;
	        	}
	        	maxLen=len>maxLen? len: maxLen;
	        }
	    	return maxLen;
	    }
	}
}
