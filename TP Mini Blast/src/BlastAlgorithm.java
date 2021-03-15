public class BlastAlgorithm {


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

}
