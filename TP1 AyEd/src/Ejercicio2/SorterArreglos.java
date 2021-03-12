package Ejercicio2;

public class SorterArreglos<T extends Comparable<? super T>> {

    SorterArreglos() { }

    public T[] bubbleSort(T[] array) {
        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swapElements(j, array); // Si este es mayor que el proximo, los cambio
                }
            }
        }
        return array;
    }

    private void swapElements(int index, T[] arr) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }

    public T[] selectionSort(T[] array)
    {
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++)
        {

            int minIndex = currentIndex;

            for (int i = currentIndex + 1; i < array.length; i++)
            {
                if (array[i].compareTo(array[minIndex]) < 0)
                {
                    minIndex = i; // Busco el menor de todos los que estan para adelante
                }
            }
            if (minIndex != currentIndex)
            {
                T temp = array[currentIndex];
                array[currentIndex] = array[minIndex];  // Si el menor es distinto del que estoy usando, los cambio
                array[minIndex] = temp;
            }
        }
        return array;
    }

    public T[] insertionSort(T[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int currentIndex = i;
            while (currentIndex > 0 && array[currentIndex - 1].compareTo(array[currentIndex]) > 0) // Mientras que este sea mayor que el anterior
            { // Cuando currentIndex llega a 0 corto
                T temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp; // Lo cambio por el anterior
                currentIndex--;
            }
        }
        return array;
    }

    public T[] insertionSortRecursivo(T[] array)
    {
        insertionSortRecursivo(array,1);
        return array;
    }

    public T[] insertionSortRecursivo(T[] array,int index){

        if (index<array.length) {
            if (index > 0 && array[index - 1].compareTo(array[index]) > 0) // Mientras que este sea mayor que el anterior
            { // Cuando currentIndex llega a 0 corto
                T temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp; // Lo cambio por el anterior
                return insertionSortRecursivo(array,--index); // Uso recursio para poner este elemento en su lugar
            }
            return insertionSortRecursivo(array, ++index); // Uso otra recursion, para escalar entre valores
        }
        return array;
    }
}
