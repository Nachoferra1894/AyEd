package Ej13;

import bases.MyBinaryTree;

public class TreeApi<T> {

    public TreeApi(){}

    // a) calcular el peso de un arbol
    public int size(MyBinaryTree<T> a) {
        if (a.isEmpty())
            return 0;
        else
            return 1 + size(a.getLeft()) + size(a.getRight());
    }

    // b) Numero de hojas
    public int nroDeHojas(MyBinaryTree<T> a){
        int cuenta = 0;
        if(a.getLeft() == null && a.getRight() == null)
        {
            cuenta = 1;
        }
        else
        {
            if (a.getLeft() != null)
            {
                cuenta += nroDeHojas(a.getLeft());
            }
            if (a.getRight() != null)
            {
                cuenta += nroDeHojas(a.getRight());
            }
        }
        return cuenta;

    }

    private void inorden(MyBinaryTree<T> a){
        if(!a.isEmpty()){
            inorden(a.getLeft());
            System.out.println(a.getRoot());
            inorden(a.getRight());
        } else System.out.println("hola");
    }


}
