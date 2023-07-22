public class RevisionLinkedList {
   public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
   public static Node head;
   public static Node tail;

   public void addFirst(int data){
    Node newNode = new Node(data);
       if(head == null){
          head = tail = newNode;
          return;
       }
       newNode.next = head;
       head = newNode;
   }
   public void printList(){
    if(head == null){
        System.out.println("LinkedList is empty");
        return;
    }
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");
   }
   public void addLast(int data){
    Node newNode = new Node(data);
      if(head ==null){
        head = tail = newNode;
        return ; 
      }
    //   tail = head;
    //   while(tail!=null){
    //     tail = tail.next;
    //   }
      tail.next = newNode;
      newNode.next = null;
      tail = newNode;

   }
  public static void main(String args[]){
    RevisionLinkedList ll = new RevisionLinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(4);
    ll.printList();
    ll.addLast(5);
    ll.printList();
  }
}
