package linkedList;

class Node {
  int data;
  Node next;// this is the pointer to the next node

  Node(int data) {
    this.data = data;
    this.next = null;
  }

}

public class createNode {
  Node head;

  public static void main(String[] args) {
    createNode list = new createNode();
    list.head = new Node(10);

  }

}
