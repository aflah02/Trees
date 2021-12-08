public class IntroductiontoTrees {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        root.left = new BinaryTreeNode<Integer>(20);
        root.right = new BinaryTreeNode<Integer>(11);
        System.out.print("Inorder Traversal ---> ");
        InorderTraversal(root);
        System.out.println();
        System.out.print("Preorder Traversal ---> ");
        PreorderTraversal(root);
        System.out.println();
        System.out.print("Postorder Traversal ---> ");
        PostorderTraversal(root);
    }
    static void InorderTraversal(BinaryTreeNode<Integer> Root){
        if (Root == null){
            return;
        }
        InorderTraversal(Root.left);
        System.out.print(Root.data + " ");
        InorderTraversal(Root.right);
    }
    static void PreorderTraversal(BinaryTreeNode<Integer> Root){
        if (Root == null){
            return;
        }
        System.out.print(Root.data + " ");
        InorderTraversal(Root.left);
        InorderTraversal(Root.right);
    }
    static void PostorderTraversal(BinaryTreeNode<Integer> Root){
        if (Root == null){
            return;
        }
        InorderTraversal(Root.left);
        InorderTraversal(Root.right);
        System.out.print(Root.data + " ");
    }
}
class BinaryTreeNode<T>{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    BinaryTreeNode(T val, BinaryTreeNode<T> left, BinaryTreeNode<T> right){
        this.data = val;
        this.left = left;
        this.right = right;
    }
    BinaryTreeNode(T val){
        this.data = val;
    }
}
