
public class SortColors {
	public static void main(String[] args){
		int[] n={2,1,0,1,2,1,0};
		int[] result=Solution.sortColors(n);
		for(int i=0;i<n.length;i++){
//			for(int j=0;j<n.length;j++)
				System.out.print(result[i]);
//			System.out.println(" ");
		}
		System.out.println("Done");
	}
	public static class Solution {
	    public static int[] sortColors(int[] nums) {
	    	int size=nums.length,begin=0;
	    	for(int i=0;i<size;){
	    		if(begin==size-1) break;
	    		else if(nums[i]==0){
	    			int temp=nums[i];
	    			nums[i]=nums[begin];
	    			nums[begin]=temp;
	    			begin++;
	    			i++;
	    		}else if(nums[i]==2){
	    			int temp=nums[i];
	    			nums[i]=nums[size-1];
	    			nums[size-1]=temp;
	    			size--;
	    		}else i++;
	    	}
	    	return nums;
	    }
	}
}
