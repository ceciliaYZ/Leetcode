

public class BestTime {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int [] n={4,1,2};
		System.out.println(Solution.maxProfit(n));
		System.out.println(Solution.maxProfit2(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static int maxProfit(int[] prices) {
	    	if(prices.length<2) return 0;
	    	int max=prices[0],min=prices[0],prof=0;;
	         for(int i=0;i<prices.length;i++){
	        	 int temp=findMax(prices,i);
	        	 min=Math.min(min, findMin(prices,i,temp));
	        	 prof=Math.max(prof, prices[temp]-min);
	        	 i=temp;
	         }
	    	return prof;
	    }
	    public static int findMax(int[]nums, int start){
	    	int max=nums[start],maxIndex=start;
	    	for(int i=start+1;i<nums.length;i++){
	    		if(max<=nums[i]) {
	    			max=nums[i];
	    			maxIndex=i;
	    		}
	    	}
	    	return maxIndex;
	    }
	    public static int findMin(int[]nums, int start, int end){
	    	int min=nums[start];
	    	for(int i=start+1;i<=end;i++){
	    		if(min>nums[i]) {
	    			min=nums[i];
	    		}
	    	}
	    	return min;
	    }
	    public static int maxProfit2(int[] prices){
	    	if(prices.length<2) return 0;
	    	int min=prices[0],prof=0,maxProf=0;
	    	for(int i=1;i<prices.length;i++){
	    		int temp=prof;
	    		prof=prices[i]-min;
	    		if(temp<prof){
	    			min=Math.min(min, prices[i-1]);
	    			maxProf=Math.max(maxProf, prices[i]-min);
	    		}
	    	}
	    	return maxProf;
	    }
	}
}
