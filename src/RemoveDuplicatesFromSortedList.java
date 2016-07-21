/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null){
            return null;
        }
        ListNode temp = head;
        while (temp.next != null){
            ListNode second = temp.next;
            if (temp.val == second.val){
                temp.next = second.next;
            }else{
                temp =second;
            }
        }
        return head;
    } 
}
