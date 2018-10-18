package com.anoop.tree;



import org.junit.Assert;
import org.junit.Test;

public class TreeInterviewTest {

	@Test
	public void testFindParent(){
		int[] treeData= new int[]{1,2,3,4,5,6,7};
		TreeNode root = TreeNode.createMinimalBST(treeData);
		/*TreeNode parent = new TreeInterview().findParent(root, 1, 3);
		Assert.assertEquals(2, parent.data);*/
		Assert.assertEquals(4, new TreeInterview().findParent(root, 2, 6).data);
		Assert.assertNull( new TreeInterview().findParent(root, 1, 7));
	}
}
