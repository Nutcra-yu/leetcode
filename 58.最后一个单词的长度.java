/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0, point = s.length() - 1;
        while (s.charAt(point) == ' ')
            point--;
        while (point>=0 && s.charAt(point) != ' ') {
            length++;
            point--;
        }
        return length;
    }
}
// @lc code=end

