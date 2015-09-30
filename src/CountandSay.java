
public class CountandSay {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int n=5;
		System.out.println(Solution.countAndSay(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static String countAndSay(int n){
	    	String result="1";
	    	for( int i=1; i<n ;i++){
	    		int count=1;
	    		char c=result.charAt(0);
	    		String temp="";
	    		 for(int j=1;j<result.length();j++){
	    			if(c==result.charAt(j)) count++;
	    			else{
	    				temp=temp+count+c;
	    				count=1;
	    				c=result.charAt(j);
	    			}
	    		}
	    		result=temp+count+c;
	    	}
	    	return result;
	    	
	    }
	}
}
