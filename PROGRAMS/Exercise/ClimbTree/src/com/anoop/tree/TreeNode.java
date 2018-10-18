package com.anoop.tree;

public class TreeNode {
	
	public int data;
	TreeNode left;
	TreeNode right;
	TreeNode parent;
	int size = 0;
	
	public TreeNode(int data){
		this.data = data;
	}
	
	public int size(){
		return size;
	}
	
	public void setLeftNode(TreeNode left){
		this.left = left;
		if(left != null){
			left.parent = this;
		}
	}
	
	public void setRightNode(TreeNode right){
		this.right = right;
		if(right != null){
			right.parent = this;
		}
	}
	
	public int height(){
		int leftHeight = left != null ? left.height() : 0;
		int rightHeight = right != null ? right.height() : 0;
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public void insertInOrder(int d){
		
		if(d <= data){
			if(left == null){
				setLeftNode(new TreeNode(d));
			}else{
				left.insertInOrder(d);
			}
			
		}else{
			if(right == null){
				setRightNode(new TreeNode(d));
			}else{
				right.insertInOrder(d);
			}
		}
		size++;
	}
	
	public boolean isBST(){
		if(data < left.data || !left.isBST()){
			return false;
		}
		if(data > right.data || !right.isBST()){
			return false;
		}
		
		return true;
	}
	
	public TreeNode find(int d){
		if(this.data == d){
			return this;
		}else if(this.data < d){
			return this.left != null?this.left.find(d) : null;
		}else{
			return this.right != null?this.right.find(d) : null;
		}
		
	}
	
	private static TreeNode createMinimalBST(int arr[], int start, int end){
		if(end < start){
			return null;
		}
		int mid = (start+end)/2;
		TreeNode node = new TreeNode(arr[mid]);
		node.setLeftNode(TreeNode.createMinimalBST(arr, 0, mid-1));
		node.setRightNode(TreeNode.createMinimalBST(arr, mid+1, end));
		return node;
		
	}
	public static TreeNode createMinimalBST(int array[]) {
		return createMinimalBST(array, 0, array.length - 1);
	}

}
