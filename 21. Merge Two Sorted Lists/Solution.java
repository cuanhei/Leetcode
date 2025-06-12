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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        else if(list1 == null) return list2;
        else if(list2 == null) return list1;
        else{
            ListNode first = (list1.val > list2.val)? list2: list1;
            ListNode main = first;
            ListNode another = (first == list1)? list2: list1;
            ListNode temp = null;
            while(true){
                //if(main.next == null && another.next == null) break;
                if(temp == null){
                    if(main.next != null)
                        temp = main.next;
                    
                }
                if(another == null){
                    main.next = temp;
                    break;
                }else if(temp == null){
                    main.next = another;
                    break;
                }
                if(temp.val > another.val){
                    main.next = another;
                    main = another;
                    if(another.next != null)
                        another = another.next;
                    else
                        another = null;
                }else{
                    main.next = temp;
                    main = temp;
                    temp = null;
                }
            }
            return first;
        }
    }
}