import java.util.Arrays;
import java.util.HashSet;

public class ValidAnagram {
	public static void main(String[] args){
		ValidAnagram c=new ValidAnagram();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		String s1="";
		String s2="";
		System.out.println(s.isAnagram(s1,s2));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public boolean isAnagram(String s, String t) {
	        HashSet set=new HashSet();
	        char[] cs=s.toCharArray();
	        char[] ct=t.toCharArray();
	        Arrays.sort(cs);
	        Arrays.sort(ct);
	        set.add(new String(cs));
	        if(set.add(new String(ct))){
	        	return false;
	        }else return true;
	    }
	}
}
