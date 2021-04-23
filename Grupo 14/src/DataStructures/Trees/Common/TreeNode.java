package DataStructures.Trees.Common;

public class TreeNode<T> {
    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(){ value = null;}

    public TreeNode(T value){
        this.value = value;
    }

    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right){
        this.value = value;
        this.right = right;
        this.left = left;
    }
}
