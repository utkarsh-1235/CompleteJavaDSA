public class DetectingCycle{
    public static class Node{
        int data;
        Node next;

        Node(int data){
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
          System.out.println("List is Empty");
          return ; 
        }
         Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public  boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;

             if(slow == fast){
                return true;
             }
        }
        return false;
    }

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; 
            if(fast == slow){
                cycle = true;
                break;
            }
        }
            if(cycle==false){
              return;
            }

            //find meeting point
            slow = head;
            Node prev = null ;
            while(slow!=fast){   // Here previous stores last node of fast
             slow = slow.next;
             prev = fast;   
             fast = fast.next;
            }

            //remove the cycle
            prev.next = null;
    }

    public static void main(String args[]){
        DetectingCycle ll = new DetectingCycle();

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.printList();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        //head.next.next.next = new Node(4);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
         
        System.out.println(ll.isCycle());

    ll.removeCycle();

    System.out.println(ll.isCycle());
   // ll.printList();
        
        //ll.printList();
    }
}