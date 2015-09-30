
public class BasicCalculatorII {
	public static void main(String[] args){
		BasicCalculatorII c=new BasicCalculatorII();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		String s1="3+2*2-4/2+3*4+2+1";
		System.out.println(s.calculate(s1));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	
	public class Solution {
	    public int calculate(String s) {
	        s=s.replaceAll(" ","");
	        String[] nums=s.split("\\*|\\+|-|/");
	        String ops=s.replaceAll("1|2|3|4|5|6|7|8|9|0", "");
	        int preI=0,curI=1;
	        int preNum=Integer.valueOf(nums[preI]).intValue();
	        while(preI<ops.length()){
	        	int curNum=Integer.valueOf(nums[curI]).intValue();
	        	while(curI<ops.length()
	        			&&(ops.charAt(preI)=='+'||ops.charAt(preI)=='-')
	        			&&(ops.charAt(curI)=='*'||ops.charAt(curI)=='/')){
	        		curNum=process(curNum,Integer.valueOf(nums[curI+1]),ops.charAt(curI));
	        		curI++;
	        	}
	        	preNum=process(preNum,curNum,ops.charAt(preI));
	        	preI=curI;
	        	curI++;
	        }
	        return Integer.valueOf(preNum).intValue();
	    }
	    public int process(int n1,int n2,char op){
	    	switch(op){
	    	case '+':
	    		return n1+n2;
	    	case '-':
	    		return n1-n2;
	    	case '*':
	    		return n1*n2;
	    	case '/':
	    		return n1/n2;
	    	default: return 0;
	    	}
	    }
	}
}
