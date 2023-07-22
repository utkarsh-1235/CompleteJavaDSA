import java.util.*;
public class FromSizeLargestBST {
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
        public static class Info{
           boolean isValidBST;
           int size;
           int min;
           int max;

           Info(boolean isValidBST,int size, int min, int max){
            this.isValidBST = isValidBST;
            this.size = size;
            this.min = min;
            this.max = max;
           }
        }
        public static int maxBST = 0;

        public static Info largestBST(Node root){

            // base case
            if(root == null){
                return new Info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
            }
            Info leftInfo = largestBST(root.left);
            Info rightInfo = largestBST(root.right);
            int size = leftInfo.size+rightInfo.size+1;
            int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
            int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
            if(root.data<=leftInfo.max || root.data>=rightInfo.max){
                return new Info(false, size, min, max);
            }
            if(leftInfo.isValidBST && rightInfo.isValidBST){
                maxBST = Math.max(size,maxBST);
                return new Info(true, size, min, max);
            }
            return new Info(false,size,min,max);
        }

        public static void getInorder(Node root, ArrayList<Integer>arr){
            if( root == null){
                return;
            }
               getInorder(root.left, arr);
               arr.add(root.data);
               getInorder(root.right, arr);
        }
        public static Node BalancedBST(ArrayList<Integer>finalArr,int start, int end){
                 if(start>end){
                    return null;
                 }
                 
                 int mid = (start+end)/2;
                    Node root = new Node(finalArr.get(mid));
                    root.left = BalancedBST(finalArr, start, mid-1);
                    root.right = BalancedBST(finalArr, mid+1, end);
                    return root;
        }
        public static Node mergeBSTs(Node root1,Node root2){
               //Step1
               ArrayList<Integer> arr1 = new ArrayList<>();
               getInorder(root1, arr1);

               //Step2
               ArrayList<Integer> arr2 = new ArrayList<>();
               getInorder(root2, arr2);

               //merge
               ArrayList<Integer> finalArr = new ArrayList<>();
               int i=0,j=0;
               while(i<arr1.size()&&j<arr2.size()){
                if(arr1.get(i)<arr2.get(j)){
                   finalArr.add(arr1.get(i));
                   i++;
                }
                else{
                  finalArr.add(arr2.get(j));
                  j++;
                }
                
               }
               while(i<arr1.size()){
                finalArr.add(arr1.get(i));
                i++;
               }
               while(j<arr2.size()){
                finalArr.add(arr2.get(j));
                j++;
               }

               //sorted ArrayList to balanced binary search tree
              
            return BalancedBST(finalArr, 0, finalArr.size()-1);
               
        }
        public static void Inorder(Node root){
            if(root == null){
                return ;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();

        // Node root = new Node(50);
        // root.left = new Node(30);
        // root.left.left = new Node(5);
        // root.left.right = new Node(20);
        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);
        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);

        // Node root = new Node(60);
        // root.left = new Node(45);
        // root.right = new Node(70);
        // root.right.left = new Node(65);
        // root.right.right = new Node(80);

        // System.out.println(tree.largestBST(root).isValidBST);
        // System.out.println(tree.largestBST(root).size);

        //System.out.println(tree.maxBST);
        // System.out.println(tree.largestBST(root).min);
        // System.out.println(tree.largestBST(root).max);

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        //System.out.println(tree.mergeBSTs(root1, root2).data);
        Node root = tree.mergeBSTs(root1, root2);

        tree.Inorder(root);

    }
}
