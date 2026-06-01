package tree;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree(){
        this.root = null;
    }
    public void insert(int data) {
        root = insertRecursive(root ,data);
    }
    private TreeNode insertRecursive(TreeNode current, int data){
        if(current == null) {
            return new TreeNode(data);
        }
        if(data < current.data){
            current.left = insertRecursive(current.left, data);
        }
        else if(data > current.data) {
            current.right = insertRecursive(current.right, data);
        }
       return current;
    }
    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }
    private void inOrderRecursive(TreeNode current) {
        if(current != null) {
            inOrderRecursive(current.left);
            System.out.print(current.data + " ");
            inOrderRecursive(current.right);
        }
    }
    public boolean search (int key) {
        return searchRecursive(root, key);
    }
    private boolean searchRecursive(TreeNode current, int key) {
        if(current == null) {
            return false;
        }
        if(key ==current.data){
            return true;
        }
        if(key < current.data) {
            return searchRecursive(current.left, key);
        } else{
            return searchRecursive(current.right, key);
        }
    }
}
