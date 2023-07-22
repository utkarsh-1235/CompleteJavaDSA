public class LinkedListCreation{
    public class makeNode{
        int data;
        makeNode next;

        public  makeNode(int data){
            this.data = data;
            this.next = null;
         }
 
    }
    public static makeNode head;
    public static makeNode tail;
    public static int size;
    //Method to insert in a Linked List

    public  void addFirst(int data){
  //Step1 Create NewNode
  makeNode NewNode = new makeNode(data);
    size++;
  // if list is null

  if(head == null){
    head = tail = NewNode;
    return;
  }
  //Step2 newNode next = head
   NewNode.next = head;

   // step3 NewNode = head
   head = NewNode;
    }

    public void addLast(int data){
        makeNode newNode = new makeNode(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    public  void addMiddle(int data,int idx){
      if(idx == 0){
        addFirst(data);
        return;
      }
        makeNode newNode = new makeNode(data);
        size++;
        int i=0;
        makeNode temp = head;
        while(i<idx-1){
                temp = temp.next;
                i++;
        }

        // i=idx-1  temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void printList(){
      makeNode temp = head;
      if(head == null){
        System.out.println("LinkedList is null");
        return;
      }
      while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
      }
      System.out.println("null");
    }

    public void removeFirst(){
      if(head == null){
        System.out.println("LinkedList is empty");
        return;
      }
      makeNode temp = head;
      head = temp.next;
      temp.next = null;
      size--;
    }
    public void removeLast(){
      if(head == null){
        System.out.println("LinkedList is empty");
        return;
      }
      makeNode prev = head;
      int i=0;
      while(i<size-2){
        prev = prev.next;
        i++;
      }
    
      prev.next = null;
      tail = prev;
      size--;
    }
    public void reverse(){
      if(head == null){
        return;
      }
      makeNode prev = null;
      makeNode cur = tail = head ;
      makeNode temp ;

      while(cur!=null){
        temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = temp;
      }
      head = prev;
    }

    public boolean iterativeSearch(int data){
       if(head == null){
        return false;
       }
       makeNode temp = head;
       while(temp!=null){
        if(temp.data == data){
          return true;
        }
        temp =temp.next;
       }
       return false;
    }

    public void removeNFromEnd(int n){
      int size = 0;
      makeNode temp = head;
      while(temp!=null){
        temp = temp.next;
        size++;
      }

      if(n==size){
       head =head.next; // remove first node
       return;
      }
      int i=1;
      makeNode prev = head;
      int iToFind = size-n;
      while(i<iToFind){
      prev = prev.next;
      i++;
      }
      prev.next = prev.next.next;
      return ; 
    }

    // public boolean recursiveSearch(makeNode head,int data){
    //    if(head==null){
    //     return false;
    //    }
    //    //int i=0;
    //    if(head.data == data){
    //    // System.out.println("index is"+" "+i);
    //      return true;
    //    }
    //    //i++;
    //    recursiveSearch(head.next, data);
    //        return false;
    // }

    public int helper(makeNode head, int key){
      if(head == null){
        return -1;
      }
      if(head.data == key){
        return 0;
      }
      int idx = helper(head.next,key);
      if(idx == -1){
        return -1;
      }
      return idx+1;
    }
    public int recursiveSearch(makeNode head,int key){
      return helper(head,key);
    }

    public static void main(String args[]){
      
          LinkedListCreation ll = new LinkedListCreation();

          ll.addFirst(1);
          ll.printList();
          ll.addFirst(2);
          ll.printList();
          ll.addFirst(3);
          ll.printList();
          ll.addFirst(4);
          ll.addFirst(10);
          ll.addFirst(20);

          ll.printList();

          ll.reverse();
          ll.printList();

          ll.removeNFromEnd(3);
          ll.printList();
          //System.out.println(ll.recursiveSearch(head, 3));
          System.out.println("Element in LinkedList is present at this position"+" "+ll.recursiveSearch(head, 10));
         // System.out.println(ll.recursiveSearch(head, -2));
          // System.out.println(ll.iterativeSearch(3));
          // System.out.println(ll.iterativeSearch(-1));
          // System.out.println(ll.iterativeSearch(0));
        //  ll.reverse();
          // ll.addFirst(4);
          // ll.printList();
          // ll.addFirst(5);
          // ll.printList();
          // ll.addLast(6);
          // ll.printList();
          // ll.addLast(7);
          // ll.printList();
          // ll.addMiddle(5, 3);
          // ll.printList();
          // ll.removeFirst();
          // ll.printList();
          
          // ll.printList();
          // ll.removeFirst();
          // ll.printList();
          // ll.removeLast();
          // ll.printList();
          //System.out.println("SizeOf the LinkedList is:"+size);
}
}