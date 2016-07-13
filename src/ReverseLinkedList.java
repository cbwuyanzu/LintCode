public class ReverseLinkedList {
	/**
	 * @param head
	 *            : The head of linked list.
	 * @return: The new head of reversed linked list.
	 */
	public ListNode reverse(ListNode head) {
		// write your code here
		if (head == null || head.next == null)
			return head;
		ListNode pre = head;
		ListNode p = head.next;
		pre.next = null;
		while (p != null) {
			ListNode nxt = p.next;
			p.next = pre;
			pre = p;
			p = nxt;
		}
		return pre;
	}
}
