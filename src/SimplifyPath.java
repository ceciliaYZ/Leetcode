import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;



public class SimplifyPath {
	public static void main(String[] args){
		SimplifyPath c=new SimplifyPath();
		long start = System.currentTimeMillis();
		String s1="/a/./b/../../c/";
		String s2="/home/";
		String s3="/../";
		String s4="/home//foo//.";
		String s5="/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///";
		
		Solution s=c.new Solution();
		System.out.println(s.simplifyPath(s1));
		System.out.println(s.simplifyPath(s2));
		System.out.println(s.simplifyPath(s3));
		System.out.println(s.simplifyPath(s4));
		System.out.println(s.simplifyPath(s5));
		System.out.println(s.simplifyPath2(s5));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
		public String simplifyPath2(String path) {
			 Deque<String> stack = new LinkedList<>();
			    Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
			    for (String dir : path.split("/")) {
			        if (dir.equals("..") && !stack.isEmpty()) stack.pop();
			        else if (!skip.contains(dir)) stack.push(dir);
			    }
			    String res = "";
			    for (String dir : stack) res = "/" + dir + res;
			    return res.isEmpty() ? "/" : res;
		}
	    public String simplifyPath(String path) {
	    	if(path.length()<2||path.charAt(0)!='/') return "/";
	        Stack<String> s=new Stack<String>();
	        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
	        for (String dir : path.split("/")) {
		        if (dir.equals("..") && !s.isEmpty()) s.pop();
		        else if (!skip.contains(dir)) s.push(dir);
		    }
	    	String result="";
	    	for (String dir : s) result=result+"/"+dir;
	    	return result.isEmpty() ? "/" :result;
	    }
	}
}
