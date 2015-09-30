import java.util.ArrayList;
import java.util.List;



public class ReverseWordsinaString {
	public static void main(String[] args){
		ReverseWordsinaString c=new ReverseWordsinaString();
		long start = System.currentTimeMillis();
		String s1="  the sky    is blue   ";
		Solution s=c.new Solution();
//		System.out.println(s.find(s2)[0]);
		System.out.println(s.reverseWords(s1));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
		
	    public String reverseWords(String s) {
	        String result="";
	        String [] string=s.trim().split("\\s+");
	        for(int i=string.length-1;i>=0;i--){
	        	if(i==0) result=result+string[i];
	        	else result=result+string[i]+" ";
	        }
	    	return result;
	    }
	}
}
