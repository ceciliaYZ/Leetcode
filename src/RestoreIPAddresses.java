import java.util.ArrayList;
import java.util.List;



public class RestoreIPAddresses {
	public static void main(String[] args){
		RestoreIPAddresses c=new RestoreIPAddresses();
		long start = System.currentTimeMillis();
		String s1="172162541";
		Solution s=c.new Solution();
		System.out.println(s.restoreIpAddresses(s1));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public List<String> restoreIpAddresses(String s) {
	    	List<String> result=new ArrayList<String>();
	    	int size=s.length();
	    	if(size>12||size<4) return result;
	    	List<String>[][] map=new ArrayList[size][4];
	    	for(int i=0;i<size;i++){
	    		for (int j=0;j<4;j++){
	    			map[i][j]=new ArrayList<String>();
	    		}
	    	}
	    	result.addAll(recursive(s,0,0,map));
	        return result;
	    }
	    public List<String> recursive(String s, int i, int j, List<String>[][] map){
	    	if(!map[i][j].isEmpty()) return map[i][j];
	    	List<String> result=new ArrayList<String>();
	    	String temp="";
	    	if(j==3){
	    		if((i==s.length()-1||s.charAt(i)!='0')
	    				&&Integer.valueOf(s.substring(i, s.length())).intValue()<=255) result.add(s.substring(i, s.length()));
	    	}else{
	    		int begin=s.length()-4+j,end=s.length()-10+3*j;
		    	for(int l=0;l<3&&i+l<s.length();l++){
			    	temp+=s.charAt(i+l);
			    	if(Integer.valueOf(temp).intValue()>255||(l>0&&temp.charAt(0)=='0')) break;
			    	if(i>begin-l||i<end-l) continue;
			    	List<String> result1=recursive(s,i+1+l,j+1,map);
		    		for(int k=0;k<result1.size();k++){
			    		result.add(temp+"."+result1.get(k));
			    	}
		    	}
	    	}
	    	if(!result.isEmpty()) map[i][j].addAll(result);
	    	return result;
	    }
	}
}
