class LinklistMiddleElement{
	Node head ;

	class Node{
    int data;
    Node next;
    Node(int d){
    data = d;
    next = null;
    }
  }


//Add element at the star to thew linklist
public void push(int data){     
Node newNode = new Node(data);
newNode.next = head;
head = newNode;
}

public void pushLast(int data){
Node temp =head;
while(head!=null){
	head = head.next;
}
Node newNode = new Node(data);
head = newNode;


}

//Print the linklist element
public void print(){
Node temp = head ;
while(temp!=null){

System.out.println(temp.data+" ");
temp = temp.next;
}
}




public static void main(String args[]){
 LinklistMiddleElement link = new LinklistMiddleElement();
 

link.pushLast(10);
link.pushLast(20);
link.pushLast(30);
link.pushLast(40);
link.print();
 
   


}
}








