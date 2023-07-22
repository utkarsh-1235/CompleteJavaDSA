public class MergeSortLL {
  public class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
  }
  public static Node head;
  
  
  public void AddFirst(int data){
         Node newNode = new Node(data);

        if(head ==null){
            head = newNode;
            return;
        }
      newNode.next = head;
      head = newNode;


  }

  public void printList(){
    if(head == null){
        System.out.println("List is empty");
        return ; 
    }
    Node temp =head ;
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp = temp.next;
    } 
    System.out.println("null");
  }

  public Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
  }
  public Node mergeSort(Node head){

    // base case
    if(head == null || head.next == null){
        return head;
    }
    // find mid
    Node mid = getMid(head);

    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    return merge(newLeft,newRight);
  }

  private Node merge(Node head1,Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while(head1!=null && head2!=null){
        if(head1.data<=head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
    while(head1!=null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }
    while(head2!=null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return mergedLL.next;
  }

  // public Node findMiddle(Node head){
      

  //      return slow;
  // }

  public void ZigZag(){

    //Find Middle Element;
    Node slow = head;
    Node fast = head;

    while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
    }
      Node midNode = slow;
    
      Node prev = null;
      Node curr = midNode.next;
      midNode.next = null;
      Node next;
      while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      Node Lh = head;
      Node Rh = prev;
      Node nextL,nextR;

      //alt merge and Zig zag
      while(Lh!=null && Rh!=null){
        nextL = Lh.next;
        Lh.next = Rh;
        nextR = Rh.next;
        Rh.next = nextL;

        //Update
        Rh = nextR;
        Lh = nextL;
      }

  }
public static void main(String args[]){
     MergeSortLL ll = new MergeSortLL();
     ll.AddFirst(1);
     ll.AddFirst(4);
     ll.AddFirst(2);
     //ll.AddFirst(9);
     ll.AddFirst(6);

     ll.printList();

     //ll.head = ll.mergeSort(head);

     ll.ZigZag();

     ll.printList();

  }
}
