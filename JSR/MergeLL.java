public class MergeLL {
    class Node {
    	int data;
    	Node next;
    	public Node(int data) {
    		this.data = data;
    		next = null;    		
    	}
    }

     
    Node head1;
    Node head2;
    Node head ;

    public Node insert1 (int data) {
        Node newNode = new Node(data);
    	if (head1 == null) {
    		head1 = newNode;
    		return head1;
    	}
    	newNode.next = head1;
    	head1 = newNode;
    	return head1;
    }

    public Node insert2 (int data) {
        Node newNode = new Node(data);
        if (head2 == null) {
            head2 = newNode;
            return head2;
        }
        newNode.next = head2;
        head2 = newNode;
        return head2;
    }


    public Node mergeLL() {
        Node h1 = head1;
        Node h2 = head2;
        
        head = new Node(0);
        Node h = head;

        while(h1 != null && h2 != null) {
            if (h1.data < h2.data) {
                h.next = h1;
                h1 = h1.next;
            }
            else {
                h.next = h2;
                h2 = h2.next; 
            }
            h = h.next;
        }
        if (h1 == null) {
            h.next = h2;
        }
        if (h2 == null) {
            h.next = h1;
        }        
         head  = head.next;
        return head;
    }
 


    public void print() {
    	if (head == null) {
            System.out.println("heel");
    		return ;
    	}

    	Node temp = head;
    	while(temp != null) {
    		System.out.print(" " + temp.data);
    		temp = temp.next;
    	}
    }
    




	public static void main(String[] args) {
		MergeLL ll = new MergeLL();
		ll.insert1(9);
		ll.insert1(7);
		ll.insert1(5);
		ll.insert1(3);
        ll.insert1(1);

        ll.insert2(8);
        ll.insert2(6);
        ll.insert2(4);
        ll.insert2(2);
        ll.insert2(0);
		ll.mergeLL();	
		ll.print();			
	}
}