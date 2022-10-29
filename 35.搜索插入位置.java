/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] >= target) return 0;
        else {
            int slow = 0, fast = 1;
            while (fast < nums.length) {
                if (nums[slow] < target && nums[fast] < target) {
                    fast++;
                    slow++;
                } else
                    return fast;
            }
            return nums.length;
        }
    }
}
// @lc code=end

