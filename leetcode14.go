package main

/// 14. Longest Common Prefix///
/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".


Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.*/
func logestCommonPrefix(str []string) string {
	if len(str) == 0 {
		return ""
	}
	if len(str) == 1 {
		return str[0]
	}
	index := 0
	for {
		for i := 1; i < len(str); i++ {
			if index >= len(str[i-1]) || index >= len(str[i]) || str[i-1][index] != str[i][index] {
				return str[0][:index]
			}
		}
		index++

	}
	// return str[0][:index]//
}
