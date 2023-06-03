package main

//122. Best Time to Buy and Sell Stock II
//author: Phan Chi Hieu
func maxProfit(prices []int) int {
	result := 0
	for i := 1; i < len(prices); i++ {
		if prices[i] > prices[i-1] {
			result += prices[i] - prices[i-1]
		}
	}
	return result
}

//^
//|
//|
//|  x
//|              x
//|       x
//|               x
//|         x
//|   x
//|-------------------------->
// 1  2  3  4  5  6
