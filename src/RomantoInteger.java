
public class RomantoInteger {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String s="";
		System.out.println(Solution.romanToInt(s));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static int romanToInt(String s) {
	    	String dic="IVXLCDM";
	    	int result=0;
	    	for(int i=s.length()-1;i>=0;i--){
	    		if(i==s.length()-1||dic.indexOf(s.charAt(i))>=dic.indexOf(s.charAt(i+1))) result+=convert(s.charAt(i));
	    		else {
	    			result-=convert(s.charAt(i));
	    		}
	    	}
	    	
	    	return result;
	    }
	    public static int convert(char c){
	    	switch(c){
	    	case 'I': return 1;
	    	case 'V': return 5;
	    	case 'X': return 10;
	    	case 'L': return 50;
	    	case 'C': return 100;
	    	case 'D': return 500;
	    	case 'M': return 1000;
	    	default: return -1;
	    	}
	    }
	}
}
