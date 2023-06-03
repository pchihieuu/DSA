package main

// 67. Add Binary
/* Given two binary strings a and b, return their sum as a binary string.*/
func addBinary(a string, b string) string {
	i := len(a) - 1
	j := len(b) - 1
	result := ""
	var car byte = 0
	for i >= 0 || j >= 0 || car == 1 {
		if i >= 0 {
			car += a[i] - '0'
		}
		if j >= 0 {
			car += b[i] - '0'
		}
		result = string(car%2+'0') + result
		car = car / 2
		i--
		j--
	}
	return result
}
