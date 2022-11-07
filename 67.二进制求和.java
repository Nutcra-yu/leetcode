/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
//我的题解
class Solution {
    public String addBinary(String a, String b) {
        // i j 指向字符串的最后一位
        int i = a.length() - 1, j = b.length() - 1;
        //ti t2 用于表示a b 对应当前位置
        int t1, t2;

        String c = "";
        //记录是否进位
        int flag = 0;
        while (i >= 0 || j >= 0) {

            /*对t1 t2进行初始化*/
            if (i < 0) t1 = 0;
            else t1 = a.charAt(i) - '0';
            if (j < 0) t2 = 0;
            else t2 = b.charAt(j) - '0';

            c = (t1 + t2 + flag) % 2 + c;
            if (t1 + t2 + flag >= 2) flag = 1;
            else flag=0;

            i--;
            j--;
        }
        if (flag == 1) c = "1" + c;
        return c;
    }
}
// //官方题解
// class Solution {
//     public String addBinary(String a, String b) {
//         //StringBuffer·
//         StringBuffer ans = new StringBuffer();

//         int n = Math.max(a.length(), b.length()), carry = 0;
//         for (int i = 0; i < n; ++i) {
//             carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
//             carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
//             ans.append((char) (carry % 2 + '0'));
//             carry /= 2;
//         }

//         if (carry > 0) {
//             ans.append('1');
//         }
//         ans.reverse();

//         return ans.toString();
//     }
// }


// @lc code=end

