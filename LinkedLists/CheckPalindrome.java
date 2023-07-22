public class CheckPalindrome {
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
    public makeNode findMiddle(makeNode head){
        makeNode slow = head;
        makeNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; // increase by +1
            fast = fast.next.next;  // increase by +2
        }
        return slow; // slow is middle
    }

    public boolean checkPalindrome(){
          if(head == null || head.next == null){
            return true;
          }

        //Step1 Finding middle element
        makeNode temp = findMiddle(head);

        //Step2 reverse second half
        makeNode prev = null;
        makeNode curr = temp;
        makeNode next;
        while(curr!=null){
            next = curr.next;    
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        makeNode right = prev;  // Right half head
        makeNode left = head;

        //Step3 check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
   public void ZigZag(){
      // Find middle element
      makeNode slow = head;
      makeNode fast = head;

      while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
      }
      makeNode midNode = slow;
        // Reverse second half
        
        makeNode prev = null;
        makeNode curr = midNode.next;
        midNode.next = null;
        makeNode next ;
        while(curr!=null){
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
        }

        // alternative merge and zigzag merge
        makeNode left = head;
        makeNode right = prev;
        makeNode nextL, nextR;
        while(left!=null && right!=null){
              nextL = left.next;
              left.next = right;
              nextR = right.next;
              right.next = nextL;
              
              left = nextL;
              right = nextR;
        }
   }
    public static void main(String args[]){
        CheckPalindrome ll = new CheckPalindrome();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        //System.out.println("Is list palindrome"+" "+ll.checkPalindrome());
        //System.out.println(ll.findMiddle(head));
          ll.ZigZag();
        ll.printList();
    }
}
