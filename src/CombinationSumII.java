import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
	public static void print(List<List<Integer>> nums){
		for(int i=0;i<nums.size();i++){
			for(int j=0;j<nums.get(i).size() ;j++){
				System.out.print(nums.get(i).get(j)+",	");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		long start = System.currentTimeMillis();
//		int[] n={2,3,6,7};
		int[] n={3,1,3,5,1,1};
		int target=8;
		print(Solution.combinationSum2(n,target));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	
	
	public static class Solution {
	    public static List<List<Integer>> combinationSum2(int[] candidates, int target)  {
	    	Arrays.sort(candidates);
	    	List<List<Integer>> list=new ArrayList<List<Integer>>();
	    	List <Integer> innerList=new ArrayList<Integer>();
    		List <Integer> innerIndex=new ArrayList<Integer>();
    		int sum=0,i=0;
    		while(i<candidates.length){
    			if(candidates[i]>target){
    				i++;
    			}else {
    				sum+=candidates[i];
    				
    				if(sum<target&&i<candidates.length-1){
						innerList.add(candidates[i]);
        				innerIndex.add(i);
        				i++;
        				continue;
					}else if(sum==target){
        				List <Integer> temp=new ArrayList<Integer>();
        				temp.addAll(innerList);
        				temp.add(candidates[i]);
        				if(!list.contains(temp)){
        					list.add(temp);
        				}
					}
					sum-=candidates[i];
					int count=0;
					while(!innerList.isEmpty()) {
						i=innerIndex.get(innerIndex.size()-1)+1;
    					sum-=innerList.get(innerList.size()-1);
    					innerList.remove(innerList.size()-1);
    					innerIndex.remove(innerIndex.size()-1);
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
