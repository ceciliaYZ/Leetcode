import java.util.ArrayList;
import java.util.List;



public class BinaryTreeInorderTraversal {
	public static void main(String[] args){
		BinaryTreeInorderTraversal c=new BinaryTreeInorderTraversal();
		Solution s=c.new Solution();
		long start = System.currentTimeMillis();
		TreeNode t=c.new TreeNode(1);
		System.out.println(s.inorderTraversal(t));
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
	public class Solution {
	    public List<Integer> inorderTraversal(TreeNode root) {
	    	List<Integer> result=new ArrayList<Integer>();
	    	
	    	
	    	
	    	
	    	return result;
	    	
	    }
	}
}
