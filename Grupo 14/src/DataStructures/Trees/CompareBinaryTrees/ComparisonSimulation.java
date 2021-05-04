package DataStructures.Trees.CompareBinaryTrees;

import DataStructures.Trees.BinarySearchTrees.BinarySearchTree;
import DataStructures.Trees.Common.BinaryTree;

import java.util.ArrayList;
import java.util.Random;

public class ComparisonSimulation {


    public static void main(String[] args) {
        ArrayList<Integer> anIntArray = generateRandomArray(1000);

        //Construimos cada arbol y guardamos el tiempo de ejecucion del metodo
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        System.out.println("Time in miliseconds taken to fill a BinarySearch Tree: " +fillTree(binarySearchTree, anIntArray));

        AVLTree<Integer> avlTree = new AVLTree<>();
        System.out.println("Time in miliseconds taken to fill an AVL Tree: " +fillTree(avlTree, anIntArray));

        RedBlackTree<Integer> redBlackTree = new RedBlackTree<>();
        System.out.println("Time in miliseconds taken to fill a Red and Black Tree: " + fillTree(redBlackTree, anIntArray));
    }

    private static long fillTree(BinaryTree<Integer> aTree, ArrayList<Integer> anIntArray) { // Retorna el tiempo que tarda en insertar todos los valores al arbol
        long start = System.currentTimeMillis();
        for (int i = 0; i < anIntArray.size(); i++) {
            //aTree.insert(anIntArray.get(i));
        }
        long finish = System.currentTimeMillis();

        return (finish - start);
    }


    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++){
            list.add(random.nextInt(10000));
        }
        return list;
    }
}
