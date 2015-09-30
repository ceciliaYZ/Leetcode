

public class ValidParentheses {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String s="((";
		System.out.println(Solution.isValid(s));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static boolean isValid(String s) {
	    	if(s.length()%2!=0) return false;
	    	String left="({[", right=")}]";
	    	String stack="";
	    	for(int i=0;i<s.length();i++){
	    		if(left.indexOf(s.charAt(i))>-1){
	    			stack=stack+s.charAt(i);
	    		}else{
	    			if(stack.isEmpty()) return false;
	    			if(right.indexOf(s.charAt(i))!=left.indexOf(stack.charAt(stack.length()-1))) return false;
	    			else {
	    				stack=stack.substring(0,stack.length()-1);
	    			}
	    		}
	    	}
	    	if(stack.isEmpty())return true;
	    	else return false;
	    	
	    }
	}
}
