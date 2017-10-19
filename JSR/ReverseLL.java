import java.util.*;
public class ReverseLL {
    class Node {
      int data;
      Node next;
      Node(int data) {
        this.data = data;
        this.next = null;
    }
  }

  Node head;

  Node reverse () {
    if (head == null) {
      return null;
    }
    Node pre = null;
    Node cur = head;
    Node next = null;
    while (cur != null) {
      next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    head = pre;
    return head;        
  }


  // insett into the last
  Node insert(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return head;
    }
    Node temp = head;
    while(temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    return head;
  }

//  print last 
  void printList() {
    if (head == null) {
      return ;
    }
    Node temp = head;
    while(temp != null) {
      System.out.print(temp.data);
      temp = temp.next;
    }
    System.out.println();
    return;
}

  public static void main(String args[] ) {
    Scanner in = new Scanner(System.in);

    ReverseLL obj = new ReverseLL();

    int n = in.nextInt();
    for (int i = 0;i < n;i++) {
      int m = in.nextInt();
      int []a = new int[m];
      for (int j = 0;j < m ;j++) {
        obj.insert(in.nextInt());
      }
      obj.printList();
      obj.reverse();
      obj.printList();
    }
  }
}