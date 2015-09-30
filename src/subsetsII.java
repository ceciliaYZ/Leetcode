import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class subsetsII {
	public static void main(String[] args){
		int [] nums={1,2,2};
		List<List<Integer>> result=Solution.subsetsWithDup(nums);
		for(int i=0;i<result.size();i++){
			for(int j=0;j<result.get(i).size();j++){
			System.out.print(result.get(i).get(j));
			}
			System.out.println(" ");
		}
		System.out.println("Done");
	}
	public static class Solution {
	    public static List<List<Integer>> subsetsWithDup(int[] nums) {
	    	List<List<Integer>> sub = new ArrayList<List<Integer>>();
			Arrays.sort(nums);
			int n=nums.length;
			int preNum=-1;
			int preM=0;
			sub.add(new ArrayList<Integer>());
			for(int i=n-1;i>=0;i--){
				int m=sub.size();
				if(nums[i]==preNum){
					for(int j=0;j<m-preM;j++){
						List<Integer> inlist=new ArrayList<Integer>();
						inlist.add(nums[i]);
						inlist.addAll(sub.get(j+preM));
						System.out.println(j+" "+preM+" "+m);
						sub.add(inlist);
					}
				}else{
					for(int j=0;j<m;j++){
						List<Integer> inlist=new ArrayList<Integer>();
						inlist.add(nums[i]);
						inlist.addAll(sub.get(j));
						sub.add(inlist);
					}
				}
				preM=m;
				preNum=nums[i];
			}
			return sub;
	        
	    }
	}
}
