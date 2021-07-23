


// Definition for a binary tree node.
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}


	public static void main(String[] args) {

		MaxDepthBinaryTree obj=new MaxDepthBinaryTree();

		int result=obj.maxDepth({3,9,20,null,null,15,7});

		System.out.println(result);
	}
}


class MaxDepthBinaryTree {


	public int maxDepth(TreeNode root) {


		if (root==null) {
			return 0;
		}

		return 1+Math.max(maxDepth(root.left),maxDepth(root.right));

	}

}