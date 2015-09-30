import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class CountPrimes {
	public static void main(String[] args){
		CountPrimes c=new CountPrimes();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
//		int n=999983;
		int n=20;
		System.out.println(s.countPrimes(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public int countPrimes(int n) {
	    	
	    	if(n<2) return 0;
	        int result=0;
	        boolean[] nonprime=new boolean[n];
	        for(int i=2;i<n;i++){
	        	if(!nonprime[i]){
	        		result++;
	        		for(int j=i;j<n/i+1;j++){
	        			int temp=i*j;
	        			if(temp>0&&temp<n) nonprime[temp]=true;
	        		}
	        	}
	        }
	    	return result;
	    }
	}
}
