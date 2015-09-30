import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
	public static void main(String[] args){
		IsomorphicStrings c=new IsomorphicStrings();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		String s1="foo";
		String s2="bar";
		System.out.println(s.isIsomorphic(s1,s2));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public boolean isIsomorphic(String s, String t) {
	        if(s.length()!=t.length()) return false;
	        HashMap<Character,Character> map=new HashMap<Character,Character>();
	        for(int i=0;i<s.length();i++){
	        	char c=s.charAt(i);
	        	if(map.containsKey(s.charAt(i))) c= map.get(c);
	        	else if(map.containsValue(t.charAt(i))) return false;
	        	else{
        			map.put(s.charAt(i), t.charAt(i));
        			c=t.charAt(i);
        		}
	        	if(c!=t.charAt(i)) return false;
	        }
	        return true;
	    }
	}
}
