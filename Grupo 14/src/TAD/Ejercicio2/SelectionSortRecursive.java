package TAD.Ejercicio2;

public class SelectionSortRecursive<T extends Comparable<? super T>> {
/* Not fully working
    public void selectionSort(T[] arrToSort, int n) { recurSelectionSort(arrToSort, n, 0);}

    // Recursive selection sort. n is size of array
    void recurSelectionSort(T[] arrToSort, int n, int index) {

        if (index == n)
            return;

        int k = minIndex(arrToSort);

        if (k != index){
            // swap
            T temp = arrToSort[k];
            arrToSort[k] = arrToSort[index];
            arrToSort[index] = temp;
        }
        // Recursively calling selection sort function
        recurSelectionSort(arrToSort, n, index + 1);
    }

    public int minIndex(T[] arr){
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[minIndex].compareTo(arr[i]) < 0){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        SelectionSortRecursive<String> sorterString = new SelectionSortRecursive<String>();
        SelectionSortRecursive<Integer> sorterInt = new SelectionSortRecursive<Integer>();

        Integer[] toSortInt = new Integer[300]; //We create a randomized Integer array of size 300
        Random r = new Random();
        for (int i = 0; i < 300; i++) { toSortInt[i] = r.nextInt(2000);}

        String[] toSortString = {"orange","apple", "banana", "lemon", "watermelon"};

        //We time the algorithm.
        long startTimeStr = System.nanoTime();
        sorterString.selectionSort(toSortString, 5);
        long endTimeStr = System.nanoTime();

        long durationStr = (endTimeStr - startTimeStr);  //In Nanoseconds

        System.out.println("Sorted string array in: " + durationStr + " nanoseconds. Sorted array: "+ Arrays.toString(toSortString));
        long startTimeInt = System.nanoTime();
        sorterInt.selectionSort(toSortInt,toSortInt.length);
        long endTimeInt = System.nanoTime();

        long durationInt = (endTimeInt - startTimeInt);  //In Nanoseconds
        System.out.println("Sorted Integer array of size 300 in: " + durationInt + " nanoseconds. Sorted array:" + Arrays.toString(toSortInt));

    }
    */
}
