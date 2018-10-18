package com.anoop.tree;

public class CommonAncestor {
	
	public static boolean covers(TreeNode root, TreeNode p){
		if(root == null){
			return false;
		}
		if(root == p){
			return true;
		}
		
		return covers(root.left, p) || covers(root.right, p); 
	}
	
	public static TreeNode commonAnc(TreeNode root, TreeNode p, TreeNode q){
		
		if(root == null){
			return root;
		}
		boolean is_p_exist_in_Left = covers(root.left, p);
		boolean is_q_exist_in_left = covers(root.left, q);
		
		if(is_p_exist_in_Left != is_q_exist_in_left){
			return root;
		}
		
		TreeNode child_side = is_p_exist_in_Left ? root.left : root.right;
		return commonAnc(child_side, p, q);
	}
	public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (!covers(root, p) || !covers(root, q)) { // Error check - one node is not in tree
			return null;
		}
		return commonAnc(root, p, q);
	}	

}
