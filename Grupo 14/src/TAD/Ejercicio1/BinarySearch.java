package TAD.Ejercicio1;

public class BinarySearch {

    public static int search(int[] orderedSort, int toSearch) throws NotInArrayException {

        int middle = orderedSort.length%2;
        if (orderedSort[middle] == toSearch){
            return middle;
        }
        else if(orderedSort[middle] > toSearch){
            for (int i = middle - 1; i > 0; i--) {
                if (orderedSort[i] == toSearch){
                    return i;
                }
            }
        }
        else{
            for (int i = middle + 1; i < orderedSort.length; i++) {
                if (orderedSort[i] == toSearch){
                    return i;
                }
            }
        }
        return -1;
    }
    //Test
    public static void main(String[] args) throws NotInArrayException {

        int[] arrToSearch = {1,2,41,44,68,120};
        int toSearch = 9;
        // We measure the time taken by the algorithm
        long startTime = System.nanoTime();
        int indexResult = search(arrToSearch,toSearch);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  //In Nanoseconds

        System.out.println("The number " + toSearch + " is in the index: " + indexResult);
        System.out.println("Tiempo empleado: " + duration + " nanosegundos");
    }

}
