package com.cci.questions.trees;

public class CreateBinaryTreeWithMinimalHeightUsingSortedArray {

	/*Algorithm:
		1. Insert into the tree the middle element of the array.
		2. Insert (into the left subtree) the left subarray elements
		3. Insert (into the right subtree) the right subarray elements
		4. Recurse
	 */
	public TreeNode addToTree(int[] a, int start, int end){
		if(end < start){
			return null;
		}
		int mid = (start+end)/2;
		TreeNode n = new TreeNode(a[mid]);
		n.left = addToTree(a, start, mid-1);
		n.right = addToTree(a, mid+1, end);
		return n;
	}
}
