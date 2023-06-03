package main

//107. Binary Tree Level Order Traversal II
//author: Phan Chi Hieu
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func levelOrderBottom(root *TreeNode) [][]int {
	if root == nil {
		return [][]int{}
	}
	result := [][]int{}
	queue := []*TreeNode{root}
	for len(queue) > 0 {
		n := len(queue)
		temp := []int{}
		for i := 0; i < n; i++ {
			pop := queue[0]
			queue = queue[1:]
			temp = append(temp, pop.Val)
			if pop.Left != nil {
				queue = append(queue, pop.Left)
			}
			if pop.Right != nil {
				queue = append(queue, pop.Right)
			}
		}
		result = append(result, temp)
	}
	for i, j := 0, len(result)-1; i < j; i, j = i+1, j-1 {
		result[i], result[j] = result[j], result[i]
	}
	return result
}
