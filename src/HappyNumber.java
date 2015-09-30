import java.util.HashSet;



public class HappyNumber {
	public static void main(String[] args){
		HappyNumber c=new HappyNumber();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		int n=81;
		System.out.println(s.isHappy(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public boolean isHappy(int n) {
	    	if(n<=0) return false;
	    	HashSet<Integer> set=new HashSet<Integer>();
	    	while(set.add(n)){
	    		String s=Integer.toString(n);
	    		n=0;
	    		for(int i=0;i<s.length();i++){
	    			n=n+(int)Math.pow((int)s.charAt(i)-48, 2);
	    		}
	    	}
	    	
	    	if(set.add(1))  return false;
	    	else return true;
	    }
	}
}
