public class LinkedListCycle {
	/**
	 * @param head
	 *            : The first node of linked list.
	 * @return: True if it has a cycle, or false
	 */
	public boolean hasCycle(ListNode head) {
		// write your code here
		if (head == null || head.next == null || head.next.next == null) {
			return false;
		}
		ListNode fast = head.next.next;
		ListNode slow = head;
		while (fast != slow) {
			if (fast.next == null || fast.next.next == null) {
				return false;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		return true;
	}
}
