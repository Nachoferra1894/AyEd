package Ej2;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el tamaño del arreglo");

        int N = myScanner.nextInt();  // Read user input
        Integer[] arrayToOrder = new Integer[N];
        for (int i = 0; i < N; i++) {
            arrayToOrder[i] = (int) ((Math.random() * 10000) + 1);
        }

        SorterArreglos<Integer> sorter = new SorterArreglos<Integer>(); // Lo hago de esta manera para poder demostrar el timer
        Integer[] secondArrayToOrder = arrayToOrder.clone();
        Integer[] thirdArrayToOrder = arrayToOrder.clone();
        Integer[] fourthArrayToOrder = arrayToOrder.clone();

        System.out.println("Conjunto a ordenar: " + Arrays.toString(arrayToOrder) + "\n");


        //Bubble Sort
        long start = System.currentTimeMillis();
        sorter.bubbleSort(arrayToOrder);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Bubble sort tardo: " + timeElapsed + "ms");
        System.out.println(Arrays.toString(arrayToOrder) + "\n");


        //Selection Sort
        start = System.currentTimeMillis();
        sorter.selectionSort(secondArrayToOrder);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Selection sort tardo: " + timeElapsed + "ms");
        System.out.println(Arrays.toString(secondArrayToOrder) + "\n");

        // Insertion
        start = System.currentTimeMillis();
        sorter.insertionSort(thirdArrayToOrder);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Insertion sort tardo: " + timeElapsed + "ms");
        System.out.println(Arrays.toString(thirdArrayToOrder) + "\n");

        // Insertion Recursivo
        start = System.currentTimeMillis();
        sorter.insertionSortRecursivo(fourthArrayToOrder);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Insertion sort recursivo tardo: " + timeElapsed + "ms");
        System.out.println(Arrays.toString(thirdArrayToOrder) + "\n");

    }
}
