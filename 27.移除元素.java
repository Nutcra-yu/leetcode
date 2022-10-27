/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;

        while (i < nums.length) {// i从头开始遍历，确保凑过头开始每一位数都是正确的
            if (nums[i] == val) {// 如果nums[i]为特定值,开始修改
                j = i;
                while (nums[j] == val) {// 循环使 j为i后的第一个非val数字
                    if (j == nums.length - 1)// 越界 return
                        return i;
                    else
                        j++;
                }
                nums[i] = nums[j];// 交换ij
                nums[j] = val;
            }
            i++;
        }
        return i;// 当数组中全为非val值是时通过此出口

    }
}
// @lc code=end
