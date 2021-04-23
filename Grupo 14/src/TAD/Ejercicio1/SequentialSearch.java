package TAD.Ejercicio1;

public class SequentialSearch {

    public static int seqSearch(int[] arrToSearch, int key) throws NotInArrayException {

        for (int i = 0; i < arrToSearch.length; i++) {
            {
                if (arrToSearch[i] == key) {
                    return i;
                }
            }
        }
        return -1;
    }

    //Test
    public static void main(String[] args) throws NotInArrayException {

        int[] arr =  {1,3,4,51,12,41,111};
        int key = 9;
        int indexFound = seqSearch(arr,key);

        if (indexFound >= 0){
            System.out.println("The index of " + key + " is: "+ indexFound);
        }
        else{ System.out.println("The key entered is not in the array");}
    }
}

