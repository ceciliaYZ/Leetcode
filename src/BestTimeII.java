
public class BestTimeII {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int [] n={3,2,6,5,0,3};
		System.out.println(Solution.maxProfit(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    
	    public static int maxProfit(int[] prices){
	    	if(prices.length<2) return 0;
	    	int min=prices[0],prof=0,maxProf=0;
	    	boolean inTrans=false;
	    	for(int i=1;i<prices.length;i++){
	    		if(prices[i]<prices[i-1]){
	    			min=prices[i];
	    			if(inTrans) {
	    				maxProf+=prof;
	    				inTrans=false;
	    			}
	    		}else{
	    			prof=prices[i]-min;
	    			inTrans=true;
	    		}
	    	}
	    	if(inTrans) 
	    		maxProf+=prof;
	    	return maxProf;
	    }
	}
}
