import javax.swing.tree.TreeNode;
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
        System.out.print("Level Order Traversal ---> ");
        LevelOrderTraversal(root);
        System.out.println();
        System.out.print("Iterative Preorder Traversal ---> ");
        iterativePreorderTraversal(root);
        System.out.println();
        System.out.print("Iterative Inorder Traversal ---> ");
        iterativeInorderTraversal(root);
        System.out.println();
        System.out.print("Iterative Postorder Traversal ---> ");
        iterativePostorderTraversal(root);
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
    static void LevelOrderTraversal(BinaryTreeNode<Integer> Root){
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
        Stack<BinaryTreeNode<Integer>> traversalStack = new Stack<>();
        BinaryTreeNode<Integer> node = Root;
        while (true){
            if (node != null){
                traversalStack.push(node);
                node = node.left;
            }
            else{
                if (traversalStack.isEmpty()){
                    break;
                }
                node = traversalStack.pop();
                System.out.print(node.data + " ");
                node = node.right;
            }
        }
    }
    static void iterativePreorderTraversal(BinaryTreeNode<Integer> Root){
        Stack<BinaryTreeNode<Integer>> traversalStack = new Stack<>();
        traversalStack.push(Root);
        while (!traversalStack.isEmpty()){
            BinaryTreeNode<Integer> stackTop = traversalStack.pop();
            System.out.print(stackTop.data + " ");
            if (stackTop.right != null){
                traversalStack.add(stackTop.right);
            }
            if (stackTop.left != null){
                traversalStack.add(stackTop.left);
            }
        }
    }
    static void iterativePostorderTraversal(BinaryTreeNode<Integer> Root){
        Stack<BinaryTreeNode<Integer>> traversalStack1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> traversalStack2 = new Stack<>();
        traversalStack1.push(Root);
        while (!traversalStack1.isEmpty()){
            BinaryTreeNode<Integer> node = traversalStack1.pop();
            traversalStack2.push(node);
            if (node.left != null){
                traversalStack1.push(node.left);
            }
            if (node.right != null){
                traversalStack1.push(node.right);
            }
        }
        while (!traversalStack2.isEmpty())
            System.out.print(traversalStack2.pop().data + " ");
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
