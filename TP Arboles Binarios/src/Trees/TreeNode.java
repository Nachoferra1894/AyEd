package Trees;

public class TreeNode<T> {
    private T value;
    private TreeNode<T> left;
    private TreeNode<T> right;


    public TreeNode(T value){
        this.value = value;
    }

    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right){
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public T getValue() {
        return value;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public TreeNode<T> getLeft() {
        return left;
    }
}
