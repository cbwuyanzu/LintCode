
public class MergeTwoSortedList {
	/**
	 * @param ListNode
	 *            l1 is the head of the linked list
	 * @param ListNode
	 *            l2 is the head of the linked list
	 * @return: ListNode head of linked list
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// write your code here
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		int v1 = l1.val;
		int v2 = l2.val;
		ListNode head = v1 < v2 ? l1 : l2;
		ListNode pointer = head;
		while (l1 != null || l2 != null) {
			ListNode temp;
			if (l1 == null) {
				temp = l2;
				l2 = l2.next;
			}
			if (l2 == null) {
				temp = l1;
				l1 = l1.next;
			}
			if (l1.val < l2.val) {
				temp = l1;
				l1 = l1.next;
			} else {
				temp = l2;
				l2 = l2.next;
			}
			pointer.next = temp;
			pointer = pointer.next;
		}
		return head;
	}
}
