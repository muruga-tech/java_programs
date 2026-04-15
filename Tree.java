import java.util.*;
class Node{
    int data;
    Node left ,right;
    public Node(int val){
        data=val;
        left=null;
        right=null;
    }
}
 class Tree{
     Node create(int val){
        return new Node(val);
    }
    Node insert(Node root,int val){
        if(root==null){
            return create(val);
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
     public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }}
    
     public void preorder(Node root){
        if(root!=null){
        System.out.print(root.data+" "); 
             preorder(root.left);
             preorder(root.right);
        }}
        public void postorder(Node root){
        if(root!=null){
             postorder(root.left);
             postorder(root.right);
             System.out.print(root.data+" ");
        }
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Tree t1=new Tree();
        int k=sc.nextInt();
        
        Node root=t1.create(k);
        while(true){
            int data =sc.nextInt();
            if(data == -1)
            break;
            t1.insert(root,data);
        }
        System.out.print("Inorder: ");
         t1.inorder(root);
         System.out.print("\nPreorder: ");
         t1.preorder(root);
         System.out.print("\nPostorder: ");
         t1.postorder(root);
         
   }
}