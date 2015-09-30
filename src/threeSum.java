import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class threeSum {
	public static void print(List<List<Integer>> nums){
		if(nums!=null) {
			for(int i=0;i<nums.size();i++){
				for(int j=0;j<nums.get(i).size() ;j++){
					System.out.print(nums.get(i).get(j)+",	");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int [] n={-1,0, 1, 2, -1, -4};
//		int [] n={1,2,-2,-1};
		print(Solution.threeSum(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    
	    public static List<List<Integer>> threeSum(int[] nums){
	    	Arrays.sort(nums);
	    	List<List<Integer>> list=new ArrayList<List<Integer>>();
	    	if(nums.length<3 || nums[0]>0 || ( nums[0]==0 && nums[2]>0 )) return list;
	    	int posStart=nums.length;
	    	for(int i=0;i<posStart;i++){
	    		if(i>0&&nums[i-1]!=nums[i] || i==0){
		    		for(int j=i+1;j<nums.length;j++){
		    			if(j>i+1&&nums[j-1]!=nums[j] || j==i+1){
			    			for(int k=j+1;k<nums.length;k++){
			    				if(nums[i]+nums[j]+nums[k]==0&&(k>j+1&&nums[k-1]!=nums[k] ||k==j+1)){
			    					list.add(Arrays.asList(nums[i], nums[j], nums[k]));
			    					break;
			    				}
			    			}
		    			}
		    		}
	    		}
	    	}
	    	return list;
	    }
	}
}
