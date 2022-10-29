/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {

        //判断数组是否为 99...999
        if (isMax(digits)) {
            digits = new int[digits.length + 1];//初始化时均为0
            digits[0] = 1;
            return digits;
        }

        add(digits, digits.length - 1);

        return digits;
    }

    private boolean isMax(int[] digits) {
        int i;
        for (i = 0; i < digits.length; i++)
            if (digits[i] != 9) return false;
//            单一出口写法
//            if (digits[i] != 9)
//                flag = false; break;
        return true;
    }

    private void add(int[] digits, int n) {
        if (digits[n] == 9) {
            digits[n] = 0;
            add(digits, n - 1);
        } else
            digits[n]++;
    }
}
// @lc code=end

