package com.hell.mylife;

public class FindPostorder {
	public static void main(String[] args){
		
	}
	
	int search(int a[], int x, int n)
	{
	    for (int i = 0; i < n; i++)
	      if (a[i] == x)
	         return i;
	    return -1;
	}
	
	void printPostOrder(int in[], int pre[], int n, int rootIndexInPre)
	{
	   // The first element in pre[] is always root, search it
	   // in in[] to find left and right subtrees
	   int root = search(in, pre[rootIndexInPre], n);
	 
	   // If left subtree is not empty, print left subtree
	   if (root != 0)
	      printPostOrder(in, pre, root, rootIndexInPre+1);
	 
	   // If right subtree is not empty, print right subtree
	   if (root != n-1)
	      printPostOrder(in+root+1, pre+root+1, n-root-1);
	 
	   // Print root
	   System.out.println(pre[root]);
	}



}
