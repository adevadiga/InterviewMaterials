package com.anoop.tree;

public class ContainsTree {

	public boolean containsTree(TreeNode t1, TreeNode t2){
		if(t2 == null){
			return true;
		}
		return isSubTree(t1, t2);
	}
	public boolean isSubTree(TreeNode t1, TreeNode t2){
		if(t1 == null){
			return false;
		}
		if(t1.data == t2.data){
			if(matchTree(t1, t2)){
				return true;
			}
		}
		return isSubTree(t1.left, t2) || isSubTree(t1.right, t2);
	}
	
	public boolean matchTree(TreeNode t1, TreeNode t2){
		if(t1 == null && t2 == null){
			return true;
		}
		if(t1 == null || t2 == null){
			return false;
		}
		
		if(t1.data != t2.data){
			return false;
		}  
		return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
		
	}
}
