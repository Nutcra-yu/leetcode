/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode sum = l1;
        ListNode last = sum;

        while (last != null) {
            if (last != l2)
                last.val += l2.val;
            if (last.val >= 10) {
                last.val %= 10;
                if (last.next == null)
                    if (l2.next != null)
                        last.next = l2.next;
                    else {
                        ListNode newnode = new ListNode(1, null);
                        last.next = newnode;
                    }
                last.next.val += 1;
            }

            last = last.next;
            l2 = l2.next;
        }

        return sum;

    }

    public ListNode reverse(ListNode list) {
        /*快慢结点*/

        ListNode node1 = list;

        //只有一个结点
        if (list.next == null)
            return node1;

        //只有两个结点
        ListNode node2 = list.next;
        if (node2.next == null) {
            node1.next = null;
            node2.next = node1;
            return node2;
        }

        //三个结点及以上
        ListNode node3 = node2.next;
        node1.next = null;
        while (node3.next != null) {
            node2.next = node1;

            node1 = node2;
            node2 = node3;
            node3 = node3.next;
        }
        node2.next = node1;
        node3.next = node2;

        return node3;
    }
}
// @lc code=end

