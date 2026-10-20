/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       List<Integer> lists = new ArrayList<>();
       Integer temp = 0;
       while(l1 != null || l2 != null){

            if(l1 != null){
                temp += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                temp += l2.val;
                l2 = l2.next;
            }
            
            lists.add(temp%10);
            temp /=10;
        }

        if(temp != 0){
            lists.add(temp);
        }

        ListNode firstNode = null;
        ListNode next = null;

        for(int i = lists.size()-1; i >= 0; i--){
            next = firstNode;
            firstNode = new ListNode(lists.get(i), next);
        }
       return firstNode;
    }
}