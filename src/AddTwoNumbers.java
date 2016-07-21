/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class AddTwoNumbers {
	/**
	 * @param l1:
	 *            the first list
	 * @param l2:
	 *            the second list
	 * @return: the sum list of l1 and l2
	 */
	public ListNode addLists(ListNode l1, ListNode l2) {
		// write your code here
		int carry = 0;
		ListNode l3 = new ListNode(0);
		ListNode l4 = l3;
		while (l1 != null || l2 != null) {
			int val1 = 0;
			if (l1 != null) {
				val1 = l1.val;
				l1 = l1.next;
			}
			int val2 = 0;
			if (l2 != null) {
				val2 = l2.val;
				l2 = l2.next;
			}
			int tmp = val1 + val2 + carry;
			l4.next = new ListNode(tmp % 10);
			carry = tmp / 10;
			l4 = l4.next;
		}
		if (carry == 1) {
			l4.next = new ListNode(1);
		}
		return l3.next;
	}
}