package com.lazarus.episode1.intuit;

public class CommonAncestor {

	/*
	 * Check if p exist in the tree
	 */
	private boolean covers(TreeNode root, TreeNode p)
	{
		if(root == null) 
			return false;
		if(root == p)
			return true;
		return covers(root.left, p) || covers(root.right, p.right);
	}
	
	/*
	 * Find common ancestor of p and q
	 */
	public TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q)
	{
		if(!covers(root, p) || !covers(root, q))//p or q not in tree
			return null;
		
		return common(root, p, q);
	}
	
	private TreeNode common(TreeNode root, TreeNode p, TreeNode q)
	{
		if(root == null)
			return null;
		
		boolean is_p_exist_in_Left = covers(root.left, p);
		boolean is_q_exist_in_Left = covers(root.left, q);
		
		if(is_p_exist_in_Left != is_q_exist_in_Left)
			return root;
		
		TreeNode child_side = is_p_exist_in_Left ? root.left : root.right;
		return common(child_side, p, q);
	}
}
