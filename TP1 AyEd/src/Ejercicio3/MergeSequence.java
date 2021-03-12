package Ejercicio3;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSequence<T extends Comparable<? super T>>  {
    //As we learnt to sort arrays, we could just create a third array and fill it with arr1 and arr2 and then sort the third.
    //Or just use Generic Arraylists

    //Solution to given task
    public ArrayList<T> merge(T[] firstSequence, T[] secondSequence) {
        int newSeqSize = firstSequence.length + secondSequence.length;
        ArrayList<T> mergedArrays= new ArrayList<>(); // I couldn't create a generic array, hence the arraylist

        int headC = 0;
        while(headC != newSeqSize) { //Refactor variable names to improve readability

                if (firstSequence.length != 0 && secondSequence.length != 0) {
                    int minSecondSequence = minIndex(secondSequence);
                    int minFirstSequence = minIndex(firstSequence);

                    T toAdd = minElement(secondSequence[minSecondSequence], firstSequence[minFirstSequence]);
                    mergedArrays.add(toAdd);

                    if (minElement(secondSequence[minSecondSequence], firstSequence[minFirstSequence]).compareTo(secondSequence[minSecondSequence]) == 0) {
                        secondSequence = ArrayUtils.remove(secondSequence, minSecondSequence); //ArrayUtils.remove comes from the library Apache Commons
                    } else {
                        firstSequence = ArrayUtils.remove(firstSequence, minFirstSequence);
                    }
                }
                else if(firstSequence.length == 0){
                    mergedArrays.add(secondSequence[minIndex(secondSequence)]);
                    secondSequence = ArrayUtils.remove(secondSequence, minIndex(secondSequence));
                }
                else{ mergedArrays.add(firstSequence[minIndex(firstSequence)]);
                    firstSequence = ArrayUtils.remove(firstSequence, minIndex(firstSequence));
                }
           headC++;
        }
        return mergedArrays;
    }


    public T minElement(T firstElement, T secondElement){

            if(firstElement.compareTo(secondElement) > 0) {
                return secondElement;
            } else { return firstElement;}
    }
    public int minIndex(T[] arr){
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[minIndex].compareTo(arr[i]) > 0){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        MergeSequence<String> merger = new MergeSequence<>();

        String[] firstSequence = {"apple", "banana", "orange", "peach", "watermelon"};
        String[] secondSequence = {"blueberry", "cherry", "cucumber","date", "fig"};


        System.out.println("The merged sequence is: " + merger.merge(firstSequence,secondSequence));


    }
}
