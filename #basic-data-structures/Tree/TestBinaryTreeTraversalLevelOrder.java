
public class BinaryTreeTraversalTest
{
	public static void traverseLevelOrder(TreeNode root)
	{
		if (root == null)
		{
			return;
		}
		int height = height(root);
		for (int i = 1; i <= height; i++)
		{
			printLevel(root, i);
		}
		return;
	}
	
	public static int height(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		if (lHeight > rHeight)
		{
			return 1 + height(root.left);
		}
		else
		{
			return 1 + height(root.right);
		}
	}
	
	public static void printLevel(TreeNode root, int level)
	{
		if (root == null)
		{
			return;
		}
		if (level == 1)
		{
			System.out.print(root.data + " ");
		}
		else
		{
			printLevel(root.left, level -1);
			printLevel(root.right, level - 1);
		}
	}
	
	public static void main(String[] args)
	{
		/*
		 * Example Tree
         *		 
		 *         1
		 *     2       3
		 *   4   5   6
		 */
		BinaryTree tree = new BinaryTree(1);
		TreeNode root = tree.root;
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		traverseLevelOrder(root);
		return;
	}
}