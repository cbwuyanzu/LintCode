public class NthToLastNode {
	/**
	 * @param head
	 *            : The first node of linked list.
	 * @param n
	 *            : An integer.
	 * @return: Nth to last node of a singly linked list.
	 */
	ListNode nthToLast(ListNode head, int n) {
		// write your code here
		if (head == null)
			return null;
		ListNode first = head;
		ListNode second = head;
		int i = 1;
		while (first.next != null) {
			first = first.next;
			if (++i > n) {
				second = second.next;
			}
		}
		return second;
	}

	ListNode nthToLast2(ListNode head, int n) {
		// write your code here
		if (head == null)
			return null;
		int i = 1;
		ListNode candidate = head;
		while (candidate.next != null) {
			candidate = candidate.next;
			i++;
		}
		candidate = head;
		for (int j = 0; j < i - n; j++) {
			candidate = candidate.next;
		}
		return candidate;
	}
}
