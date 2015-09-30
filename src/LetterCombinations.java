import java.util.ArrayList;
import java.util.List;


public class LetterCombinations {
	public static void main(String[] args){
		LetterCombinations c=new LetterCombinations();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		String s2="23456789";
		System.out.println(s.letterCombinations(s2));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public List<String> letterCombinations(String digits) {
	    	List<String> result=new ArrayList<String>();
	    	if(digits.length()<1) return result;
	    	String[] dic={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	    	for(int i=0;i<digits.length();i++){
	    		int num=(int)digits.charAt(i)-48;
	    		List<String> inner=new ArrayList<String>();
	    		for(int j=0;j<dic[num].length();j++){
	    			if(i==0){
	    				inner.add(dic[num].charAt(j)+"");
	    			}else{
	    				for(int k=0;k<result.size();k++){
	    					inner.add(result.get(k)+dic[num].charAt(j));
		    			}
	    			}
	    		}
	    		result.clear();
	    		result.addAll(inner);
	    	}
	        return result;
	        
	    }
	}
}
