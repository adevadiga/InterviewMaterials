package com.anoop.tree;

public class TreeNodeQuestions {

	public static int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
		
	public static boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		int heightDiff  = getHeight(root.left) - getHeight(root.right);
		if(Math.abs(heightDiff) > 1 ){
			return false;
		}else{
			return isBalanced(root.left) && isBalanced(root.right);
		}
		
	}
	
	public static void BFS(TreeNode root){
		if(root != null){
			BFS(root.left);
			System.out.println(root.data);
			BFS(root.right);
		}
	}
	
	public static boolean checkBST(TreeNode root, Integer min, Integer max){
		
		if(root == null){
			return true;
		}
		
		if(min != null && root.data<=min || max !=null && root.data>max){
			return false;
		}
		
		if(!checkBST(root.left, min, root.data) ||
			!checkBST(root.right, root.data, max)	
			){
			return false;
		}
		
		return true;
	}
	
	
	public static TreeNode inOrderSuccessor(TreeNode root){
		if(root == null){
			return null;
		}
		
		if(root.parent == null || root.right != null){
			return leftMostChild(root.right);
		}else{
			TreeNode q = root;
			TreeNode x = root.parent;
			while(x != null && x.left !=q){
				q = x;
				x = x.parent;
			}
			
			return x;
		}
		
		
	}
	
	public static TreeNode leftMostChild(TreeNode root){
		if(root == null){
			return null;
		}
		while(root.left !=null){
			root = root.left;
		}
		return root;
	}
}
