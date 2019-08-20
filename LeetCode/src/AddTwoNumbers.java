import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode head = root;
        int carry = 0;
        while(true)
        {
            if(l1==null && l2==null)
                break;
            int l1Value = l1!=null ? l1.val :0;
            int l2Value = l2!=null ? l2.val :0;
            int sum =  (carry+ l1Value+l2Value)%10;
            carry = (sum)/10; 
            root.next= new ListNode(sum);
            root = root.next;
            l1= l1!=null ? l1.next : null;
            l2= l2!=null ? l2.next : null;
        }
        if(carry!=0)
            root.next = new ListNode(carry);
        return head.next;
    }
}
