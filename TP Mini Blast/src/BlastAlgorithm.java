public class BlastAlgorithm<T extends Comparable<? super T>>  {


    public double blast(char[] seqA, char[] seqB){
        double matches = 0;
        int seqLength = seqA.length; //Either seqA or seqB length as they have the same.

        int head = 0;
        while (head != seqA.length){
            if (seqA[head] == seqB[head]){
                matches++;
            }
            head++;
        }
        return (matches / seqLength)*100;
    }

    public double blastGenerics(T[] querySequence, T[] referenceSequence) { // Both sequences with same length
        int k = 0;
        for (int i = 0; i < querySequence.length; i++) {
            if (querySequence[i].compareTo(referenceSequence[i]) == 0) {
                k = k + 1;
            }
        }
        double z = k * 100 / querySequence.length;
        return z;
    }

}
