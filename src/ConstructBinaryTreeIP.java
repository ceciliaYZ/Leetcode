import java.util.ArrayList;
import java.util.List;


public class ConstructBinaryTreeIP {
	
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		
		int[] inorder={7,4,8,2,5,1,11,3,9,10,6};
		int[] postorder={7,8,4,5,2,11,10,9,6,3,1};
		TreeNode result=Solution.buildTree(inorder,postorder);
		long end = System.currentTimeMillis();
		System.out.println("took: "+(end-start));
	}
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      public TreeNode(int x) { val = x; }
	  }
	  
	 
	public static class Solution {
	    public static TreeNode buildTree(int[] inorder,int[] postorder) {
	    	if(postorder.length==0) return null;
	    	TreeNode root = new TreeNode(postorder[postorder.length-1]);
	    	TreeNode preNode=root;
	    	List<TreeNode> list= new ArrayList<TreeNode> ();
	    	list.add(root);
	    	for(int i=postorder.length-2;i>=0;i--){
	    		TreeNode curNode = new TreeNode(postorder[i]);
	    		list.add(curNode);
	    		int curI=findElement(inorder,postorder[i]);
	    		int preI=findElement(inorder,postorder[i+1]);
	    		if(curI>preI){
	    			preNode.right=curNode;
	    		}else{
	    			int j=curI+1;
	    			TreeNode temp=searchList(list,inorder[j]);
	    			
	    			while(temp==null) temp=searchList(list,inorder[++j]);
	    			temp.left=curNode;
	    		}
	    		preNode=curNode;
	    	}
	    	return root;
	    }
	    public static int findElement(int[] nums, int n){
	    	for(int i=0;i<nums.length;i++){
	    		if(nums[i]==n) return i;
	    	}
	    	return -1;
	    }
	    public static TreeNode searchList(List list, int n){
	    	for(int i=0;i<list.size();i++){
	    		if(((TreeNode)list.get(i)).val==n) return (TreeNode)list.get(i);
	    	}
	    	return null;
	    }
	}
}
