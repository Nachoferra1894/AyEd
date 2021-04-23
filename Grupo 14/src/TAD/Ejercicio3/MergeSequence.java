package TAD.Ejercicio3;

//import org.apache.commons.lang3.ArrayUtils;
import java.util.ArrayList;

public class MergeSequence<T extends Comparable<? super T>>  {
    //As we learnt to sort arrays, we could just create a third array and fill it with arr1 and arr2 and then sort the third.
    //Or just use Generic Arraylists

    //We used apache Commons Lang3 library: https://search.maven.org/remotecontent?filepath=org/apache/commons/commons-lang3/3.11/commons-lang3-3.11.jar

    //Solution to given task
    public ArrayList<T> merge(T[] firstSequence, T[] secondSequence) {
        int newSeqSize = firstSequence.length + secondSequence.length;
        ArrayList<T> mergedArrays= new ArrayList<>(); // I couldn't create a generic array, hence the arraylist

        int headC = 0;
        while(headC != newSeqSize) {

                if (firstSequence.length != 0 && secondSequence.length != 0) {
                    int minIndex2 = minIndex(secondSequence);
                    int minIndex1 = minIndex(firstSequence);

                    T toAdd = minElement(secondSequence[minIndex2], firstSequence[minIndex1]);
                    mergedArrays.add(toAdd);

                    if (minElement(secondSequence[minIndex2], firstSequence[minIndex1]).compareTo(secondSequence[minIndex2]) == 0) {
                        //secondSequence = ArrayUtils.remove(secondSequence, minIndex2); //ArrayUtils.remove comes from the library Apache Commons
                    } else {
                        //firstSequence = ArrayUtils.remove(firstSequence, minIndex1);
                    }
                }
                else if(firstSequence.length == 0){
                    mergedArrays.add(secondSequence[minIndex(secondSequence)]);
                    //secondSequence = ArrayUtils.remove(secondSequence, minIndex(secondSequence));
                }
                else{ mergedArrays.add(firstSequence[minIndex(firstSequence)]);
                    //firstSequence = ArrayUtils.remove(firstSequence, minIndex(firstSequence));
                }
           headC++;
        }
        return mergedArrays;
    }


    public T minElement(T firstElement, T secondElement){ //Returns the smaller element between two generic ones

            if(firstElement.compareTo(secondElement) > 0) {
                return secondElement;
            } else { return firstElement;}
    }

    public int minIndex(T[] arr){ //Returns the index of the minimum element of an array
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[minIndex].compareTo(arr[i]) > 0){
                minIndex = i;
            }
        }
        return minIndex;
    }
}
