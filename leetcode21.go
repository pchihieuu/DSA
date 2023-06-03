package main

/// 21. Merge Two Sorted Lists
/* You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.*/
type ListNode struct {
	Val  int
	Next *ListNode
}

func mergeTwoSortList(list1 *ListNode, list2 *ListNode) *ListNode {
	var head ListNode
	prev := &head
	for list1 != nil && list2 != nil {
		if list1.Val < list2.Val {
			prev.Next = list1
			list1 = list1.Next
		} else {
			prev.Next = list2
			list2 = list2.Next
		}
		prev = prev.Next

	}
	if list1 != nil {
		prev.Next = list1
	}
	if list2 != nil {
		prev.Next = list2
	}
	return head.Next
}
