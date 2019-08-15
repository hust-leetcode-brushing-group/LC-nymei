//linked list cycle II
public class solution142 {
	public ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null) {
			return null;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		while(p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
			if(p1 == p2)	break;
		}
		if(p2 == null && p2.next == null)	return null;
		p1 = head;
		while(p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
    }
}
