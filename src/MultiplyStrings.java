
public class MultiplyStrings {
	public static void main(String[] args){
		MultiplyStrings c=new MultiplyStrings();
		long start = System.currentTimeMillis();
		String s1="99";
		String s2="99";
		Solution s=c.new Solution();
		System.out.println(s.multiply(s1,s2)+" "+Integer.valueOf(s1).intValue()*Integer.valueOf(s2).intValue());
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public String multiply(String num1, String num2) {
	    	if(num1=="0"||num2=="0") return "0";
	        String result="";
	        String zero= "";
	        for(int i=num2.length()-1;i>=0;i--){
	        	String curString=singleMul(num1,num2.charAt(i));
	        	result=plus(curString+zero,result);
	        	zero+='0';
	        }
	        if(!result.isEmpty()&&result.charAt(0)=='0'){
	        	int i=0;
	        	while(i<result.length()&&result.charAt(i)=='0') i++;
	        	result=result.substring(i-1, result.length());
	        }
	    	return result;
	    }
	    public String singleMul(String num,char c){
	    	if(c=='0') return "0";
	    	String result="";
	    	int carry=0, n=(int)c - 48;
	        for(int i=num.length()-1;i>=0;i--){
	        	int temp=((int)num.charAt(i) - 48)*n+carry;
	        	result=temp%10+result;
	        	carry=(temp-temp%10)/10;
	        }
	        if(carry>0) result=carry+result;
	    	return result;
	    }
	    public String plus(String longString, String shortString){
	    	String result="";
	    	if(longString.length()<shortString.length()){
	    		String temp=longString;
	    		longString=shortString;
	    		shortString=temp;
	    	}
	        int carry=0;
	        for(int i=0;i<longString.length();i++){
	        	int np=(int)longString.charAt(longString.length()-1-i)-48;
	        	int nc=shortString.length()-i >0 ? (int)shortString.charAt(shortString.length()-1-i)-48: 0;
	        	result=(np+nc+carry)%10+result;
	        	carry=(np+nc+carry-(np+nc+carry)%10)/10;
	        }
	        if(carry>0) result=carry+result;
	    	return result;
	    }
	}
}
