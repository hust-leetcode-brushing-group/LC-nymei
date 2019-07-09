// remove nth node from end of list
public class solution19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode front = head;
		ListNode end = head;
		for(int i =0; i < n-1; i++) {
			front = front.next;
		}
		if(front.next == null) {
			return head.next;
		}
		end = end.next;
		while(end.next != null) {
			end = end.next;
			front = front.next;
		}
		front.next = front;
		return head;
    }
}
