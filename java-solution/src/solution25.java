
public class solution25 {
	public ListNode reverseKGroup(ListNode head, int k) {
		if(head == null)    return head;
        if(head.next == null)	return head;
		if(k == 1)	return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;
		ListNode p = head;
		int count = 0;
		while(p != null) {
			count++;
			if(count%k == 0) {
                System.out.println("count: " + count);
				prev = reverse(prev, p.next);
                //System.out.println("P: " + p.val);
				p = prev.next;
                //System.out.println("P: " + p.val);
			}
			else {
				p = p.next;
			}
		}
		return dummy.next;
    }
	
	public ListNode reverse(ListNode prev, ListNode next) {
		ListNode last = prev.next;
	    ListNode curr = last.next;
	 
	    while(curr != next){
	        last.next = curr.next;
	        curr.next = prev.next;
	        prev.next = curr;
	        curr = last.next;
	    }
        System.out.println(last.val);
	    return last; 
	}
}
