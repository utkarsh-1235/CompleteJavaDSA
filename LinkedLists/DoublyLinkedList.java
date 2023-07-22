public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
             this.data = data;
             this.next = null;
             this.prev = null;
        }

    }
        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
             head.prev = newNode;
            head = newNode;

        }

       public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
            //tail = temp.prev;
        }
        System.out.println("null");
       }
       
       public  void removeFirst(){
           if(head == null){
            System.out.println("List is empty");
            return;
           }

           head = head.next ;
           head.prev = null;
       }

       public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
       }

       public void removeLast(){
        if(head== null){
            System.out.println("List is Empty");
            return;
        }
        tail = tail.prev;
        tail.next = null;
       }

       public void reverse(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
       }
       public static void main(String args[]){
          DoublyLinkedList ll = new DoublyLinkedList();

          ll.addFirst(1);
          ll.addFirst(2);
          ll.addFirst(3);
          ll.addFirst(4);
          ll.addFirst(5);
          ll.addFirst(6);
          ll.addFirst(7);
          ll.print();
            
          ll.removeFirst();
          ll.print();
         ll.addlast(7);
         ll.print();

         ll.removeLast();
         ll.print();
         ll.reverse();
         ll.print();
       }
}
