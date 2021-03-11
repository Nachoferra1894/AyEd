package Ej2;

public class SorterInts {


    SorterInts() { }

    public Integer[] bubbleSort(Integer[] array) {
        for (Integer i = array.length; i > 1; i--) {
            for (Integer j = 0; j < i - 1; j++) {
                if (array[j]>array[j + 1]) {
                    swapElements(j, array); // Si este es mayor que el proximo, los cambio
                }
            }
        }
        return array;
    }

    private void swapElements(Integer index, Integer[] arr) {
        Integer temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }

    public Integer[] selectionSort(Integer[] array)
    {
        for (Integer currentIndex = 0; currentIndex < array.length - 1; currentIndex++)
        {

            Integer minIndex = currentIndex;

            for (Integer i = currentIndex + 1; i < array.length; i++)
            {
                if (array[i]<array[minIndex])
                {
                    minIndex = i; // Busco el menor de todos los que estan para adelante
                }
            }
            if (minIndex != currentIndex)
            {
                Integer temp = array[currentIndex];
                array[currentIndex] = array[minIndex];  // Si el menor es distIntegero del que estoy usando, los cambio
                array[minIndex] = temp;
            }
        }
        return array;
    }

    public Integer[] insertionSort(Integer[] array)
    {
        for (Integer i = 1; i < array.length; i++)
        {
            Integer currentIndex = i;
            while (currentIndex > 0 && array[currentIndex - 1]>array[currentIndex])// Mientras que este sea mayor que el anterior
            { // Cuando currentIndex llega a 0 corto
                Integer temp = array[currentIndex];
                array[currentIndex] = array[currentIndex - 1];
                array[currentIndex - 1] = temp; // Lo cambio por el anterior
                currentIndex--;
            }
        }
        return array;
    }
}
