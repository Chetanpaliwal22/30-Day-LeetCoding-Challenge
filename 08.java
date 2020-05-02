/*
 * Input: [1,2,3,4,5] Output: Node 3 from this list (Serialization: [3,4,5]) The
 * returned node has value 3. (The judge's serialization of this node is
 * [3,4,5]). Note that we returned a ListNode object ans, such that: ans.val =
 * 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 */

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
	public ListNode middleNode(ListNode head) {
		// if(head == null){
		// return head;
		// }
		ListNode temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}

		int mid = 0;
		if (size % 2 == 0) {
			mid = size / 2 + 1;
		} else {
			mid = size / 2 + 1;
		}
		int index = 1;

		while (index < mid) {
			head = head.next;
			index++;
		}
		return head;
	}
}
