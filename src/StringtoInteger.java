
public class StringtoInteger {
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String s=" b11228552307";
		System.out.println(Solution.myAtoi(s));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static int myAtoi(String str) {
	    	String dic="+-1234567890";
	    	String whitespace=" \t\n";
	    	int first=-1,last=-1;
	    	for(int i=0;i<str.length();i++){
	    		if(dic.indexOf(str.charAt(i))==-1&&whitespace.indexOf(str.charAt(i))==-1) return 0;
	    		if(first==-1&&dic.indexOf(str.charAt(i))>-1){
	    			first=i;
	    			last=first+1;
	    			while(last<str.length()&&str.charAt(last)<58&&str.charAt(last)>47){
	    				last++;
	    			}
	    			last--;
	    			break;
	    		}
	    	}
	    	if(first==-1) return 0;
	    	str=str.substring(first, last+1);
	    	
	    	char sign='+';
	    	if((str.charAt(0)=='-'||str.charAt(0)=='+')&&str.length()>1) {
	    		sign=str.charAt(0);
	    		str=str.substring(1, str.length());
	    	}else if((str.charAt(0)=='-'||str.charAt(0)=='+')&&str.length()<2) return 0;
	    
	    	if(str.length()>10&&sign=='-') return Integer.MIN_VALUE;
	    	else if(str.length()>10&&sign=='+') return Integer.MAX_VALUE;
	    	
	    	long result=(int)str.charAt(0)-48;
	    	for(int i=1;i<str.length();i++){
	    		result=result*10+((int)str.charAt(i)-48);
	    	}
	    	if(sign=='-'&&result-1>Integer.MAX_VALUE)return Integer.MIN_VALUE;
	    	else if(sign=='+'&&result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
	    	else if(sign=='-') return (int) -result;
	    	else return (int) result;
	    }
	}
}
