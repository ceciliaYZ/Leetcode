

public class ZigZagConversion {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String s="PAYPALISHIRING";
		int n=3;
		System.out.println(Solution.convert(s,n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static String convert(String s, int numRows) {
	    	if(numRows<=1) return s;
	    	String result="";
	    	int temp=2*(numRows-1),size=s.length();
//	    	int s1=(int)Math.ceil((double)size/(double)(2*(numRows-1)));
	    	int s1=size/temp+1;
	    	for(int i=0;i<numRows;i++){
	    		for(int j=0;j<s1;j++){
    				int index=i+temp*j;
    				if(index>=size) break;
    				result=result+s.charAt( index );
    				
    				if(i<numRows-1&&i>0){
    					index=temp*(j+1)-i;
        				if(index>=size) break;
        				result=result+s.charAt( index );
    				}
    			}
	    	}
	    	return result;
	    	
	    }
	}
}
