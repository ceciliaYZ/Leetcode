
public class ValidPalindrome {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String s="1a1";
		System.out.println(Solution.isPalindrome(s));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static boolean isPalindrome(String s) {
	    	int first=0,second=s.length()-1;
	    	s=s.toLowerCase();
	    	for(;first<s.length()/2;first++){
	    		int temp=(int)s.charAt(first);
	    		if(temp<91&&temp>64||temp<123&&temp>96||temp<58&&temp>47){
	    			while(!((int)s.charAt(second)<91&&(int)s.charAt(second)>64
	    					||(int)s.charAt(second)<123&&(int)s.charAt(second)>96
	    					||(int)s.charAt(second)<58&&(int)s.charAt(second)>47)){
	    				second--;
	    			}
	    			if(s.charAt(first)!=s.charAt(second)) return false;
	    			else second--;
	    		}
	    	}
	    	return true;
	    }
	}
}
