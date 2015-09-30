import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MajorityElementII {
	public static void print(int[] nums){
		for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]+",	");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		int[] n={2,1,2,3};
		System.out.println(Solution.majorityElement(n));
		System.out.println(Solution.anotherMajorityElement(n));
	}
	public static class Solution {
	    public static List<Integer> majorityElement(int[] nums) {
	    	Arrays.sort(nums);
	    	List<Integer> num=new ArrayList<Integer>();
	    	for(int i=0,count=0;i<nums.length;i++){
    			if(i==0)count++;
    			else if(nums[i]==nums[i-1]) count++;
	    		else count=1;
    			if(count>nums.length/3 && !num.contains(nums[i]))  num.add(nums[i]);
	    	}
	    	return num;
	    }
	   
	    public static List<Integer> anotherMajorityElement(int[] nums) {
	    	List<Integer> result=new ArrayList<Integer>();
	        int y = 0, z = 1, cy = 0, cz = 0;
	        for (int x: nums) {
	          if (x==y) 
	            cy++;
	          else if (x==z) 
	            cz++;
	          else if (cy==0){
	              y=x; 
	              cy=1;
	          }else if (cz==0){
	              z=x; 
	              cz=1;
	          }else{ 
	              cy--;
	              cz--;
	          }
	        }
	        cy = cz = 0;
	        for (int x: nums){
	          if (x==y) 
	            cy++;
	          else if (x== z) 
	            cz++;
	        }
	        if (cy>nums.length/3) 
	            result.add(y);
	        if (cz>nums.length/3) 
	            result.add(z);
	        return result;
	    }
	}
}
