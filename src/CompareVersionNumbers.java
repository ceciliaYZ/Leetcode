
public class CompareVersionNumbers {
	public static void main(String[] args){
		CompareVersionNumbers c=new CompareVersionNumbers();
		long start = System.currentTimeMillis();
		String s1="1";
		String s2="1.1";
		
		Solution s=c.new Solution();
//		System.out.println(s.find(s2)[0]);
		System.out.println(s.compareVersion(s1,s2));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	
	public class Solution {
	    public int compareVersion(String version1, String version2) {
	    	String[] s1=version1.split("\\."),s2=version2.split("\\.");
	    	for(int i=0;i<Math.min(s1.length, s2.length);i++){
	    		int a=find(s1[i]),b=find(s2[i]);
	    		if(a>b) return 1;
	    		else if(a<b) return -1;
	    	}
	    	if(s1.length> s2.length) {
	    		for(int i=s2.length;i<s1.length;i++){
	    			if(find(s1[i])>0) return 1;
	    		}
	    		return 0;
	    	}
	    	else if(s1.length< s2.length){
	    		for(int i=s1.length;i<s2.length;i++){
	    			if(find(s2[i])>0)return -1;
	    		}
	    		return 0;
	    	}
	    	else return 0;
	    }
	    public int find(String s){
	    	int result=0;
	    	for(int i=0;i<s.length();i++){
	    		result=result*10+(int)s.charAt(i)-48;
	    	}
	    	return result;
	    }
	}
	
}
	
