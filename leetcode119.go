package main

//119. Pascal's Triangle II
//author: Phan Chi Hieu
func getRow(rowIndex int) []int {
	result := []int{1}
	for i := 1; i <= rowIndex; i++ {
		result = append(result, (result[i-1]*(rowIndex-i+1))/i)
	}
	return result
}
