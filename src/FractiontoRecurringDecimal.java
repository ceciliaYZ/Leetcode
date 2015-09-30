import java.util.LinkedHashMap;


public class FractiontoRecurringDecimal {
	public static void main(String[] args){
		FractiontoRecurringDecimal c=new FractiontoRecurringDecimal();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		int n1=-1,n2=-2147483648;
		System.out.println(7/(-12));
		System.out.println(s.fractionToDecimal(n1,n2));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public String fractionToDecimal(int numerator, int denominator) {
	    	if(denominator==0) return "0";
	        String result="";
	        LinkedHashMap<Long,Integer> map=new LinkedHashMap<Long,Integer>();
	        long rep=-1,last=-1;
	        if(numerator<0&&denominator>0||denominator<0&&numerator>0) {
	        	result+='-';
	        }
	        long n=Math.abs((long)numerator);
        	long d=Math.abs((long)denominator);
	        result+=n/d+".";
	        n=n%d * 10;
	        while(true){
	        	int f=(int)(n/d);
	        	long r=(n%d);
	        	if(r==0) {
	        		map.put(r,f);
	        		break;
	        	}
	        	else if(map.containsKey(r)) {
	        		rep=r;
	        		if(map.get(r)!=f) last=f;
	        		break;
	        	}else{
	        		map.put(r,f);
	        	}
	        	n=r*10;
	        }
	        for(long num:map.keySet()){
	        	int value=Math.abs(map.get(num));
	        	if(rep!=num)result+=value;
	        	else {
	        		if(last!=-1) result+=value+"(";
	        		else result+="("+value;
	        	}
	        }
	       if(last!=-1) result+=last;
	       if(rep!=-1) result+=")";
	       else if(!result.isEmpty()&&result.charAt(result.length()-1)=='0') result=result.substring(0, result.length()-2);
	       return result;
	    }
	}
}
