
public class DecodeWays {
	public static void main(String[] args){
		DecodeWays c=new DecodeWays();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		String s1="1";
		System.out.println(s.numDecodings(s1));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public int numDecodings(String s) {
	        if(s.length()==0) return 0;
	        else if(s.charAt(0)=='0') return 0;
	        int result=1,preEven=0,preOdd=1;
	        for(int i=1;i<s.length();i++){
	        	if(s.charAt(i)=='0'){
	        		int num=Integer.valueOf(s.substring(i-1, i+1)).intValue();
	        		if(num>26||num<1) return 0;
	        		else {
	        			preEven=1;
	        			preOdd=0;
	        		}
	        	}else 
	        	if(i<s.length()-1&&s.charAt(i+1)=='0'){
	        		int num=Integer.valueOf(s.substring(i, i+2)).intValue();
	        		if(num>26||num<1) return 0;
	        		preEven+=preOdd;
	        		preOdd=0;
	        		i++;
	        	}else{
	        		int num=Integer.valueOf(s.substring(i-1, i+1)).intValue();
	        		if(num<1) return 0;
		        	if(num>26){
		        		preOdd+=preEven;
		        		preEven=0;
		        	}else{
		        		int curOdd=preEven+preOdd;
		        		preEven=preOdd;
		        		preOdd=curOdd;
		        		result=preEven+preOdd;
		        	}
	        	}
	        }
	    	return result;
	    }
	}
}
