public class linkedlist {
    class Node {
    	int data;
    	Node next;
    	public Node(int data) {
    		this.data = data;
    		next = null;
    		
    	}
    }
     
    Node head;
    public Node insert (int data) {
        Node newNode = new Node(data);
    	if (head == null) {
    		head = newNode;
    		return head;
    	}
    	newNode.next = head;
    	head = newNode;
    	return head;
    }

    public Node reverse () {
		if (head == null) {
			return null;
		}
		Node pre = null;
		Node cur = head;
		Node next = null;
		while (cur != null ) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
    }

    public void print() {
    	if (head == null) {
    		return ;
    	}
    	Node temp = head;
    	while(temp != null) {
    		System.out.print(" " + temp.data);
    		temp = temp.next;
    	}
    }
    




	public static void main(String[] args) {
		linkedlist ll = new linkedlist();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.print();
		ll.reverse();	
		ll.print();	

		
	}
}