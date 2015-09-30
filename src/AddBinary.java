
public class AddBinary {
	public static void main(String[] args){
		AddBinary c=new AddBinary();
		long start = System.currentTimeMillis();
		String s1="101";
		String s2="10";
		
		Solution s=c.new Solution();
		System.out.println(s.addBinary(s1,s2));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public String addBinary(String a, String b) {
	    	String result="";
	    	int aSize=a.length(), bSize=b.length();
	    	int next=0;
	        for(int i=0;i<Math.max(aSize, bSize)+1;i++){
	        	
	        	int temp=0;
	        	if(aSize-1-i<0&&bSize-1-i<0&&next>0) temp=1;
	        	else if(aSize-1-i<0&&bSize-1-i<0&&next==0) break;
	        	else if(aSize-1-i<0){
	        		 temp=b.charAt(bSize-1-i)-48+next;
	        	}else if(bSize-1-i<0){
	        		 temp=a.charAt(aSize-1-i)-48+next;
	        	}else  temp=a.charAt(aSize-1-i)+b.charAt(bSize-1-i)-96+next;
	        	
	        	if(temp>1) next=1;else next =0;
	        	result=temp%2+result;
	        }
	    	
	    	return result;
	        
	    }
	}
}
