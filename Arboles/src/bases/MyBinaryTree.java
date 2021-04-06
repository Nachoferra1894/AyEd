package bases;

public class MyBinaryTree<T>{
    private DoubleNode<T> root;

    public MyBinaryTree(){
        root = null;
    }
    public MyBinaryTree(T o){
        root = new DoubleNode <T>(o);
    }

    public MyBinaryTree(T o, MyBinaryTree<T> tleft, MyBinaryTree<T> tright){
        root = new DoubleNode<T>(o,tleft.root, tright.root);
    }

    public MyBinaryTree(T o, MyBinaryTree<T> tleft){
        root = new DoubleNode<T>(o,tleft.root,null);
    }


    public boolean isEmpty(){
        return root == null;
    }

    public T getRoot(){
        return root.dato;
    }

    public MyBinaryTree<T> getLeft(){
        MyBinaryTree<T> t = new MyBinaryTree<T>();
        t.root = root.left;
        return t;
    }

    public MyBinaryTree<T> getRight(){
        MyBinaryTree<T> t = new MyBinaryTree<T>();
        t.root = root.right;
        return t;
    }

}