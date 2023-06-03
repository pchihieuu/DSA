package main

//125. Valid Palindrome
//author: Phan Chi Hieu//

func Palindrome(s string) bool {
	left := 0
	right := len(s) - 1
	for left < right {
		if !isAlphanumeric(s[left]) {
			left++
			continue
		}
		if !isAlphanumeric(s[right]) {
			right--
			continue
		}
		if upperCase(s[left]) != upperCase(s[right]) {
			return false
		}
		left++
		right--
	}
	return true
}
func isAlphanumeric(char byte) bool {
	return (char >= '0' && char <= '9') || (char >= 'a' && char <= 'z') || (char >= 'A' && char <= 'Z')
}
func upperCase(char byte) byte {
	if char >= 'a' && char <= 'z' {
		return char - 32
	}
	return char
}
