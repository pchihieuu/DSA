package main

//189. Rotate Array
//author: Phan Chi Hieu
func rotate(nums []int, k int) {
	k = k % len(nums)
	reverse(&nums, 0, len(nums)-1)
	reverse(&nums, 0, k-1)
	reverse(&nums, k, len(nums)-1)
}
func reverse(s *[]int, start, end int) {
	for start < end {
		(*s)[start], (*s)[end] = (*s)[end], (*s)[start]
		start++
		end--
	}
}

//  1   2   3   4   5   6   7
//              ij
//  7   6   5   4   3   2   1
//  5   6   7   4   3   2   1   <- 0 -> k - 1
//  5   6   7   1   2   3   4   <- k -> n - 1
