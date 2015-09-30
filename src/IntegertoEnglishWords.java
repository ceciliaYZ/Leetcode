

public class IntegertoEnglishWords {
	public static void main(String[] args){
		IntegertoEnglishWords c=new IntegertoEnglishWords();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		int n=10;
		System.out.println(s.numberToWords(n));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class Solution {
	    public String numberToWords(int num) {
	    	if(num==0) return "Zero";
	    	String result="";
	    	String[] level1={"Billion","Million","Thousand",""};
	    	int[] n={1000000000,1000000,1000,1};
	    	for(int i=0;i<n.length;i++){
	    		int temp=num/n[i];
	    		String ts="";
	    		if(temp>0) {
	    			ts=numHundred(temp);
	    			result+=" "+ts+" "+level1[i];
	    			num-=n[i]*temp;
	    		}
	    	}
	    	return result.trim();
	    }
	    public String numHundred(int num){
	    	String result="";
	    	int[] n={100,10,1};
	    	String[] level2={"Hundred"};
	    	String[] level3={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	    	String[] level5={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	    	String[] level4={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	    	for(int i=0;i<3;i++){
	    		int temp=num/n[i];
	    		if(temp>0&&i==0) result+=" "+level4[temp]+" "+level2[i];
	    		else if(temp>0&&i==1) {
	    			if(temp>1) result+=" "+level3[temp];
	    			else {
	    				result+=" "+level5[num-10];
	    				break;
	    			}
	    		}
	    		else if(temp>0&&i==2) result+=" "+level4[temp];
	    		num-=temp*n[i];
	    	}
	    	
	    	return result.trim();
	    }
	}
}
