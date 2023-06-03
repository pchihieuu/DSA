package main

//172. Factorial Trailing Zeroes
//author: Phan Chi Hieu
func trailingZeroes(n int) int {
	result := 0
	for n != 0 {
		result += n / 5
		n = n / 5
	}
	return result
}

// 1!   => 1
// 2!   => 2
// 3!   => 6
// 4!   => 24
// 5!   => 120
// 6!   => 720
// 7!   => 5040
// 8!   => 40320
// 9!   => 362880
// 10!  => 3628800

// O(n / 5)
