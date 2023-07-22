import java.util.*;
public class DiameterOfTree {
    public static  class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        public static class Info{
            int diameter;
            int height;
            int sum;
            int count;

            Info(int diameter, int height, int sum, int count){
                this.diameter = diameter;
                this.height = height;
                this.sum = sum;
                this.count = count;
            }

            
        }
            public static class Info2{
                int hd;
                Node node;

                Info2(Node node, int hd){
                    this.hd = hd;
                    this.node = node;
                }
            }
            public static void topView(Node root){
                 // Level Order
                 Queue<Info2>q = new LinkedList<>();
                 HashMap<Integer, Node> map = new HashMap<>();
                 int min =0, max = 0;

                q.add(new Info2(root,0));
                 q.add(null);
                 while(!q.isEmpty()){
                    Info2 curr = q.remove();
                    if(curr == null){
                        if(q.isEmpty()){
                            break;
                        }
                        else{
                            q.add(null);
                        }
                    }
                    else{
                        if(!map.containsKey(curr.hd)){  // first time horizontal distance is occuring
                                 map.put(curr.hd,curr.node);
                        }
                        if(curr.node.left!=null){
                            q.add(new Info2(curr.node.left,curr.hd-1));
                            min = Math.min(min,curr.hd-1);
                        }
                        if(curr.node.right!=null){
                            q.add(new Info2(curr.node.right,curr.hd+1));
                            max = Math.max(max,curr.hd+1);
                        }

                    }
                 }
                 for(int i = min;i<=max;i++){
                    System.out.print(map.get(i).data+" ");
                 }
                 System.out.println();
            }
            public static Info Diameter(Node root){
                if(root == null){
                    return new Info(0,0,0,0);
                }
                Info leftInfo = Diameter(root.left);
                Info rightInfo = Diameter(root.right);

                int diameter = Math.max(Math.max(leftInfo.diameter,rightInfo.diameter),leftInfo.height+rightInfo.height+1);

                int height = Math.max(leftInfo.height,rightInfo.height)+1;

               
                 int sum = leftInfo.sum+rightInfo.sum+root.data;


                 int count = Math.max(leftInfo.count, rightInfo.count)+1;

                return new Info(diameter, height,sum,count);
            }


           public static boolean isIdentical(Node node, Node subRoot){

            // base case
            if(node == null && subRoot == null){
                return true;
            }
            else if(node == null || subRoot == null || node.data!=subRoot.data){
                return false;
            }
            if(!isIdentical(node.left, subRoot.left)){
                return false;
            }
            if(!isIdentical(node.right, subRoot.right)){
                return false;
            }
            return true;
           }


            public static boolean subtree(Node root, Node subRoot){
                if(root == null){
                    return false;
                }
                if(root.data == subRoot.data){
                    if(isIdentical(root,subRoot)){
                        return true;

                    }

                }
                return subtree(root.left,subRoot) || subtree(root.right, subRoot);
            }
     public static void kLevel(Node root,int level, int k){
             if(root == null){
                return;
             }
             if(level == k){
                System.out.println(root.data);
                return;
             }
             kLevel(root.left,level+1,k);
             kLevel(root.right,level+1,k);
     }
     public static boolean getPath(Node root, int n, ArrayList<Node>path){

        // Base case
        if(root == null){
            return false;
        }
          path.add(root);

          if(root.data == n){
             return true;
          }

          boolean leftFound = getPath(root.left, n, path);
          boolean rightFound = getPath(root.right, n, path);

          if(leftFound|| rightFound){
            return true;
          }

          path.remove(path.size()-1);
          return false;
     }

     public static Node lowestCommon(Node root, int n1, int n2){
         ArrayList<Node> path1 = new ArrayList<>();
         ArrayList<Node> path2 = new ArrayList<>();

         getPath(root,n1,path1);
         getPath(root,n2,path2);

         int i=0;
         for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
         }
         // Store last equal nodes
         Node Lca = path1.get(i-1);
         return Lca;
     }

     public static Node lowestCommon2(Node root, int n1, int n2){
          //Base Case
          if(root == null||root.data == n1 || root.data == n2){
              return root;
          }
          Node leftLca = lowestCommon2(root.left, n1, n2);
          Node rightRca = lowestCommon2(root.right, n1, n2);

          // leftLca = valid value or rightRca = null
          if(rightRca == null){
            return leftLca;
          }
           
          // rightRca = valid value or leftLca = null
          if(leftLca == null){
            return rightRca;
          }
          return root;
     }
     public static int minDistance(Node root, int n1, int n2){
        // int count = 0;
        // //Base case
        // if(root == null){
        //     return -1;
        // }
        // if( root.data==n1 || root.data==n2){
        //     return 0;
        // }

        // int leftLca = minDistance(root.left, n1, n2);
        // int rightRca = minDistance(root.right, n1, n2);
              
        // if(leftLca == 0){
        //     return rightRca;
        // }
        // if(rightRca == 0){
        //     return leftLca;
        // }
        Node lca = lowestCommon2(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1+dist2;
     }

     public static int lcaDist(Node root ,int n){
           if(root == null){
            return -1;
           }
           if(root.data == n){
            return 0;
           }
           int leftDist = lcaDist(root.left, n);
           int rightDist = lcaDist(root.right, n);

           if(leftDist == -1 && rightDist == -1){
            return -1;
           }else if(leftDist == -1){
            return rightDist+1;
           }else{
            return leftDist+1;
           }
     }

     public static int KAncestor(Node root, int n, int k){

        if(root == null){
            return -1;
        }
         if(root.data == n){
            return 0;
         }

         int leftDist = KAncestor(root.left, n, k);
         int rightDist = KAncestor(root.right, n, k);

         if(leftDist == -1 && rightDist == -1){
            return -1;
         }
         int max = Math.max(leftDist, rightDist);

         if(max+1 == k){
            System.out.println(root.data);
         }
       return max+1;
     }

     public static int TransformSum(Node root){
        if(root==null){
            return 0;
        }
        // if(root.data == 0){
        //     root.data = 0;
        // }
        int leftChild = TransformSum(root.left);
        int rightChild = TransformSum(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
         
        root.data = newLeft+leftChild+newRight+rightChild;

        return data;
     }

     public static void preOrder(Node root){
        if(root == null){
            return ; 
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
     }
    }
    
     public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
        
         //root.left.right = new Node(4);
        //root.left.right.right = new Node(5);
         //root.left.right.right.right = new Node(6);
         //root.right.right = new Node(6);
        // root.right.right = new Node(7);
        //  root.left.left.left = new Node(8);
        //  root.left.left.right = new Node(9);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // //subRoot.right = new Node(5);

        //tree.kLevel(root, 1, 3);
        // System.out.println(tree.minDistance(root, 4, 5));
        // tree.KAncestor(root, 4, 1);

        System.out.println(tree.TransformSum(root));
        tree.preOrder(root);
        // System.out.println(tree.subtree(root, subRoot));
         
        //  System.out.println(tree.Diameter(root).diameter);
        //  System.out.println(tree.Diameter(root).height);
        //  System.out.println(tree.Diameter(root).sum);
        //  System.out.println(tree.Diameter(root).count);

       // tree.topView(root);
     }
}
