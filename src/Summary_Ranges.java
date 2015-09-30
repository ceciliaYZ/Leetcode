import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
	public static void main(String[] args){
		int [] nums={0};
		List<String> result=Solution.summaryRanges(nums);
		for(int i=0;i<result.size();i++){
			System.out.println((String)result.get(i));
		}
		System.out.println("Done");
	}
	public static class Solution {
	    public static List<String> summaryRanges(int[] nums) {
	    	List<String> result= new ArrayList<String>();
	    	if(nums.length<1) return result;
	    	else {
	    		int firstNum=nums[0];
		    	int secondNum=nums[0];
	    		for(int i=0;i<nums.length;i++){
    				while(i<nums.length-1 && nums[i+1]==nums[i]+1) i++;
    				secondNum=nums[i];
    				if(secondNum==firstNum){
						result.add(Integer.toString(firstNum));
					}else{
						result.add(Integer.toString(firstNum)+"->"+Integer.toString(secondNum));
					}
    				if(i<nums.length-1){
    					firstNum=nums[i+1];
    			    	secondNum=nums[i+1];
    				}else if(i+1==nums.length-1){
    					result.add(Integer.toString(nums[i+1]));
    					break;
    				}
		    	}
	    	}
			return result;
	    }
	}
}
