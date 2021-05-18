package DataStructures.Trees.CompareBinaryTrees;

import DataStructures.Trees.BinarySearchTrees.BinarySearchTree;
import java.util.Random;

public class ComparisonSimulation {


    public static void main(String[] args) {
        int[] anIntArray = generateRandomArray();

        //Construimos cada arbol y guardamos el tiempo de ejecucion del metodo
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        System.out.println("Time in miliseconds taken to fill a BinarySearch Tree: " +fillBinaryTree(binarySearchTree, anIntArray));

        AVLTree<Integer> avlTree = new AVLTree<>();
        System.out.println("Time in miliseconds taken to fill an AVL Tree: " +fillAVLTree(avlTree, anIntArray));

        RBTree<Integer> redBlackTree = new RBTree<>();
        System.out.println("Time in miliseconds taken to fill a Red and Black Tree: " + fillRBTree(redBlackTree, anIntArray));
    }

    private static long fillBinaryTree(BinarySearchTree<Integer> aTree, int[] anIntArray) { // Retorna el tiempo que tarda en insertar todos los valores al arbol
        long start = System.currentTimeMillis();
        for (int integer : anIntArray) {
            aTree.insert(integer);
        }
        long finish = System.currentTimeMillis();

        return (finish - start);
    }
    private static long fillRBTree(RBTree<Integer> aTree, int[] anIntArray) { // Retorna el tiempo que tarda en insertar todos los valores al arbol
        long start = System.currentTimeMillis();
        for (int integer : anIntArray) {
            aTree.insert(integer);
        }
        long finish = System.currentTimeMillis();

        return (finish - start);
    }
    private static long fillAVLTree(AVLTree<Integer> aTree, int[] anIntArray) { // Retorna el tiempo que tarda en insertar todos los valores al arbol
        long start = System.currentTimeMillis();
        for (int integer : anIntArray) {
            aTree.insert(integer);
        }
        long finish = System.currentTimeMillis();
        return (finish - start);
    }



    public static int[] generateRandomArray(){

        return new Random().ints(0, 100000)
                .distinct()
                .limit(1000).toArray();
    }

}
