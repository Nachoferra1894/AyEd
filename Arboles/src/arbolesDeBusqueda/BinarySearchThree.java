package arbolesDeBusqueda;


import bases.DoubleNode;

public class BinarySearchThree <T> {
    private DoubleNode<T> root;
    public BinarySearchThree (){
        root = null;
    }
    public BinarySearchThree(T o){
        root = new DoubleNode<T>(o);
    }

    public BinarySearchThree(T o, BinarySearchThree<T> tleft, BinarySearchThree<T> tright){
        root = new DoubleNode<T>(o,tleft.root, tright.root);
    }

    public BinarySearchThree(T o, BinarySearchThree<T> tleft){
        root = new DoubleNode<T>(o,tleft.root,null);
    }


    public boolean isEmpty(){
        return root == null;
    }

    public T getRoot(){
        return root.dato;
    }

    public BinarySearchThree<T> getLeft(){
        BinarySearchThree<T> t = new BinarySearchThree<T>();
        t.root = root.left;
        return t;
    }

    public BinarySearchThree<T> getRight(){
        BinarySearchThree<T> t = new BinarySearchThree<T>();
        t.root = root.right;
        return t;
    }

    public boolean exists (T e){ // Devuelve si esta este elemento en el arbol
        return true;
    }

    public T search (T e){ // Devuelve el elemento cuya clave coincide con la clave del elemento
        return null;
    }
}
