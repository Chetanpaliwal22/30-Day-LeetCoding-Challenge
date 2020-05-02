/*
 * Input ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 
 * Output [null,null,null,null,-3,null,0,-2]
 */

class ListNode {

	ListNode next;
	int min;
	int val;

	ListNode(int x) {
		val = x;
		min = x;
		next = null;
	}
}

class MinStack {

	/** initialize your data structure here. */
	ListNode head;

	public MinStack() {
	}

	public void push(int x) {
		ListNode temp = new ListNode(x);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
		}
		temp.min = Math.min(head.min, temp.val);
		head = temp;
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		if (head == null) {
			return 0;
		}
		int ret = head.val;
		return ret;
	}

	public int getMin() {
		return head.min;
	}
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */s
