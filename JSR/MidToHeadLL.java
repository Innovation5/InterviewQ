public class MidToHeadLL {
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
            System.out.print(newNode);
    		return head;
    	}
    	newNode.next = head;
    	head = newNode;
    	return head;
    }

  //   public Node reverse () {
		// if (head == null) {
		// 	return null;
		// }
		// Node pre = null;
		// Node cur = head;
		// Node next = null;
		// while (cur != null ) {
		// 	next = cur.next;
		// 	cur.next = pre;
		// 	pre = cur;
		// 	cur = next;
		// }
		// return pre;
  //   }\



    public Node midToHead () {
        if (head == null) {
            return null;
        }
        Node pre = null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null ) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;;
        }

        pre.next  = slow.next;
        slow.next = head;
        head = slow;
        return head;
    }


    // public void print() {
    // 	if (head == null) {
    // 		return ;
    // 	}

    // 	Node temp = head;
    // 	while(temp != null) {
    // 		System.out.print(" " + temp.data);
    // 		temp = temp.next;
    // 	}
    // }
    




	public static void main(String[] args) {
		MidToHeadLL ll = new MidToHeadLL();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
        ll.insert(5);
		//ll.print();
		//ll.reverse();
        ll.midToHead();	
		//ll.print();	

		
	}
}