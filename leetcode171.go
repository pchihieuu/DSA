package main

//171. Excel Sheet Column Number
//author: Phan Chi Hieu
func titleToNumber(columnTitle string) int {
	result := 0
	n := 1
	for i := len(columnTitle) - 1; i >= 0; i-- {
		temp := int(columnTitle[i]-'A') + 1
		result += temp * n
		n = n * 26
	}
	return result
}

// Z Y
// Y * 26 ^ 0 + Z * 26 ^ 1 = 25 * 26 ^ 0 + 26 * 26 ^ 1 = 701

// X Z Y
// 701 + X * 26 ^ 2 = 16925
// O(N)
// O(1)
