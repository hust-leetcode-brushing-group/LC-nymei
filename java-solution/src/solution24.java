//swap node in pairs
public class solution24 {
	public ListNode swapPairs(ListNode head) {
        if(head == null)    return head;
        if (head.next == null)	return head;
        ListNode p1 = head;
        ListNode p2;
        ListNode p3;
        int count = 0;
        while(p1.next != null){
            p2 = p1.next;
            p1.next = p2.next;
            p2.next = p1;
            if(count == 0)  head = p2;
            p3 = p1;
            if(p1.next!= null){
                p1 = p1.next;
            }
            if(p1.next!= null){
                
                p3.next = p1.next;
            }
            count++;
        }
        return head;
    }
}
