package main

//110. Balanced Binary Tree
//author: Phan Chi Hieu
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func isBalanced(root *TreeNode) bool {
	if root == nil {
		return true
	}
	diff := getDepth(root.Left) - getDepth(root.Right)
	if diff > 1 || diff < -1 {
		return false
	}
	return isBalanced(root.Left) && isBalanced(root.Right)
}
func getDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	leftDepth := getDepth(root.Left)
	rightDepth := getDepth(root.Right)

	if leftDepth > rightDepth {
		return leftDepth + 1
	} else {
		return rightDepth + 1
	}

}
