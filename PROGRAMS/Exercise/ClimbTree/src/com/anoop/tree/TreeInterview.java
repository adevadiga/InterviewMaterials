package com.anoop.tree;

public class TreeInterview {

	/*
	 * Given two numbers find parent in binary search tree
	 */
	public TreeNode findParent(TreeNode root, int m, int n){
		if(root == null || root.left == null || root.right == null){
			return null; //Does not exist
		}
		if(m > root.data && n > root.data){
			return findParent(root.right,m,n);
		}else if(m < root.data && n < root.data){
			return findParent(root.left, m, n);
		}else if( (root.left.data == m && root.right.data == n) || 
			    	(root.left.data == n && root.right.data == m)
				){
			return root;
		}
		return null;
	}
}
