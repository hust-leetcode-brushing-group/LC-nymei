import java.util.*;
//Populating Next Right Pointers in Each Node

public class solution116 {
	public Node connect(Node root) {
        if(root == null)    return root;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
        	Node p = q.poll();
        	if(p != null) {
        		p.next = q.peek();
        		if(p.left != null) {
        			q.add(p.left);
        		}
        		if(p.right != null) {
        			q.add(p.right);
        		}
        	}
        	else if(!q.isEmpty()) {
        		q.add(null);
        	}
        }
        return root;
    }
}
