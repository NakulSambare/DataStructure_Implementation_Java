
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
        this.left=null;
        this.right= null;
    }

}

class Tree{

    Node root;
    Tree(){
        root=null;
    }

    public void insert(int data){
        root=insertRoc(root,data);
    }
    public Node insertRoc(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }

        if(data < root.data){
            root.left=insertRoc(root.left, data);
        }else if(data > root.data){
            root.right=insertRoc(root.right, data);
        }
        return root;

    }

     public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
     
}
public class TreeDemo {
    public static void main(String[] args){
        Tree tree = new Tree();

        // Insert nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Perform inorder traversal to print the nodes
        System.out.print("Inorder traversal: ");
        tree.inorder();
    }
}
