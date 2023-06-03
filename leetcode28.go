package main

/// 28. Find the Index of the First Occurrence in a String
/* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
Constraints:
1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.*/
func strStr(hayStack string, needle string) int {
	if len(needle) == 0 {
		return 0

	}
	if len(hayStack) == 0 {
		return -1
	}
	for i := 0; i <= len(hayStack)-len(needle); i++ {
		if hayStack[i] == needle[0] {
			if len(needle) == 1 {
				return i
			}
			for j := 1; j < len(needle) && i+j < len(hayStack) && hayStack[i+j] == needle[j]; i++ {
				if j == len(needle)-1 {
					return i
				}
			}
		}

	}
	return -1
}
