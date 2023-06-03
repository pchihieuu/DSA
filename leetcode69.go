package main

func mySqrt(x int) int {
	l := 0
	r := x
	for l < r {
		m := l + (r-l+1)/2
		if m*m > x {
			r = m - 1
		} else {
			l = m
		}
	}
	return l
}
