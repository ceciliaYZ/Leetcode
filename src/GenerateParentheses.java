import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class GenerateParentheses {
	public static void main(String[] args){
		GenerateParentheses c=new GenerateParentheses();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		int n=3;
		System.out.println(s.generateParenthesis(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public List<String> generateParenthesis(int n) {
	    	 List<String> result=new ArrayList<String>();
	    	 if(n<1) return result;
	    	 String par="()";
	    	 result.add(par);
	    	 for(int i=1;i<n;i++){
	    		 Set<String> inner=new HashSet<String>();
	    		 for(int j=0;j<result.size();j++){
	    			 String temp=result.get(j);
	    			 int size=temp.length();
	    			 for(int k=0;k<size;k++){
	    				 String temp1=temp.substring(0, k)+par+temp.substring(k, size);
	    				 inner.add(temp1);
	    			 }
	    			 inner.add(temp+par);
	    		 }
	    		result.clear();
	    		result.addAll(inner);
	    	 }
	    	 return result;
	    }
	}
}
