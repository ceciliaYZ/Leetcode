import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class WordLadderII {
	public static void print(List<List<String>> nums){
		if(nums!=null) {
			for(int i=0;i<nums.size();i++){
				System.out.print(nums.get(i)+"	,");
	        }
			System.out.println(" ");
		}
	}
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		String s="qa";
		String e="sq";
		String[] string={"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"};
		Set<String> dict=new HashSet<String>();
		dict.addAll(Arrays.asList(string));
		
		print(Solution.findLadders(s,e,dict));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class Solution {
	    public static List<List<String>> findLadders(String start, String end, 
	    		Set<String> dict){
	    	List<List<String>> list= new ArrayList <List<String>>();
	    	List<String> dictionary=new ArrayList <String>();
	    	Iterator<String> ite=dict.iterator();
	    	
//	    	String[] string= (String[]) dict.toArray(new String[dict.size()]);
//	    	System.out.println(string[string.length-1]);
//	    	
	        while(ite.hasNext()){
	        	dictionary.add(ite.next());
	        }
	        dictionary.add(0,start);
	        dictionary.add(dictionary.size(),end);
	        int size=dictionary.size();
	        int[][] table=new int[size][size];
	        for(int i=0;i<size;i++){
	        	for(int j=0;j<size;j++){
	        		table[i][j]=match(dictionary.get(i),dictionary.get(j));
	        	}
	        }
	        System.out.print("	,");
	        for(int i=0;i<size;i++)
	        	System.out.print(dictionary.get(i)+"	");
	        System.out.println("	");
	        for(int i=0;i<size;i++){
	        	System.out.print(dictionary.get(i)+"	");
	        	for(int j=0;j<size;j++){
	        		
	        		System.out.print(table[i][j]+"	,");
	        	}
	        	System.out.println(" ");
	        }
	        List<String> innerList=new ArrayList <String>();
	        innerList.add(start);
	        recursive(0,table,dictionary,innerList,list);
//	        list.add(dictionary);
	        int shortest=dictionary.size();
	        for(int i=0;i<list.size();i++){
	        	if(list.get(i).size()<shortest) shortest=list.get(i).size();
	        }
	        List<List<String>> result= new ArrayList <List<String>>();
	        for(int i=0;i<list.size();i++){
	        	if(list.get(i).size()==shortest) 
	        		result.add(list.get(i));
	        }
	    	return result;
	    }
	    
	    public static int match(String a, String b){
	    	int result=0;
	    	for(int i=0;i<a.length();i++){
	    		if(a.charAt(i)!=b.charAt(i)) result++;
	    	}
	    	result=result>1?-1:result;
	    	return result;
	    }
	    public static void recursive(int j,int[][] table,List<String> dict,
	    		List<String> innerList,List<List<String>> list){
//	    	List<String> result=new ArrayList <String>();
	    	if(table[table.length-1][j]==1) {
	    		innerList.add(dict.get(table.length-1));
	    		list.add(innerList);
	    	}
	    	else{
	    		Stack<Integer> s=new Stack<Integer>();
	    		for(int i=1;i<table.length-1;i++){
	    			if(table[i][j]==1&&!innerList.contains(dict.get(i))){
	    				s.push(i);
		    		}
	    		}
	    		
	    		while(!s.isEmpty()){
	    			int u=s.pop();
//	    			List<String> temp=new ArrayList <String>();
	    			List<String> temp=new ArrayList <String>();
		    		temp.addAll(innerList);
	    			temp.add(dict.get(u));
	    			recursive(u,table,dict,temp,list);
	    		}
	    	}
	    	
//	    	return result;
	    }
	    
	}
}
