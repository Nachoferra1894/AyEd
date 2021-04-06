package bases;

public class DoubleNode <T>{
    public T dato;
    public DoubleNode <T> right, left;

    public DoubleNode(T o){
        dato = o;
    }

    public DoubleNode(T o, DoubleNode<T> left, DoubleNode<T> right){
        dato = o;
        this.right = right;
        this.left = left;
    }

}