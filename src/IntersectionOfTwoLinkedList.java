/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;      
 *     }
 * }
 */
public class IntersectionOfTwoLinkedList {
    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode 
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		int la = 1;
		int lb = 1;
		ListNode na = headA;
		ListNode nb = headB;
		while (na.next != null) {
			na = na.next;
			la++;
		}
		while (nb.next != null) {
			nb = nb.next;
			lb++;
		}
		int diff = la - lb;
		while (diff > 0){
			headA=headA.next;
			diff--;
		}
		while (diff<0){
			headB=headB.next;
			diff++;
		}
		while (headA !=null){
			if (headA==headB){
				return headA;
			}
			headA=headA.next;
			headB=headB.next;
		}
		return null;
	}
}