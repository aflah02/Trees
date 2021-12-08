import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IntroductiontoTrees {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        root.left = new BinaryTreeNode<Integer>(2);
        root.right = new BinaryTreeNode<Integer>(3);
        root.left.left = new BinaryTreeNode<Integer>(4);
        root.left.right = new BinaryTreeNode<Integer>(5);
        root.right.left = new BinaryTreeNode<Integer>(6);
        root.right.right = new BinaryTreeNode<Integer>(7);
        System.out.print("Inorder Traversal ---> ");
        InorderTraversal(root);
        System.out.println();
        System.out.print("Preorder Traversal ---> ");
        PreorderTraversal(root);
        System.out.println();
        System.out.print("Postorder Traversal ---> ");
        PostorderTraversal(root);
        System.out.println();
        System.out.print("Levelorder Traversal ---> ");
        LevelorderTraversal(root);
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
        PreorderTraversal(Root.left);
        PreorderTraversal(Root.right);
    }
    static void PostorderTraversal(BinaryTreeNode<Integer> Root){
        if (Root == null){
            return;
        }
        PostorderTraversal(Root.left);
        PostorderTraversal(Root.right);
        System.out.print(Root.data + " ");
    }
    static void LevelorderTraversal(BinaryTreeNode<Integer> Root){
        Queue<BinaryTreeNode<Integer>> traversalQueue = new LinkedList<>();
        traversalQueue.add(Root);
        while (!traversalQueue.isEmpty()){
            BinaryTreeNode<Integer> currTopofStack = traversalQueue.remove();
            System.out.print(currTopofStack.data + " ");
            if (currTopofStack.left != null){
                traversalQueue.add(currTopofStack.left);
            }
            if (currTopofStack.right != null){
                traversalQueue.add(currTopofStack.right);
            }
        }
    }
    static void iterativeInorderTraversal(BinaryTreeNode<Integer> Root){

    }
    static void iterativePreorderTraversal(BinaryTreeNode<Integer> Root){

    }
    static void iterativePostorderTraversal(BinaryTreeNode<Integer> Root){

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
