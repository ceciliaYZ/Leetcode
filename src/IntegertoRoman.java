
public class IntegertoRoman {
	public static void main(String[] args){
		IntegertoRoman c=new IntegertoRoman();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		int n=1;
		System.out.println(s.intToRoman(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public String intToRoman(int num) {
	        String result="";
	        String[] dic={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	        int[] n={1,4,5,9,10,40,50,90,100,400,500,900,1000};
	        for(int i=n.length-1;i>=0;i--){
	        	int temp=num/n[i];
	        	for(int j=0;j<temp;j++){
	        		result=result+dic[i];
	        		num-=n[i];
	        	}
	        }
	    	return result;
	    }
	}
}
