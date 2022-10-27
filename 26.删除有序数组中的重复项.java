/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = i + 1;

        while (j < nums.length) {
            if (nums[i] != nums[j])
                nums[++i] = nums[j];
            j++;
        }

        return i + 1;
    }
}
// @lc code=end

