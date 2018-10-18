package com.cci.questions.trees;

public class TreeTraversal {

	public void preOrder(TreeNode root){
		if(root != null){
			System.out.println(root.data+ " ");
			preOrder(root.left);			
			preOrder(root.right);
		}
	}
	
	public void inOrder(TreeNode root){
		if(root != null){
			inOrder(root.left);
			System.out.println(root.data+ " ");
			inOrder(root.right);
		}
	}
	public void postOrder(TreeNode root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data+ " ");			
		}
	}
}
