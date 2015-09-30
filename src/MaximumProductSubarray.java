import java.util.ArrayList;
import java.util.List;


public class MaximumProductSubarray {
	public static void print(int[] nums){
		for(int i=0;i<nums.length;i++){
				System.out.print(nums[i]+",	");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		int[] n={3,-1,4};

		System.out.println(Solution.maxProduct(n));
		System.out.println(Solution.anotherMaxProduct(n));
	}
	public static class Solution {
		public static int maxProduct(int[] nums) {
			int maxPro=Integer.MIN_VALUE;
	    	for(int i=0;i<nums.length;i++){
	    		int pro=1;
	    		List<Integer> listPro= new ArrayList<Integer>();
	    		List<Integer> listNeg= new ArrayList<Integer>();
	    		int count=0;
	    		while(i<nums.length&&nums[i]!=0){
	    			pro*=nums[i];
	    			if(nums[i]<0) {
	    				listPro.add(pro);
	    				listNeg.add(i);
	    			}
	    			i++;
	    			count++;
	    		}
	    		if(count==0)  pro=0;
	    		if(pro<0&& count>1){
	    			int temp1=Math.max(listPro.get(0)/nums[listNeg.get(0)], pro/listPro.get(0));
	    			int temp2=Math.max(listPro.get(listPro.size()-1)/nums[listNeg.get(listPro.size()-1)],
	    					pro/listPro.get(listPro.size()-1));
	    			pro=Math.max(temp1, temp2);
	    		}
	    		if(i<nums.length)pro=pro>nums[i]?pro:nums[i];
	    		maxPro=Math.max(maxPro, pro);
	    	}
	    	return maxPro;
	    }
		public static int anotherMaxProduct(int [] A){
			int r = A[0];
	        for (int i = 1, imax = r, imin = r; i < A.length; i++) {
	            if (A[i] < 0){
	                int temp=imax;
	                imax=imin;
	                imin=temp;
	            }
	            imax = Math.max(A[i], imax * A[i]);
	            imin = Math.min(A[i], imin * A[i]);
	            r = Math.max(r, imax);
	        }
	        return r;
		}
	}
}
