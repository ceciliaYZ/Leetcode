import java.util.ArrayList;
import java.util.List;


public class ConstructBinaryTreePI {
	public static void print(TreeNode root){
//		
//		while(true){
//			System.out.print(root.val);
//			if(root.left!=null){
//				root=root.left;
//			}else if(root.right!=null) {
//				root=root.right;
//			}else 
//		}
//		
//		
//		for(int i=0;i<nums.length;i++){
//				System.out.print(nums[i]+",	");
//		}
//		System.out.println(" ");
	}
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		int[] n={1,2,4,7,8,5,3,11,6,9,10};
		int[] m={7,4,8,2,5,1,11,3,9,10,6};
		TreeNode result=Solution.buildTree(n,m);
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
		
	    public static TreeNode buildTree(int[] preorder, int[] inorder) {
	    	if(preorder.length==0) return null;
	    	TreeNode root = new TreeNode(preorder[0]);
	    	TreeNode preNode=root;
	    	List<TreeNode> list= new ArrayList<TreeNode> ();
	    	list.add(root);
	    	for(int i=1;i<preorder.length;i++){
	    		TreeNode curNode = new TreeNode(preorder[i]);
	    		list.add(curNode);
	    		int curI=findElement(inorder,preorder[i]);
	    		int preI=findElement(inorder,preorder[i-1]);
	    		if(curI<preI){
	    			preNode.left=curNode;
	    		}else{
	    			int j=curI-1;
	    			TreeNode temp=searchList(list,inorder[j]);
	    			
	    			while(temp==null) temp=searchList(list,inorder[--j]);
	    			temp.right=curNode;
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
