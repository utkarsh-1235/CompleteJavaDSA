public class HeightTree {
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

    public static class BinaryTree{
        static int idx = -1;
       public static Node BuildTree(int nodes[]){
             idx++;
           if(nodes[idx]==-1){
            return null;
           }
          Node newNode = new Node(nodes[idx]) ;

          newNode.left = BuildTree(nodes);
          newNode.right = BuildTree(nodes);
          return newNode;
       }
       public static int Height(Node root){
             if(root == null){
                return 0;
             }
             int lh = Height(root.left);
             int rh = Height(root.right);
             return  Math.max(lh, rh)+1;
       }

       public static int Diameter(Node root){
          
          if(root == null){
             return 0 ;
          }
          int lh = Height(root.left);
          int rh = Height(root.right);
   
          int lDiam = Diameter(root.left);
          int rDiam = Diameter(root.right);
   
          int selfDiam = lh+rh+1;

          return Math.max( selfDiam, Math.max(lDiam, rDiam));
       }


       public static int count(Node root){
             if(root == null){
                return 0;
             }

             int leftCount = count(root.left);
             int rightCount = count(root.right);

             return leftCount+rightCount+1;
       }

       public static int sum(Node root){
        //base case
        if(root==null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum+rightSum+root.data;
       }
          public static class Info{
            int diameter;
            int height;


            Info(int diameter, int height){
               this.diameter = diameter;
               this.height = height;
            }
          }
       public static Info Diameter2(Node root){
           if(root == null){
                 return new Info(0,0);
           }
            Info leftD = Diameter2(root.left);
            Info rightD = Diameter2(root.right);

            // int leftH = Height(root.left);
            // int rightH = Height(root.right);

            int diam = Math.max(Math.max(leftD.diameter,rightD.diameter),leftD.height+rightD.height+1);
            int ht = Math.max(leftD.height,rightD.height)+1;

            return new Info(diam,ht);
       }
    }

    public static void main(String args[]){
      //int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        //Node root = tree.BuildTree(nodes);
          
        Node root = new Node(1)  ;
        root.left = new Node(2);
        root.right = new Node(3);
      //   root.left.left = new Node(4);
      //   root.left.right = new Node(5);
      //   root.right.left = new Node(6);
      //   root.right.right = new Node(7);
      //   root.right.right = new Node(8);
      //   root.right.right = new Node(9);
      root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);
         root.left.left.left = new Node(8);
       root.left.left.right = new Node(9);

        //System.out.println(tree.Height(root));

        //System.out.println(tree.Diameter2(root).diameter);
        //System.out.println(tree.Diameter2(root).height);

        System.out.println(tree.sum(root));
    }
}
