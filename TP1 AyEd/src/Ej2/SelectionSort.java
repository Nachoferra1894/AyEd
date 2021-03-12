package Ej2;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort<T extends Comparable<? super T>> {

    public void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void selectionSort(T[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;    // update the index of minimum element
                }
            }
            swap(arr, min, i);
        }
    }

    public static void main(String[] args) {
        SelectionSort<String> sorterString = new SelectionSort<String>();
        SelectionSort<Integer> sorterInt = new SelectionSort<Integer>();

        Integer[] toSortInt = new Integer[300]; //We create a randomized Integer array of size 300
        Random r = new Random();
        for (int i = 0; i < 300; i++) { toSortInt[i] = r.nextInt(2000);}

        String[] toSortString = {"orange","apple", "banana", "lemon", "watermelon"};

        //We time the algorithm.
        long startTimeStr = System.nanoTime();
        sorterString.selectionSort(toSortString);
        long endTimeStr = System.nanoTime();

        long durationStr = (endTimeStr - startTimeStr);  //In Nanoseconds

        System.out.println("Sorted string array in: " + durationStr + " nanoseconds. Sorted array: "+ Arrays.toString(toSortString));
        long startTimeInt = System.nanoTime();
        sorterInt.selectionSort(toSortInt);
        long endTimeInt = System.nanoTime();

        long durationInt = (endTimeInt - startTimeInt);  //In Nanoseconds
        System.out.println("Sorted Integer array of size 300 in: " + durationInt + " nanoseconds. Sorted array:" + Arrays.toString(toSortInt));

    }
}



