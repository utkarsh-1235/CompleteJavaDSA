import java.util.*;
public class CreationBinarySearchTree{
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinarySearchTree{
        
        public static Node Insert(Node root,int data){
            Node newNode = new Node(data);

            //Base case
            if(root == null){
                root = newNode;
                return root;
            }
            
            if(root.data>newNode.data){
                root.left = Insert(root.left, data);
                
            }
            else if(root.data<newNode.data){
                
                root.right = Insert(root.right,data);
            }
            return root;
        }


        public static Boolean Search(Node root,int key){
                Boolean leftTr = false,rightTr = false;
            // Base case
            if(root == null){
                return false;
            }
            if(root.data == key){
                return true;
            }
            else if(key<root.data){
                 leftTr = Search(root.left,key);
            }else if(key>root.data){
                
             rightTr = Search(root.right, key);
            }
    
            return leftTr|| rightTr;
        }
        public static void InOrder(Node root){
            if(root == null){
                return;
            }
            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);

        }
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }

        public static Node delete(Node root, int data){
            if(root.data>data){
                root.left = delete(root.left, data);
            }
            else if(root.data<data){
              root.right = delete(root.right, data);
            }
            // if data found
            else{
                 // Case1  deleting node will be leaf
                 if(root.left == null && root.right == null){
                    return null;
                 }
                 // Case2 deleting node have single child
                 if(root.left == null){
                    return root.right;
                 }
                 else if(root.right == null){
                    return root.left;
                 }
                 // Case3 deleting node have two children
                   // find inorder succesor
                   Node Is = InorderSuccessor(root.right);
                   root.data = Is.data;
                   root.right = delete(root.right,Is.data);
            }
            return root;
        }

        public static Node InorderSuccessor(Node root){
            while(root.left!=null){
                root = root.left;
            }
            return root;
        }

        public static void printInRange(Node root, int k1, int k2){
            if(root == null){
                
                return;
            }
            if(k1 <= root.data && k2>=root.data){
                printInRange(root.left, k1, k2);
                System.out.print(root.data+" ");
                printInRange(root.right, k1, k2);
            }
            else if(k1>root.data){
                printInRange(root.right, k1, k2);
                
            }
            else if(k2< root.data){

                printInRange(root.left, k1, k2);
                
            }
        }
        public static void printData(ArrayList<Integer> path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+"-->");
            }
            System.out.println("null");
        }
        public static void printRoot2leaf(Node root, ArrayList <Integer> path){
            if(root == null){
                return;
            }
                path.add(root.data);
                if(root.left == null && root.right == null){
                           printData(path);
                }
                printRoot2leaf(root.left, path);
                printRoot2leaf(root.right, path);
                path.remove(path.size()-1);
        }

        public static boolean IsValid(Node root, Node min, Node max){
            if(root == null){
                return true;
            }
            else if(min!=null && root.data<=min.data){
                return false;
            }
            else if(max!=null && root.data>=max.data){
                return false;
            }

            return IsValid(root.left, min, root)&& IsValid(root.right, root, max);
        }

        public static Node Mirror(Node root){

            // Base case
            if(root == null){
                return null;
            }

            Node leftS = Mirror(root.left);
            Node rights = Mirror(root.right);

            root.left = rights;
            root.right = leftS;
            return root;
        }
        public static Node SortedBalancedBST(int arr[], int start, int end){

            //Base case

            if(start>end ){
                return null;
            }
            int mid = (start+end)/2;
            Node root = new Node(arr[mid]);

            root.left = SortedBalancedBST(arr, start, mid-1);
            root.right = SortedBalancedBST(arr, mid+1, end);
            
            return root;
        }
        public static void inorder(Node root, ArrayList<Integer> arr){
            
            if(root == null){
                return ;
            }
            inorder(root.left,arr);
            arr.add(root.data);
            inorder(root.right,arr);
            

        }
        public static Node createBST(ArrayList<Integer> arr, int start, int end){
            if(start>end){
                return null;
            }
            int mid = (start+end)/2;
            Node root = new Node(arr.get(mid));
            root.left = createBST(arr, start, mid-1);
            root.right = createBST(arr,mid+1,end);
            return root;
        }
        public static Node BalanceBST(Node root){
            ArrayList<Integer> arr = new ArrayList<>();
            //Inorder Sequence
            inorder(root,arr);

            root = createBST(arr, 0, arr.size()-1);
            return root;
        }
    }

    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
          
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        //  System.out.println(tree.Insert(null, 4).data);
        //  System.out.println(tree.Insert(null, 3).data);
        //  System.out.println(tree.Insert(null, 5).data);
        //  System.out.println(tree.Insert(null, 2).data);
        //  System.out.println(tree.Insert(null, 6).data);
        //  System.out.println(tree.Insert(null, 1).data);
        
        // int values[] = {3,5,6,8,10,11,12};
        //  Node root = null;
        // // for(int i=0;i<values.length;i++){
        //     root = tree.Insert(root, values[i]);
        // }
      //  System.out.println(tree.Search(root, 6));

        // tree.delete(root, 3);
        
        // tree.InOrder(root);
        //tree.printInRange(root, 5, 12);

        //tree.printRoot2leaf(root, new ArrayList<>());
    
        // if(tree.IsValid(root, null, null)){
            
        //     System.out.println("valid");
        // }else{
            
        //     System.out.println("Invalid");
        // }
        //tree.InOrder(root);
        //System.out.println(tree.Mirror(root).data);
        //tree.Mirror(root);
        //  root = tree.SortedBalancedBST(values, 0, values.length-1);
        // System.out.println();
        tree.preOrder(root);
        
        System.out.println();
        root = tree.BalanceBST(root);

        tree.preOrder(root);
    }
}