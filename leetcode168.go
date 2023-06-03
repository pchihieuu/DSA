package main

//168. Excel Sheet Column Title
//author: Phan Chi Hieu
func convertToTitle(columnNumber int) string {
	result := ""
	for columnNumber > 0 {
		temp := columnNumber % 26
		columnNumber = columnNumber / 26
		if temp == 0 {
			temp = 26
			columnNumber = columnNumber - 1

		}
		result = string(temp+'A'-1) + result
	}
	return result

}

// 701 % 26 = 25 + 65 - 1 => Y : 89
// 26 % 26 = 0 => 26 + 65 - 1 => Z : 90
// ZY
