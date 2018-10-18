package com.cci.questions.trees;

public class InOrderSuccessor {

	public TreeNode inOrderSuccessor(TreeNode e){
		if(e != null){
			
			TreeNode p = null;
			if(e.parent == null || e.right != null){
				p = findLeftMostChild(e.right);
			}else{
				
				while( (p = e.parent) != null){
					//If found left
					if(p.left == e){
						break;
					}
					e = p;
				}
			}
			return p;
		}
		
		return null;
	}
	
	public TreeNode findLeftMostChild(TreeNode root){
		if(root == null) return null;
		while(root.left != null){
			root = root.left;
		}
		return root;
	}
}
