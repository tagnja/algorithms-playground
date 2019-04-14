package com.taogen.ds;

import java.util.Stack;

/**
 * BinaryTree
 *     Node root;
 *
 */
public class BinaryTree 
{
	Node root;
	
	public BinaryTree()
	{}
	
	public BinaryTree(int data)
	{
		root = new Node(data);
	}
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		public Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}
	
	/*
	 * Binary Tree Example:
	 *         1
	 *     2       3
	 *   4   5   6
	 * result: 1 2 4 5 3 6
	 */
	public static void traversePreorder(Node root)
	{
		if (root != null)
		{
			System.out.print(root.data + " ");
			traversePreorder(root.left);
			traversePreorder(root.right);
		}
	}
	
	/*
	 * Binary Tree Example:
	 *         1
	 *     2       3
	 *   4   5   6
	 * result: 4 2 5 1 6 3
	 */
	public static void traverseInorder(Node root) 
	{
		Stack<Node> stack = new Stack<Node>();
		while (root != null)
		{
			stack.push(root);
			root = root.left;
		}
		while (! stack.isEmpty())
		{
			Node node = stack.pop();
			System.out.print(node.data + " ");
			traverseInorder(node.right);
		}
	}
	
	/*
	 * Binary Tree Example:
	 *         1
	 *     2       3
	 *   4   5   6
	 * result: 4 5 2 6 3 1
	 */
	public static void traversePostorder(Node root)
	{
		Stack<Node> stack = new Stack<Node>();
		while (root != null)
		{
			stack.push(root);
			root = root.left;
		}

		while (! stack.isEmpty())
		{
			Node node = stack.pop();
			if (node.right != null)
			{
				traversePostorder(node.right);
			}
			System.out.print(node.data + " ");
		}
	}
	
	/*
	 * Binary Tree Example:
	 *         1
	 *     2       3
	 *   4   5   6
	 * result: 1 2 3 4 5 6
	 */
	public static void traverseBFS(Node root)
	{
		int h = height(root);
		for (int i = 1; i <= h; i++)
		{
			printLevel(root, i);
		}
	}
	
	/*
	 * BFS help 
	 */
	public static int height(Node root)
	{
		if (root == null)
		{
			return 0;
		}
		else
		{
			int lheight = height(root.left);
			int rheight = height(root.right);
			if (lheight > rheight)
			{
				return (lheight + 1);
			}
			else
			{
				return (rheight + 1);
			}
		}
	}
	
	/*
	 * BFS help 
	 */
	public static void printLevel(Node root, int level)
	{
		if (root == null)
		{
			return;
		}
		else
		{
			if (level == 1)
			{
				System.out.print(root.data + " ");
			}
			else 
			{
				printLevel(root.left, level - 1);
				printLevel(root.right, level - 1);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		/*
		 *         1
		 *     2       3
		 *   4   5   6
		 */
		BinaryTree tree = new BinaryTree(1);
		Node root = tree.root;
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		traversePreorder(root); //result: 1 2 4 5 3 6
		System.out.println();
		traverseInorder(root); // result: 4 2 5 1 6 3
		System.out.println();
		traversePostorder(root); //result: 4 5 2 6 3 1
		System.out.println();
		traverseBFS(root);
		System.out.println();
	}
}
