import java.util.Arrays;


public class HIndex {
	public static void main(String[] args){
		HIndex c=new HIndex();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		int[] n={100};
		System.out.println(s.hIndex(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public int hIndex(int[] citations) {
	        Arrays.sort(citations);
	        int len=citations.length;
	        for(int i=0;i<len;i++){
	        	if(i==0&&citations[i]>=len-i) return len-i;
	        	else if(len-i<=citations[i]&&citations[i-1]<=len-i) return len-i;
	        }
	    	return 0;
	    }
	}
}
