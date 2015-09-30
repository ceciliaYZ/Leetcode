import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

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
		int k=3;
		int n=9;
		print(Solution.combinationSum3(k,n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static List<List<Integer>> combinationSum3(int k, int target)  {
	    	int [] candidates={1,2,3,4,5,6,7,8,9};
	    	List<List<Integer>> list=new ArrayList<List<Integer>>();
	    	if(k==0||target==0||target>(9-(k-1)/2)*k) return list;
	    	List <Integer> innerList=new ArrayList<Integer>();
    		int sum=0,i=0;
    		while(i<candidates.length){
    			if(candidates[i]>target){
    				i++;
    			}else {
    				sum+=candidates[i];
    				if(sum<target&&i<candidates.length-1){
						innerList.add(candidates[i]);
        				i++;
        				continue;
					}else if(sum==target&&innerList.size()==k-1){
        				List <Integer> temp=new ArrayList<Integer>();
        				temp.addAll(innerList);
        				temp.add(candidates[i]);
        				list.add(temp);
					}
					sum-=candidates[i];
					int count=0;
					while(!innerList.isEmpty()) {
						i=innerList.get(innerList.size()-1);
    					sum-=innerList.get(innerList.size()-1);
    					innerList.remove(innerList.size()-1);
    					count++;
    					if(i>=candidates.length) continue; 
    					else break;
					}
					if(count==0) i++;
				}
    		}
	        return list;
	    }
	}
}
